package Manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class owner1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ownername;
	private long ownercontact;
	@Override
	public String toString() {
		return "owner1 [id=" + id + ", ownername=" + ownername + ", ownercontact=" + ownercontact + "]";
	}
	public owner1(String ownername, long ownercontact) {
		super();
		this.ownername = ownername;
		this.ownercontact = ownercontact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public long getOwnercontact() {
		return ownercontact;
	}
	public void setOwnercontact(long ownercontact) {
		this.ownercontact = ownercontact;
	}
	public owner1() {
		super();
	}
	

}
