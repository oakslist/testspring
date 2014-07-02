package mytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Country {

	private Capital capital;

	public Country() {
		capital = Capital.getInstance();
	}

	public static void main(String[] args) {
//		Country Russia = new Country();
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Country Russia = (Country) ac.getBean("country");
        System.out.println(Russia);
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

}
