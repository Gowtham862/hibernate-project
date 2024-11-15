package Manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.css.CSSStyleSheet;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
		
   
     car1 c1=e.find(car1.class, 4);
//     owner1 o=e.find(owner1.class, 3);
    c1.setO(null);
     et.begin();
     e.remove(c1);
    
     et.commit();
     
     
		

		
		
	}

}
