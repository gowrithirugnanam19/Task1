package com.ex;
import org.junit.Test;
import static org.junit.Assert.assertEquals; // static import

import org.junit.After;
import org.junit.Before;
public class MyTest {
Calc c=new Calc();
//Calc c=null;
@Before
public void beforeTest1() {
	System.out.println("Task before Test1");
}
@Test
public void test1() {
	assertEquals(25,c.add(13,12));//25 is output and next is passing value if both match or not
}
@After
public void afterTest1() {
	System.out.println("Task after Test1");
}
@Test
public void test2() {
	assertEquals(27,c.cube(3));//if 27 is not put correct value it shows error or failure
}
}
