package lslab.algorithm.sort;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;++i){
			int minIndex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[minIndex]>a[j])
					minIndex=j;
			}
			if(minIndex != i)
				swap(a,minIndex,i);
			print(a);
		}
	}

	
}
