package onetoone_Exercise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Kisiler")
public class Person {
	
	@Id
	private int id;
	
	private String ad;
	
	private int yas;
	
	@OneToOne
	private Address adres;
	
	
	

	public Person() {
	
	}


	public Person(int id, String ad, int yas) {
		this.id = id;
		this.ad = ad;
		this.yas = yas;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public Address getAdres() {
		return adres;
	}


	public void setAdres(Address adres) {
		this.adres = adres;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", ad=" + ad + ", yas=" + yas + ", adres=" + adres + "]";
	}
	
	
	
	
	
	
	

}
