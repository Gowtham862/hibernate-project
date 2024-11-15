package Task;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	  private String type;
	  @OneToOne(cascade=CascadeType.ALL)
	  Laptop lap;
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Charger [id=" + id + ", brand=" + brand + ", type=" + type + "]";
	}
	public Charger(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}
	public Charger() {
		super();
	}
	  

}
