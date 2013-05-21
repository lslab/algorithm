package lslab.algorithm.sort;

public class HeapSort<T extends Comparable<T>> extends AbstractSort<T>
		implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		buildheap(a);
		for (int i = a.length-1; i >=1; --i) {
			swap(a, 0, i);
			heapify(a, i-1, 0);
		}
	}

	private void heapify_old(int[] a, int len) {
		for (int i = len / 2; i >= 0; i--) {
			if (2 * i + 1 <= len - 1 && a[i] < a[2 * i + 1])
				swap(a, i, 2 * i + 1);
			if (2 * i + 2 <= len - 1 && a[i] < a[2 * i + 2])
				swap(a, i, 2 * i + 2);
		}
	}

	private void buildheap(int[] a) {
		for (int i = a.length / 2; i >= 0; --i) {
			heapify(a, a.length - 1, i);
		}

	}

	private void heapify(int[] a, int max, int idx) {

		int left = 2 * idx + 1;
		int right = 2 * idx + 2;
		int largest = idx;
		if (left <= max && a[idx] < a[left])
			largest = left;
		if (right <= max && a[largest] < a[right])
			largest = right;
		if (idx != largest) {
			swap(a, idx, largest);
			heapify(a, max, largest);
		}
	}

}