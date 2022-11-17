package junittestbxpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitfunctions obj = new junitfunctions();
		int a = 10;
		int b = 10;
		assertEquals(20,obj.add_num(a, b));
	}
	@Test
	public void test1() {
		junitfunctions obj = new junitfunctions();
		int a = 10;
		int b = 10;
		assertEquals(10,obj.add_num(a, b));
	}

}



