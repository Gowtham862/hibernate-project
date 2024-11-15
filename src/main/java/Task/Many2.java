package Task;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2 {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		Employee e1=new Employee("gowtham",976543221);
		Employee e2=new Employee("vasanth",2345678);
		Employee e3= new Employee("joe",1234567);
		Company c=new Company("qspider",34567898);
		List<Employee>l1=new ArrayList<>();
//		l1.add(e1);
//		l1.add(e2);
		l1.add(e3);
		c.setE1(l1);
		et.begin();
//		e.persist(e1);
//		e.persist(e2);
   	e.persist(e3);
    	e.persist(c);//
	et.commit();
//		Employee e4=e.find(Employee.class,1);
//	    Company c1=e.find(Company.class, 1);
//	    c1.setE1(null);                                      //one to many
	                                                         // cm - mla 
	                                                         //world - countrys
	                                                         //pm-mp
	                                                         //
	                                                     
	                                                            
	                                                
//		et.begin();
//		e.remove(e4);
//		et.commit();
		
	}

}
