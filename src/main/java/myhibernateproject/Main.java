package myhibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		Phone p=new Phone("hp");
		
		Person person=new Person("name", p);
		
		et.begin();
		e.persist(p);
		e.persist(person);
		et.commit();
	}

}
