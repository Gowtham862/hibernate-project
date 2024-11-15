package Task;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class States {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	private String statename;
	private String statecapital;
	 
	public States(String statename, String statecapital) {
		super();
		this.statename = statename;
		this.statecapital=statecapital;
	
		
	}
	@Override
	public String toString() {
		return "States [id=" + id + ", statename=" + statename + ", statecapital=" + statecapital + ", l=" + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getStatecapital() {
		return statecapital;
	}
	public void setStatecapital(String statecapital) {
		this.statecapital = statecapital;
	}
	
	public States() {
		super();
	}
	  
	 

}
