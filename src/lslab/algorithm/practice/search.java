package lslab.algorithm.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayCount = 10;
		int nth = arrayCount / 2;
		int[] a = new int[arrayCount];
		Random rnd = new Random();

		for (int i = 0; i < a.length; ++i) {
			a[i] = rnd.nextInt(arrayCount);
		}
		int key = rnd.nextInt(arrayCount);
		System.out.println(Arrays.toString(a));
		System.out.println(search_nth_recursion(nth, a, 0, a.length - 1));
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(key);
		System.out.println(Arrays.toString(a));
		System.out.println(binarysearch_recursion(key, a, 0, a.length - 1));
		System.out.println(search_linear(key, a));
		System.out.println(binarysearch(key, a));

	}

	public static int search_linear(int key, int[] a) {
		if (a == null || a.length <= 0)
			return -1;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	public static int search_nth_recursion(int t, int[] a, int p, int q) {
		if (p > q)
			return -1;
		int v=-1;
		while (p <= q) {
			int par = partition(a, p, q);
			System.out.println(Arrays.toString(a));
			if (par == t-1){
				v=a[par];
				break;
			}	
			else if (t-1 > par)
				p = par+1;
			else
				q = par-1;
		}

		return v;
	}

	public static int partition(int[] a, int p, int q) {
		if (p > q)
			return -1;
		int pivot = a[q];
		int index = p;
		for (int i = p; i < q; i++) {
			if (a[i] < pivot) {
				swap(a, i, index);
				index++;
			}
		}
		swap(a, index, q);
		return index;
	}

	public static int binarysearch_recursion(int key, int[] a, int p, int q) {
		if (a == null || a.length <= 0)
			return -1;
		if (p > q)
			return -1;
		int mid = (p + q) / 2;
		if (key == a[mid])
			return mid;
		else if (key > a[mid])
			return binarysearch_recursion(key, a, mid + 1, q);
		else
			return binarysearch_recursion(key, a, p, mid - 1);
	}

	public static int binarysearch(int key, int[] a) {
		if (a == null || a.length <= 0)
			return -1;
		int p = 0, q = a.length;
		int m = 0;
		while (p <= q) {
			m = (p + q) / 2;
			if (a[m] == key)
				return m;
			else if (key > a[m]) {
				p = m + 1;
			} else
				q = m - 1;
		}
		return -1;
	}
	
	public static void swap(int[] a, int i, int j) {
		if (0 == a.length || i > a.length - 1 || j > a.length - 1 || i < 0
				|| j < 0)
			return;
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}


}
