package Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mains {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();


		Charger ch=e.find(Charger.class, 1);
		Laptop l=e.find(Laptop.class, 1);
		et.begin();
		e.remove(ch);
		et.commit();
		
	}

}
