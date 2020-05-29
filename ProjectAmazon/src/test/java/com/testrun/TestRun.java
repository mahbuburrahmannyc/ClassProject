package com.testrun;

import com.generic.library.GenericClass;

public class TestRun extends GenericClass  {

	public static void main(String[] args) throws InterruptedException {
		
		
		TestRun obj=new TestRun();
		
		obj.getSetUp();
		obj.signIn();
		obj.tearDown();
		

	}

}
