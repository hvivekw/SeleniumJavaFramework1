package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGRetryFailedDemo {

	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test2");
		//int i = 1/0;  //command to make this test case fail
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class) //
	public void test3(){
		System.out.println("I am inside test3");
		Assert.assertTrue(false); //command to make this test case fail
	}
}
