package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double carprice;
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
	public double getCarprice() {
		return carprice;
	}
	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}
	public Car( String brand, double carprice) {
		super();
	
		this.brand = brand;
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", carprice=" + carprice + "]";
	}
	public Car() {
		super();
	}
	
	
	

}
