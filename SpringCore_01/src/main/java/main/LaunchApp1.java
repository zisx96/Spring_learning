package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationconfig.xml"); 
		
		Amaz a = app.getBean(Amaz.class);
		
		boolean status = a.buyTheCourse(444.4);
		
		if(status) {
			
			System.out.println("course purchased");
		}
		
		else {
			
			System.out.println("failed to buy the course");
		}
	}

}
