package test;

import org.junit.Assert;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class Test2 {
	static DateDifferenceProvider diff;
	@Test
	public void testcase1() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(06, 04, 2011));
		Assert.assertEquals(dateDifference, 0);
		System.out.println("Done with test case 1 :");
	}
	@Test
	public void testcase2() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 04, 2011));
		Assert.assertEquals(dateDifference, 12);
		System.out.println("Done with test case 2 :");
	}

	@Test
	public void testcase3() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011));
		Assert.assertEquals(dateDifference, 42);
		System.out.println("Done with test case 3:");
	}
	
	@Test
	public void testcase4() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011));
		Assert.assertEquals(dateDifference, 73);
		System.out.println("Done with test case 4 :");		
	}
	
	@Test
	public void testcase5() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011));
		Assert.assertEquals(dateDifference, 256);
		System.out.println("Done with test case 5 :");			
	}
	
	@Test
	public void testcase6() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012));
		Assert.assertEquals(dateDifference, 622);
		System.out.println("Done with test case 6 :");				
	}
	
	@Test
	public void testcase7() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013));
		Assert.assertEquals(dateDifference, 987);
		System.out.println("Done with test case 7 :");					
	}
	
	@Test
	public void testcase8() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113));
		Assert.assertEquals(dateDifference, 37511);
		System.out.println("Done with test case 8 :");						
	}
	
	@Test
	public void testcase9() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413));
		Assert.assertEquals(dateDifference, 147084);
		System.out.println("Done with test case 9 :");						
	}
	@Test
	public void testcase10() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813));
		Assert.assertEquals(dateDifference, 293181);
		System.out.println("Done with test case 10 :");									
	}
}
