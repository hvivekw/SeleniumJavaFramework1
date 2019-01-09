package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore //if u want to ignore inside all tests inside class
public class TestNGIgnoreDemo {

// @Ignore - if u want to ignore specific test
	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test2");
	}
}
