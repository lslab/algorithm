package lslab.algorithm.sort;

public class MergeSort<T extends Comparable<T>> extends AbstractSort<T>
		implements Sortable<T> {

	@Override
	public void sort(T[] a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort(int[] a) {
		mergesort(a,0,a.length-1);
	}
	
	//Ô­µØ¹é²¢ÅÅÐò
	private void mergesort(int[] a,int p,int q){
		if(p>=q)
			return;
		int mid=(p+q)/2;
		mergesort(a,p,mid);
		print(a);
		mergesort(a,mid+1,q);
		print(a);
		mergeTwoArray(a,p,mid,q);
		print(a);
	}
	
	private void mergeTwoArray(int[] a,int p,int mid,int q){
		//System.out.println("p:" + p);
		//System.out.println("mid:" + mid);
		//System.out.println("q:" + q);
		
		int[] a1=new int[mid-p+1];
		int[] a2=new int[q-mid];
		for(int i=p;i<=mid;++i)
			a1[i-p]=a[i];
		for(int i=mid+1;i<=q;++i)
			a2[i-mid-1]=a[i];
		int a1Index=0;
		int a2Index=0;
		int pIndex=p;
		while(true){
			if(a1Index>a1.length-1 && a2Index>a2.length-1)
				break;
			else if(a1Index>a1.length-1){
				for(int i=a2Index;i<a2.length;i++){
					a[pIndex++]=a2[i];
				}
				break;
			}
			else if(a2Index>a2.length-1){
				for(int i=a1Index;i<a1.length;i++){
					a[pIndex++]=a1[i];
				}
				break;
			}
			
			if(a1[a1Index]<=a2[a2Index])
				a[pIndex++]=a1[a1Index++];
			else
				a[pIndex++]=a2[a2Index++];
			
			//print(a1);
			//print(a2);
		}
		
	}

}
