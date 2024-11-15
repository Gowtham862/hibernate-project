package Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		
        State s=new State("Rajasthan","jaipur");
         ChiefMinister cm=new ChiefMinister("vasanth",907876);
//		 ChiefMinister cm=e.find( ChiefMinister.class,1);
//		 State s=e.find(State.class, 1);
		    s.setCm(cm);
		 
          et.begin();
          e.persist(s);
          e.persist(cm);
          et.commit();
         
         

	}

}
