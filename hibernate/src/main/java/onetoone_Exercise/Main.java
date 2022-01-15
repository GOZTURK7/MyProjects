package onetoone_Exercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {

		Person person1=new Person(1, "Gökhan", 33);
		Person person2=new Person(2, "Hatice", 32);
		Person person3=new Person(3, "Yusuf Burhan", 3);
		
		Address adres1=new Address(34,"İstanbul");
		Address adres2=new Address(24,"Erzincan");
		Address adres3=new Address(75,"Ardahan");
		
		person1.setAdres(adres1);
		person2.setAdres(adres2);
		person3.setAdres(adres3);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Address.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(person1);
		session.save(person2);
		session.save(person3);
		session.save(adres1);
		session.save(adres2);
		session.save(adres3);
		
		
		
		
		tx.commit();
		
		
		
	}

}
