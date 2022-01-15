package onetoone_Exercise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Adresler")
public class Address {
	@Id
	private int plaka;
	
	private String city;
	
	//@OneToOne(mappedBy = "adres")
	//private Person person;
	
	

	public Address() {
		
	}



	public Address(int plaka, String city) {
		this.plaka=plaka;
		this.city = city;
	}


	
	
	
	
	

	public int getPlaka() {
		return plaka;
	}



	public void setPlaka(int plaka) {
		this.plaka = plaka;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [plaka=" + plaka + ", city=" + city + "]";
	}



	
	
	
	

}
