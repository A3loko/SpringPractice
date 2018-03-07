package aspectPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aspectPractice.service.Shape;

public class Main {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = context.getBean("shape",Shape.class);
		System.out.println(shape.getCircle().getName());
	}
}
