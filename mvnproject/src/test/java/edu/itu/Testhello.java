package edu.itu;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import mvntest.appTest;

import org.junit.Test;

public class Testhello {

 @Test(timeout = 10000)
 public void testprinthello() throws InterruptedException{
	 while(true){
		 
		 Assert.assertEquals(appTest.getHello(), "hello");
		 TimeUnit.MILLISECONDS.sleep(3000);
	 }
 }
		
}
