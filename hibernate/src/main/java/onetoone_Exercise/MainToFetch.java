package onetoone_Exercise;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainToFetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Address.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		System.out.println(session.get(Person.class, 1));
		
		List<Object[]> arr = session.createQuery("from Person p join Address a on p.adres=a.plaka").getResultList();
		
		for (Object[] each : arr) {
			
			System.out.println(Arrays.toString(each));
			
		}
		
		
		List<Object[]> arr1 = session.createSQLQuery("Select id, ad, yas, city from Kisiler k join Adresler a on k.plaka_no=a.plaka").getResultList();
		
		for (Object[] each : arr1) {
			
			System.out.println(Arrays.toString(each));
			
		}
		
		
		
		tx.commit();
		sf.close();
		

	}

}
