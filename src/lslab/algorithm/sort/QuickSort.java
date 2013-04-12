package lslab.algorithm.sort;

public class QuickSort<T extends Comparable<T>> extends AbstractSort<T>
		implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort(int[] a) {

		quicksort(a, 0, a.length - 1);
	}

	private void quicksort(int[] a, int p, int q) {
		
		int index = partition(a, p, q);
		if (p < index - 1)
			quicksort(a, p, index - 1);
		if (index+1 < q)
			quicksort(a, index+1, q);
		// quicksort(a, p, index);
		// quicksort(a, index+1, q);
		print(a);
	}

	// 此方法效率不高。但最好理解。
	private int partition1(int[] a, int p, int q) {
		int pivot = a[p];
		while (p < q) {
			while (p < q && a[q] >= pivot)
				--q;
			swap(a, p, q);
			while (p < q && a[p] <= pivot)
				++p;
			swap(a, p, q);
		}
		// System.out.println(q);
		return q;
	}

	//这种做法挺好玩的，只是效率不好说，返回的中间值，不再参与排序。
	public static int partition(int[] a, int p, int q) {
//		print(p);
//		print(q);
//		print(a);
		int pivot = a[q];
		int index = p;
		for (int i = p; i < q; i++) {
			if (a[i] < pivot) {
				swap(a, i, index);
				index++;
			}
		}
		swap(a, index, q);
//		print("index:" + index);
		return index;
	}

	// 此方法效率不高。但最好理解。
	// 对于相同的数处理有问题？
	public static int partition2(int[] a, int p, int q) {
		int pivot = a[(p + q) / 2];
		print(pivot);
		int i = p;
		int j = q;
		while (i <= j) {
			while (a[i] < pivot) {
				++i;
			}
			while (a[j] > pivot) {
				--j;
			}
			if (i <= j) {
				swap(a, i, j);
				++i;
				--j;
			}

		}
		// System.out.println(q);
		print("i:" + i);
		print("j:" + j);
		return i;
	}

	// 效率高。取中数，设置边界。java的快速排序也是不错的参考例子。
	// 但是对于只有2个长度时，中位数就会有问题。暂时不考虑此方法。
	private int partition_more(int[] a, int p, int q) {

		int pivot = med3(a, p, q);
		int i = p;
		int j = q - 1;
		while (true) {
			while (a[++i] < pivot) {

			}
			while (a[--j] > pivot) {

			}
			if (i < j)
				swap(a, i, j);
			else
				break;
		}
		swap(a, i, q - 1);
		return i;
	}

	private int med3(int[] a, int p, int q) {
		int mid = (p + q) / 2;

		if (a[p] > a[mid])
			swap(a, p, mid);
		if (a[p] > a[q])
			swap(a, p, q);
		if (a[mid] > a[q])
			swap(a, mid, q);

		swap(a, mid, q - 1);
		return a[q - 1];

	}

}
