package h05_caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Ogrenci.class)
				.addAnnotatedClass(H2_Kitap.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session1 = sf.openSession();
		
		Transaction tx1 = session1.beginTransaction();
		
		
		// id'si 111 olan öğrenciyi getir
		
		System.out.println(session1.get(H1_Ogrenci.class, 11));
		System.out.println(session1.get(H1_Ogrenci.class, 12));
		
		// 2. kez aynılarını çağırıyorum.
		
		System.out.println(session1.get(H1_Ogrenci.class, 11)); // burada cache'den çağırdı uzun uzun işlemler yapmadı çünkü yukarıda zaten bir kere çağırdık.
		System.out.println(session1.get(H1_Ogrenci.class, 12)); // burada cache'den çağırdı uzun uzun işlemler yapmadı çünkü yukarıda zaten bir kere çağırdık.

		
		tx1.commit();
		session1.close();
		System.out.println("Session1 Kapatıldı.");
		
		
		// aynı session'ı tekrar açıyoruz burada.
		session1 = sf.openSession();
		tx1 = session1.beginTransaction();
		
		System.out.println(session1.get(H1_Ogrenci.class, 11));
		
		tx1.commit();
		
		
//		// Ayrı session'ların aynı veriyi cache'den alabilmesi için L2 cache sisteminin acilmasi gerekir.
//		// Bunun için 
//		// 1) Aşağıda anotasyonların ilgili nesnelere eklenemsi gerekir.
//		//      @Cacheable
//        //      @Cache(region="H2_Kitap", usage=CacheConcurrencyStrategy.READ_WRITE)
//		
//		// 2) POM dosyasına Cache ile ilgili dependency'leri eklemek gerekir.
//		//     https://mvnrepository.com/artifact/org.hibernate/hibernate-ehcache
//		
//		// 3) cfg dosyasına asagidaki konfigürasyonları eklemek gerekir. 
//		//		<!-- Following 2 lines are for Second Level Cache -->
//		//   	<property name="hibernate.cache.use_second_level_cache">true</property>         
//		//		<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.internal.EhcacheRegionFactory</property>
//		//		<property name="hibernate.cache.provider_class">org.hibernate.cache.internal.EhcacheProvider</property>
	

		
		
		// Ayrı bir sessionda aynı veriye (111) erişmek istersek ne olur?
				// Cevap: Bu veri, diğer session'a ait oldugu icin bu session'nın cache'inde bulunmaz.
				// Bu sebeple ile yeniden veritabanına gitmek gerekecektir. yaptığımız ayarlarlar L2'hafızasından direkt gelecek.
		
				
				Session session2 = sf.openSession();
				Transaction tx2 = session2.beginTransaction();
				
				
				System.out.println(session2.get(H1_Ogrenci.class, 11));
				System.out.println(session2.get(H1_Ogrenci.class, 12));

				
				tx2.commit();
		
	}

}
