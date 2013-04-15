package lslab.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public abstract class AbstractSort<T extends Comparable<T>> implements
		Sortable<T> {

	public static boolean isPrint = false;
	public static int maxInt = 1000;

	@Override
	public abstract void sort(T[] a);

	@Override
	public abstract void sort(int[] a);

	public void setPrintFlag(boolean isPrintFlag) {
		isPrint = isPrintFlag;
	}

	public void swap(T[] a, int i, int j) {
		if (0 == a.length || i > a.length - 1 || j > a.length - 1 || i < 0
				|| j < 0)
			return;
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void swap(int[] a, int i, int j) {
		if (0 == a.length || i > a.length - 1 || j > a.length - 1 || i < 0
				|| j < 0)
			return;
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public void print(T[] a) {
		if (isPrint)
			System.out.println(Arrays.toString(a));
	}

	public static void print(int[] a) {
		if (isPrint)
			System.out.println(Arrays.toString(a));
	}

	public static void print(Object a) {
		if (isPrint)
			System.out.println(a.toString());
	}

	public static int[] getIntArray(int size) {
		int[] a = new int[size];
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(maxInt);
			// a[i]=2;
		}
		return a;

	}

	public static Integer[] getIntegerArray(int size) {
		// T[] a = (T[]) Array.newInstance(type, lenArray);
		Integer[] a = new Integer[size];
		Random rd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(maxInt);
		}
		return a;
	}

}
