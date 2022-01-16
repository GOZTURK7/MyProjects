package embeddable_Exercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
//		AlienName name = new AlienName("Yusuf", "Burhan", "Öztürk");
//		Alien kisi = new Alien(101, name, "Green");
		
		//session.save(kisi);
		
		
		
		System.out.println(session.get(Alien.class, 101));
		
		
		
		
		tx.commit();
		session.close();
		System.out.println("1. SESSİON KAPATILDI....");
		
		
		Session session2 = sf.openSession();
		Transaction tx2 = session2.beginTransaction();
		System.out.println("2. SESSİON AÇILDI...");
		
		
		System.out.println(session2.get(Alien.class, 101));
		
		
		tx2.commit();
		session2.close();
	
		System.out.println("2. SESSİON KAPATILDI.");

//		
		sf.close();
		
		
		

	}

}
