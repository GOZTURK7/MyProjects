package h06_ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class H4_Fetch {

	public static void main(String[] args) {


		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class).addAnnotatedClass(H2_Kitap.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		
		// SORU 1: İD'si 1111 olan öğrenciyi getir
		System.out.println("1111 Nolu Öğrenci: "+session.get(H1_Ogrenci.class, 1111));
		
		
		// SORU 2: id'si 101 olan kitabı getir.
		System.out.println(session.get(H2_Kitap.class, 101));
		
		// SORU 3: adı "math book" olan kitabı getir.
		// HQL Query;
		H2_Kitap kitap = (H2_Kitap) session.createQuery("from H2_Kitap k where k.book='math book'").getSingleResult();
		
		System.out.println(kitap);
		
		
		// SORU 4: Adı "Ali Can" olan öğrenciyi getirin. Kitapları da görmek istiyorum.HQL yazıyoruz, from classismi yazılır.
		
		String hqlQuery = "from H1_Ogrenci o WHERE o.name = 'Ali Can'";
		
		Object sorgu = session.createQuery(hqlQuery).getSingleResult();
		
		System.out.println("Ali Can :" + sorgu);
		
		
		// SORU 5: sadece Student isimlerini getir:
		
		List<H1_Ogrenci> ogrenciler = session.createQuery("from H1_Ogrenci").getResultList();
		
		for (H1_Ogrenci each : ogrenciler) {
			
			System.out.println(" Ogrenci: "+each.getName());
			
		}
		
		
		// 2. YOL:
		List<Object> ogrenciler1 = session.createQuery("SELECT o.name from H1_Ogrenci o").getResultList();
		System.out.println("2. YOL :"+ogrenciler1);
		
		
		
		// SORU 6: kitap isimlerini getir.
		List<Object> kitaplar = session.createQuery("select k.book from H2_Kitap k").getResultList();
		
		System.out.println(kitaplar);
		
		
		tx.commit();
		sf.close();
		session.close();
		
		
		
		
		
	}

}
