package Bydirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Country1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String cname;
	@OneToOne(cascade=CascadeType.ALL)
	private Capital c;
	public Country1(String cname) {
		super();
		this.cname = cname;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Capital getC() {
		return c;
	}
	public void setC(Capital c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", cname=" + cname + ", c=" + c + "]";
	}
	public Country1() {
		super();
	}
	

}
