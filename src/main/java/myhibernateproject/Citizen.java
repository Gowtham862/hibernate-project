package myhibernateproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@OneToOne
	 private Aadhar a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public Aadhar getA() {
		return a;
	}
	public void setA(Aadhar a) {
		this.a = a;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Citizen(String name, String email,Aadhar a) {
		super();
		
		this.name = name;
		this.email = email;
		this.a=a;
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Citizen() {
		super();
	}
	
	

}
