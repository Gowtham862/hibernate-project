package myhibernateproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long adharnumber;
	private String city;
	private long contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(long adharnumber) {
		this.adharnumber = adharnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Aadhar() {
		super();
	}
	public Aadhar(long adharnumber, String city, long contact) {
		super();
		this.adharnumber = adharnumber;
		this.city = city;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", adharnumber=" + adharnumber + ", city=" + city + ", contact=" + contact + "]";
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	

}
