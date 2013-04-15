package lslab.algorithm.sort;

public class BubbleSort<T  extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

	//向下冒泡
	public void sort(T[] a) {
		for (int i =0;i< a.length-1; ++i) {
			for (int j = a.length-1; j > i; --j) {
				if (a[j-1].compareTo(a[j]) > 0) {
					swap(a, j - 1, j);
				}
				print(a);
			}
		}
	}
	
	//向上冒泡
	public void sort1(T[] a) {
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					swap(a, j + 1, j);
				}
				print(a);
			}
		}
	}
	
	public void sort(int[] a) {
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j]>a[j + 1]) {
					swap(a, j + 1, j);
				}
				print(a);
			}
		}
	}
}
