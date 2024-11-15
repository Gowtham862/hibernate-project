package ManytoMany;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("gowtham");
	EntityManager em= emf.createEntityManager();
	
	EntityTransaction et= em.getTransaction();	
	Actor a1=new Actor("vijay");
	Actor a2=new Actor("Kamalhassen");
	Actor a3=new Actor("surya");
Movie m1=new Movie("leo","crime");
Movie m2=new Movie("goat","horror");
Movie m3=new Movie("vikram","crime");
Movie m4=new Movie("friends","comedy");
List<Actor> l1=Arrays.asList(a1);
List<Actor> l2=Arrays.asList(a1);
List<Actor> l3=Arrays.asList(a2,a3);
List<Actor> l4=Arrays.asList(a3,a1);
m1.setActor(l1);

m2.setActor(l2);
m3.setActor(l3);
m4.setActor(l4);

et.begin();
em.persist(m1);
em.persist(m2);
em.persist(m3);
em.persist(m4);
et.commit();


}


}
