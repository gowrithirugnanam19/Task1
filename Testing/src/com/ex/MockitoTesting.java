package com.ex;
//version error
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTesting {
CalculatorService cserv=Mockito.mock(CalculatorService.class);
Calculator c=new Calculator(cserv);
@Test
public void test1() {
	assertEquals(25,c.addOperation(12,13));
	when(null).thenReturn(c);
 }
}
