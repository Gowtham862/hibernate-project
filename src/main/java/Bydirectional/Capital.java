package Bydirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String city;
	@OneToOne(cascade=CascadeType.ALL)
	private Country1 c1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Country1 getC1() {
		return c1;
	}
	public void setC1(Country1 c1) {
		this.c1 = c1;
	}
	@Override
	public String toString() {
		return "Capital [id=" + id + ", city=" + city + ", c1=" + c1 + "]";
	}
	public Capital(String city) {
		super();
		this.city = city;
		
	}
	public Capital() {
		super();
	}
	

}
