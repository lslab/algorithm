package test.lslab.algorithm.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import lslab.algorithm.sort.AbstractSort;
import lslab.algorithm.sort.SelectionSort;
import lslab.algorithm.sort.Sortable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SelectionSortTest {

	int[] a;
	Sortable<Integer> s;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = AbstractSort.getIntArray(10);
		s = new SelectionSort();
		s.setPrintFlag(true);
		System.out.println("=====before sorting=====");

		AbstractSort.print(a);
	}

	@After
	public void tearDown() throws Exception {

		System.out.println("=====after sorting=====");
		AbstractSort.print(a);
	}

	@Test
	public void testSortIntArray() {

		System.out.println("=====begin sorting=====");
		s.sort(a);
		System.out.println("======end sorting======");

	}

}
