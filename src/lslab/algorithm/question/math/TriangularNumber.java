package lslab.algorithm.question.math;

import java.util.ArrayList;

public class TriangularNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=1;
		int tn=0;
		while(tn<1000){
			tn=n*(n+1)/2;
			if(tn>=100 && tn<1000){
				System.out.println(tn);
				al.add(tn);
			}
			n++;
			
		}
		int sum=0;
		for(int i=0;i<al.size();i++){
			sum=sum+al.get(i);
		}
		System.out.println(sum);
	}

}
