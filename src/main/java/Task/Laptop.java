package Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String lapname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	
	public Laptop() {
		super();
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", lapname=" + lapname + ", brand=" + "]";
	}
	public Laptop(String lapname) {
		super();
		this.lapname = lapname;
		
	}
	

}
