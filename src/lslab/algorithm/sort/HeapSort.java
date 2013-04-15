package lslab.algorithm.sort;

public class HeapSort<T extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			heapify(a,a.length-i);
			swap(a,0,a.length-i);			
		}
	}
	
	private void heapify(int[]a,int len){
		for(int i=len/2;i>=0;i--){
			if(2*i+1<=len-1 && a[i]<a[2*i+1])
				swap(a,i,2*i+1);
			if(2*i+2<=len-1 && a[i]<a[2*i+2])
				swap(a,i,2*i+2);
		}
	}
}