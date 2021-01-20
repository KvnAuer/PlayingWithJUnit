package MinOfThreePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinOfThreeTest {

	//Testing min1 method
	@Test
	public void testmin1_1() {
		int a = 1;
		int b = 3;
		int c = 3;
		int target = 1;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin1_2() {
		int a = 1;
		int b = 0;
		int c = 3;
		int target = 0;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test 
	public void testmin1_3() {
		int a = 1;
		int b = 3;
		int c = 0;
		int target = 0;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin1_4() {
		int a = 3;
		int b = 1;
		int c = 3;
		int target = 1;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin1_5() {
		int a = 0;
		int b = 1;
		int c = 3;
		int target = 0;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin1_6() {
		int a = 3;
		int b = 1;
		int c = 0;
		int target = 0;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin1_7() {
		int a = 2;
		int b = 2;
		int c = 3;
		int target = 2;
		int actual = MinOfThree.min1(a, b, c);
		assertEquals(target, actual);
	}
	
	
	//Testing min2
	
	@Test
	public void testmin2_1() {
		int a = 1;
		int b = 3;
		int c = 3;
		int target = 1;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin2_2() {
		int a = 1;
		int b = 0;
		int c = 3;
		int target = 0;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test 
	public void testmin2_3() {
		int a = 1;
		int b = 3;
		int c = 0;
		int target = 0;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin2_4() {
		int a = 3;
		int b = 1;
		int c = 3;
		int target = 1;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin2_5() {
		int a = 0;
		int b = 1;
		int c = 3;
		int target = 0;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	
	@Test
	public void testmin2_6() {
		int a = 3;
		int b = 1;
		int c = 0;
		int target = 0;
		int actual = MinOfThree.min2(a, b, c);
		assertEquals(target, actual);
	}
	

}
