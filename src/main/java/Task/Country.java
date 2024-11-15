package Task;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String country;
	private String capital;
	 @OneToMany(cascade = CascadeType.ALL)
	  private List<States> l;
	
	public int getId() {
		return id;
	}
	public List<States> getL() {
		return l;
	}
	public void setL(List<States> l) {
		this.l = l;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public Country(String country, String capital) {
		super();
		this.country = country;
		this.capital = capital;
		
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", capital=" + capital + ", nationalflag="  
				+ "]";
	}
	public Country() {
		super();
	}


}
