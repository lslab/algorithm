package lslab.algorithm.sort;

public interface Sortable<T extends Comparable<T>> {
	public void sort(T[] a);
	public void sort(int[] a);
	public void setPrintFlag(boolean isPrint);
}
