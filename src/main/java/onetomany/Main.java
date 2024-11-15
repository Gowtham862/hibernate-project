package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("gowtham");
		EntityManager e=em.createEntityManager();
		EntityTransaction et=e.getTransaction();
//		Car c=new Car("bmw",50000);
//		Car c1=new Car("alto",100000);
		Owner owner=new Owner("kalai",8906427);
		List<Car> cars=new ArrayList<>();
		//Car c=new Car("porche",5000000);
	//	Car c1=new Car("venue",6000); 
//		cars.add(c);
//		cars.add(c1);
		//owner.setCars(cars);
		Owner o=e.find(owner.getClass(), 3);
		Car c=e.find(Car.class, 3);
		Car c1=e.find(Car.class,4);
		o.getCars().add(c);
		o.getCars().add(c1);
		et.begin();
		e.merge(o);
		et.commit();
		
	}

}
