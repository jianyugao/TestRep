package edu.itu;

import junit.framework.Assert;
import mvntest.appTest;

import org.junit.Test;

public class Testhello {

 @Test
 public void testprinthello(){
	 
	 Assert.assertEquals(appTest.getHello(), "hello2");
 }
		
}
