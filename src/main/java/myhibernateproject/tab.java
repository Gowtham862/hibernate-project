package myhibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class tab {
	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gowtham");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
	//save an object	
//		et.begin();
//		em.persist(u1);
//		et.commit();
		//fetch the data in database
//		Users d=em.find(Users.class,1);
//		System.out.println(d);
		//update the data
//		Users d=em.find(Users.class,1);
//		d.setName("gowtham");
//		et.begin();
//		em.merge(d);
//		et.commit();
		//remove the data from the database
//		Users d=em.find(Users.class,2);
//		et.begin();
//		em.remove(d);
//		et.commit();
		Users d1=new Users("vasanth",16);
		et.begin();
		em.persist(d1);
		et.commit();
		
	}

}

