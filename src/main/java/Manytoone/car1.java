package Manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class car1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String carname;
	 private long carprice;
	 @ManyToOne(cascade = CascadeType.ALL)
	 private owner1 o;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public car1() {
		super();
	}
	public car1(String carname, long carprice) {
		super();
		this.carname = carname;
		this.carprice = carprice;
		
	}
	@Override
	public String toString() {
		return "car1 [id=" + id + ", carname=" + carname + ", carprice=" + carprice + ", o=" + o + "]";
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public long getCarprice() {
		return carprice;
	}
	public void setCarprice(long carprice) {
		this.carprice = carprice;
	}
	public owner1 getO() {
		return o;
	}
	public void setO(owner1 o) {
		this.o = o;
	}
	 

}
