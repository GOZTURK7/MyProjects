package embeddable_Exercise;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Alien {
	
	@Id
	private int id;
	
	private AlienName name;
	
	private String color;

	public Alien() {}

	public Alien(int id, AlienName name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlienName getName() {
		return name;
	}

	public void setName(AlienName name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	
	

}
