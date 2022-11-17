package junittestbxpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		junitfunctions obj = new junitfunctions();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezxc",obj.add_str(a, b));
		
	}
	@Test
	public void test1() {
		junitfunctions obj = new jjunitfunctions();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezx",obj.add_str(a, b));
		
	}

}


