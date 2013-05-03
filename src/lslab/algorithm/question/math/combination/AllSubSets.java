package lslab.algorithm.question.math.combination;

import java.util.Random;

public class AllSubSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		int[] ar = new int[number];
		for (int i = 0; i < number; i++) {
			ar[i] = i;
		}
		
		shuffleArray(ar);
		subset(ar);
		

	}

	static void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i >= 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	public static void subset(int[] s) {
		int count=0;
		int allMasks = (1 << s.length);
		for (int i = 0; i < allMasks; i++)
		{
		    for (int j = 0; j < s.length; j++)
		        if ((i & (1 << j)) > 0) 
		           System.out.print(s[j] + " ");

		    System.out.println();
		    ++count;
		}
		System.out.println("count of subset is " + count);
	}

}
