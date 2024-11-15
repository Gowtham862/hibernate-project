package myhibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mains {
     public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
	
		//Aadhar a=e.find(Aadhar.class, 3);
//		Citizen c=new Citizen("kishore","kishore@123gmail.com",null);
//		Citizen c=e.find(Citizen.class, 1);
//		Aadhar a=new Aadhar(987654333,"palani",908643222);
//		c.setA(a);
//	
//		et.begin();
//	
//         e.persist(a);
//         e.merge(c);
//		et.commit();
		Aadhar a=e.find(Aadhar.class, 2);
		Citizen c=e.find(Citizen.class,1);
		c.setA(a);
		et.begin();
		e.merge(c);
		et.commit();
		
		
		//c.setA(a);
		
		
		//et.begin();
	//	e.merge(c);
	     
		//e.persist(a);
//		e.persist(c);
		//et.commit();
	}

}
