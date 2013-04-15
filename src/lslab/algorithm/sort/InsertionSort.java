package lslab.algorithm.sort;

public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1;i<a.length;++i){
			int j=i;
			int tmp=a[i];
			while(j>0 && tmp<a[j-1]){
				swap(a,j-1,j);
				--j;
			}
			if(j != i)
				a[j]=tmp;
			print(a);
		}
	}
	
}
