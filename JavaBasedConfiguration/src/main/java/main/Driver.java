package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Car;
import demo.Employee;
import demo.Person;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
//		Person person = (Person) con.getBean("person");
//		Car car = (Car) con.getBean("car");
//		car.engine.run();
//		System.out.println(person);
//		System.out.println(car);
		
		Employee e = (Employee) con.getBean("getEmployee");
		System.out.println(e);
	}
}
