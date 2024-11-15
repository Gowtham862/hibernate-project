package Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String statename;
	private String statecapital;
	@OneToOne
	ChiefMinister cm;
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
	@Override
	public String toString() {
		return "State [id=" + id + ", statename=" + statename + ", statecapital=" + statecapital + "]";
	}
	public State(String statename, String statecapital) {
		super();
		
		this.statename = statename;
		this.statecapital = statecapital;
	}
	public ChiefMinister getCm() {
		return cm;
	}
	public void setCm(ChiefMinister cm) {
		this.cm = cm;
	}
	public State(ChiefMinister cm) {
		super();
		this.cm = cm;
	}
	public State() {
		super();
	}

}
