package h07_crudProje;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMetodlar {

	private static SessionFactory sf;

	public void sessionFactoryOlustur() {

		try {

			Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Personel.class);
			sf = con.buildSessionFactory();

		} catch (Throwable e) { // Oturum açmak veya yanlış gidebilecer herşeyi kesinlikle ele almak istediğiniz
								// bir iş parcacığının en yüksek "tümünü yakala"düzeyi;
			System.out.println("Session Factory Oluşturulurken Hata Oluştu " + e);
			throw new ExceptionInInitializerError(e); // tercihen bunu yada üsttekini
		}

	}

	// veritabanına bir personel ekleyen metod ekleyeyim (insert)

	public void personelEkle(String ad, String soyad, int maas) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Personel personel = new Personel(ad, soyad, maas);
			session.save(personel);
			tx.commit();

		} catch (HibernateException e) {
			System.out.println(e);
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace(); // exception olan satırı göster uzun açıklama yap.
		} finally { // herhalukarda yani catch olsun olmasın çalış.
			session.close();
		}

	}

	// VERİTABANINDAN PERSONEL SİLEN METOD;

	public void idIlePersonelSil(long personelId) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Personel personel = session.get(Personel.class, personelId);

			if (personel == null) {
				System.out.println(personelId + " nolu kişinin kaydı bulunamamıştır.");
			} else {
				session.delete(personel);
				tx.commit();
				System.out.println(personelId + "'nolu kişinin kaydı silinmiştir.");
				System.out.println("silinen " + personel);
			}
		} catch (HibernateException e) {
			System.out.println(e);
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace(); // exception olan satırı göster uzun açıklama yap.
		} finally { // herhalukarda yani catch olsun olmasın çalış.
			session.close();
		}

	}

	// İD İLE BİR KAYDIN MAAŞ BİLGİSİNİ GÜNCELLEYEN METHOD (UPDATE):

	public void idIleMaasGuncelle(long personelId, int maas) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Personel personel = session.get(Personel.class, personelId);

			if (personel == null) {

				System.out.println(personelId + " nolu kişinin kaydı bulunamamıştır.");

			} else {

				personel.setMaas(maas); // set ile tabloyu güncelleyebiliyoruz.
				tx.commit();
				System.out.println(personelId + "'nolu kişinin maaşı güncellenmiştir.");
				System.out.println("Yeni Maaş: " + personel.getMaas());

			}

		} catch (HibernateException e) {
			System.out.println(e);
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace(); // exception olan satırı göster uzun açıklama yap.
		} finally { // herhalukarda yani catch olsun olmasın çalış.
			session.close();
		}

	}
	
	// VERİTABANINDAN TÜM KAYITLARI LİSTELEYEN METOD (READ) // bütün kişilerin listesini getirmek JPA ile uzun sürer
	// bu yüzden HQL ile getirelim. select * HQL sorgusunda yazılmaz from <classname> şeklinde yazılır.
	public void tumPersoneliListele() {
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			List<Personel> liste = session.createQuery("from Personel").getResultList(); // HQL query olduğu çin class ismini yazdık 'Personel' diye
												// Personel şeklinde büyük küçük harf duyarlı dikkatli olmak gerek.
			
			liste.forEach(System.out::println);
			
			tx.commit();
			
			
		}catch (HibernateException e) {
			System.out.println(e);
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace(); // exception olan satırı göster uzun açıklama yap.
		} finally { // herhalukarda yani catch olsun olmasın çalış.
			session.close();
		}
	}
	
	
public void sil() {
		
		
		Session session = sf.openSession();
		 
		Transaction	tx = session.beginTransaction();
		
	   Scanner scan=new Scanner(System.in);
	   System.out.println("lütfen silmek istediğiniz kişinin id sini giriniz");
	   long no =scan.nextLong();

		
      Personel personel = session.get(Personel.class, no);
			
			if(personel == null) {
				System.out.println(no + " nolu kisinin kaydi bulunamamistir.");
			}else {
				session.delete(personel);
				tx.commit(); //önce silinmeyi kaydet sonra syso ile göster
				System.out.println(no + " nolu kisinin kaydi silinmistir.");
			}
			scan.close();
			session.close();
	}
	
	
	
	

}
