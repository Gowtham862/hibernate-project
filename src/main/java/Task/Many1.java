package Task;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many1 {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		Country c=new Country("india","delhi");
//		States s=new States("tamilnadu","chennai");
//		States s1=new States("rajasthan","jaipur");
//		List<States> l1=new ArrayList<>();
//		l1.add(s);
//		l1.add(s1);
//		c.setL(l1);
//		et.begin();
//		e.persist(c);
//		et.commit();
		States s=e.find(States.class, 2);
		s.setStatecapital("jaipur");
		 et.begin();
		 e.merge(s);
		 et.commit();
		
	}

}
