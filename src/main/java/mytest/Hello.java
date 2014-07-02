package mytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	private String s;
	private String who;
	private int year;
	
	public Hello(String str, int year, String who) {
		this.s = str;
		this.year = year;
		this.who = who;
	}
	
	public Hello(String str) {
		this.s = str;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void sayHi() {
		System.out.println(who + " said " + s);
	}

	public static void main(String[] args) {
		// Hello h = new Hello("Hi!!!");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "config.xml" }); //show config file
		Hello h = (Hello) ac.getBean("hello");// set id bean
		h.sayHi();
	}
}
