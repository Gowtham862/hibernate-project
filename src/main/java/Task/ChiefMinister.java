package Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChiefMinister {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY )
       private 	int id;
       private String cmname;
       private int cmcontactnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCmname() {
		return cmname;
	}
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public int getCmcontactnumber() {
		return cmcontactnumber;
	}
	public void setCmcontactnumber(int cmcontactnumber) {
		this.cmcontactnumber = cmcontactnumber;
	}
	public ChiefMinister(String cmname, int cmcontactnumber) {
		super();
		
		this.cmname = cmname;
		this.cmcontactnumber = cmcontactnumber;
	}
	public ChiefMinister() {
		super();
	}
	@Override
	public String toString() {
		return "ChiefMinister [id=" + id + ", cmname=" + cmname + ", cmcontactnumber=" + cmcontactnumber + "]";
	}
	

}
