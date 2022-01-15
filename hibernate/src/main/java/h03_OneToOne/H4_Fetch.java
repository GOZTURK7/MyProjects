package h03_OneToOne;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Kisi.class)
				.addAnnotatedClass(H2_Gunluk.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		// SORU 1 : id'si 101 olan kişinin bilgilerini getir.
		
		System.out.println("1. soru : "+ session.get(H1_Kisi.class, 101));
		
		
		// SORU 2 : id=12 olan günlüğün bilgilerini getir.
		
		System.out.println("2. soru : "+ session.get(H2_Gunluk.class, 12));

		
		// SORU 3: GÜNLÜK CLASS'INDAKİ BÜTÜN VERİLERİ SORGULA;
		
		//gunluk class ındaki bütün verileri sorgula

		for (int i = 12; i < 15; i++) {
		System.out.println("tercih edilmeyen yol"+session.get(H2_Gunluk.class,i));	
			 }

		// iki tablodaki kayıtların hepsini sorgula hibernate ile
		List<Object[]> liste= session.createQuery("from H1_Kisi k join H2_Gunluk g on  k.kisiId=g.kisi").getResultList();

		liste.forEach((x)-> System.out.println(Arrays.toString(x))); 
	
		
//		TERCİH EDİLMEYEN YOL JPA'NIN YÖNTEMİ,
//		for(int i =12; i < 15; i++) {
//			System.out.println("Tercih Edilmeyen Yol: "+session.get(H2_Gunluk.class, i));
//		}
		
		//SORU 4:  Kisiler ve Gunlukler tablolarindaki ortak olan (one to one ile birebir bağladığımız) kayıtların,
//		// Kisi adi, gunluk yazisi(yazilar) ve kisi yası (kisiYas) bilgilerini sorgulayiniz.
		
		String sorgu = " select k.kisi_ad , g.owner, k.kisiYas"
				+ " from kisiler k inner join gunlukler g"
				+ " on k.kisi_id= g.bağlanti";

		List<Object[]> sonuc= session.createSQLQuery(sorgu).getResultList();

		for(Object[] each: sonuc) {
			System.out.println(Arrays.toString(each));
			
		} 
		
		
		// ÖDEV :
		List<Object[]> liste1 =  session.createQuery("select k.kisiAd, g.owner, k.kisiYas from H1_Kisi k join H2_Gunluk g on k.kisiId = g.kisi").getResultList();
		for(Object[] each: liste1) {
			System.out.println(Arrays.toString(each));
			
		} 
		

	
		
		//tx.commit();
		
		
		
	}

}
