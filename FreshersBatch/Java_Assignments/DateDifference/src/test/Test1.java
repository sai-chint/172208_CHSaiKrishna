package test;

import org.junit.Assert;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class Test1 {

	static DateDifferenceProvider diff;
	@Test
	public void testcase11() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011));
		Assert.assertEquals(dateDifference, 59);
		System.out.println("Done with test case 11 :");										
	}
	@Test
	public void testcase12() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012));
		Assert.assertEquals(dateDifference, 60);
		System.out.println("Done with test case 12 :");											
	}
	@Test
	public void testcase13() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012));
		Assert.assertEquals(dateDifference, 29);
		System.out.println("Done with test case 13 :");												
	}
	@Test
	public void testcase14() {
		long dateDifference = diff.getDateDifference(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012));
		Assert.assertEquals(dateDifference, 298);
		System.out.println("Done with test case 14 :");												
	}
	@Test
	public void testcase15() {
		long dateDifference = diff.getDateDifference(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012));
		Assert.assertEquals(dateDifference, 304);
		System.out.println("Done with test case 15 :");
	}
}
