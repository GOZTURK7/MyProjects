package h02_embeddable;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h02_embeddable.H1_Ogrenci;

public class H3_SaveFetch {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Ogrenci.class).buildSessionFactory();
				
			
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			
//			
//			H2_Dersler ders1 = new H2_Dersler("MUZIK", "MATEMATIK");
//			H1_Ogrenci ogrenci1 = new H1_Ogrenci(111, "Islam Gunduz", 100, ders1);
//			session.save(ogrenci1);
//			
//			
//			H1_Ogrenci ogrenci2 = new H1_Ogrenci(222, "Kurşat Turgut",99, new H2_Dersler("BEDEN", "FIZIK"));
//			session.save(ogrenci2);
			
			
			// Fetch İşlemi
			
			System.out.println(session.get(H1_Ogrenci.class, 111));
			
			
			
			// Delete;
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Silmek İstediğiniz No'yu giriniz: ");
//			int no = scan.nextInt();
//		
//			
//			session.delete(session.get(H1_Ogrenci.class, no)); // delete from ogrenciler where ogrId=111
			
			
			// Update;
			
			//session.get(H1_Ogrenci.class, 222).setAd("Gökhan Öztürk");
			
			
			
			
		
			tx.commit();
			sf.close();
			session.close();
			
		
		
	}

}
