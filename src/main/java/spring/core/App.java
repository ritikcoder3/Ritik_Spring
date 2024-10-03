package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.entity.Address;
import spring.core.entity.Employee;

public class App { 

	public static void main(String[] args) {
    ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Employee bean1= (Employee)ioc.getBean("emp1");
    System.out.println(bean1);
    
    System.out.println("------------------");
    
    Employee bean2= (Employee)ioc.getBean("emp2");
    System.out.println(bean2);

    System.out.println("------------------");
    
    Employee bean3= (Employee)ioc.getBean("emp3");
    System.out.println(bean3);
    
    
//    Address bean=(Address)ioc.getBean("add1");
//    System.out.println(bean2);
//    
//    System.out.println("------------------");
    
  
   
   

//   Employee bean1=ioc.getBean(Employee.class,"emp1");
//   System.out.println(bean1);
//    bean1.display();
    
    
	}

}
