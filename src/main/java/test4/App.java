package test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test4.CustomerService;

public class App {

	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"Spring-Customer2.xml");
		CustomerService customer = (CustomerService) appContext
				.getBean("customerService");
		customer.addCustomer();
		System.out.println("==========================================");
		customer.addCustomerReturnValue();
		System.out.println("==========================================");
//		customer.addCustomerThrowException();
//		System.out.println("==========================================");
		customer.addCustomerAround("javaxblog");
	}

}
