package Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ename;
	private long cno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public Employee(String ename, long cno) {
		super();
		this.ename = ename;
		this.cno = cno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", cno=" + cno + "]";
	}
	public Employee() {
		super();
	}
	
	

}
