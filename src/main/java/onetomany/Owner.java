package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private int ownerid;
     private String ownername;
     private long ownnercno;
     @OneToMany(cascade = CascadeType.ALL)
     private List<Car> cars;
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public Owner(List<Car> cars) {
		super();
		this.cars = cars;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public long getOwnnercno() {
		return ownnercno;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public void setOwnnercno(long ownnercno) {
		this.ownnercno = ownnercno;
	}
	public Owner( String ownername, long ownnercno) {
		super();
	
		this.ownername = ownername;
		this.ownnercno = ownnercno;
	}
	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerid + ", ownername=" + ownername + ", ownnercno=" + ownnercno + "]";
	}
	public Owner() {
		super();
	}
     
     

}
