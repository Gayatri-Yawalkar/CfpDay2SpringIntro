package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.component.DemoBean;
import com.example.demo.component.EmpBean;
@SpringBootApplication
public class Day2LoggerApplication {
	public static final Logger logger=LoggerFactory.getLogger(Day2LoggerApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring concept Demo");
		ApplicationContext context=SpringApplication.run(Day2LoggerApplication.class,args);
		  logger.debug("Checking context:{}",context.getBean(DemoBean.class));
		  DemoBean demoBean=context.getBean(DemoBean.class);
		  System.out.println("Demo Bean="+demoBean.toString());
		  logger.debug("\nExample Using Autowired Annotation"); 
		  EmpBean empBean=context.getBean(EmpBean.class); 
		  System.out.println("Emp Bean="+empBean.toString());
		  empBean.setEid(101);
		  empBean.setEname("Prakash"); 
		  empBean.showEmployeeDetails();
		
	}

}
