package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationconfig.xml"); 
		
		DefaultListableBeanFactory bean = new DefaultListableBeanFactory();
	     
	    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bean);
	     
	    reader.loadBeanDefinitions("applicationconfig.xml");
	    
	    Amaz a = bean.getBean(Amaz.class);
		
		boolean status = a.buyTheCourse(444.4);
		
		if(status) {
			
			System.out.println("course purchased successfully");
		}
		
		else {
			
			System.out.println("failed to buy the course");
		}
	}

}
