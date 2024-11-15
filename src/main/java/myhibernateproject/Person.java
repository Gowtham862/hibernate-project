package myhibernateproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne
	private Phone p;
	public Person(String name, Phone p) {
		super();
		this.name = name;
		this.p = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Phone getP() {
		return p;
	}
	public void setP(Phone p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", p=" + p + "]";
	}
	public Person() {
		super();
	}


}
