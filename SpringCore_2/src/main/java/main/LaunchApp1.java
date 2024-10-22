package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationconfig.xml"); 
		
		 DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
	        
	     // Create an XmlBeanDefinitionReader
	     XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(beanFactory);
	     
	     xmlReader.loadBeanDefinitions("applicationconfig.xml");
		
		boolean status = a.buyTheCourse(444.4);
		
		if(status) {
			
			System.out.println("course purchased successfully");
		}
		
		else {
			
			System.out.println("failed to buy the course");
		}
	}

}
