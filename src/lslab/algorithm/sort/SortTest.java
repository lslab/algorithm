package lslab.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

	public static void main(String[] args) {
		//Sortable<Integer> bs = new BubbleSort<Integer>();
		//Sortable<Integer> s = new SelectionSort<Integer>();
		//Sortable<Integer> s = new InsertionSort<Integer>();
		//Sortable<Integer> s = new MergeSort<Integer>();
		//Sortable<Integer> s = new QuickSort<Integer>();
		Sortable<Integer> s = new HeapSort<Integer>();
		s.setPrintFlag(true);
		//Integer[] a = new Integer[10];
		int[] a = new int[20];
		Random rd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(1000);
//			a[i]=2;
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(QuickSort.partition(a, 0, a.length-1));
//		System.out.println(Arrays.toString(a));
		
		System.out.println("=====before sorting=====");
		System.out.println(Arrays.toString(a));
		
		System.out.println("=====begin sorting=====");
		s.sort(a);
		System.out.println("======end sorting======");
		
		System.out.println("=====after sorting=====");
		System.out.println(Arrays.toString(a));
		
		
	}

}
