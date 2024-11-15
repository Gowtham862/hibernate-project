package Task;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String cname;
	private long cno;
	@OneToMany
	List<Employee>e1;
	@Override
	public String toString() {
		return "Company [id=" + id + ", cname=" + cname + ", cno=" + cno + ", e1=" + e1 + "]";
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
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public List<Employee> getE1() {
		return e1;
	}
	public void setE1(List<Employee> e1) {
		this.e1 = e1;
	}
	public Company(String cname, long cno) {
		super();
		this.cname = cname;
		this.cno = cno;
	}
	public Company() {
		super();
	}
	
	

}
