package td6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testRomain {
	
/*	public void Test() throws Exception{
		Romain rome =new Romain("IV");
		assertEquals(rome.convert(),4);
	}*/
	@org.junit.Test
	public void Test2() throws Exception{
		Romain rome =new Romain("IV");
		assertEquals(rome.convert(10),"X");
	}
}
