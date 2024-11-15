package Bydirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Task.Country;

public class Mains {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		
//		Country1 c=new Country1("india");
//		Capital c1=new Capital("delhi");
		
		Capital c=e.find(Capital.class, 2);
		//Country1 c1=e.find(Country1.class, 1);
		
		et.begin();
		e.merge(c);
		et.commit();
		
		
		
	}

}
