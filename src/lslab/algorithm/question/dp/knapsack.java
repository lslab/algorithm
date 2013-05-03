package lslab.algorithm.question.dp;

import java.util.Arrays;

public class knapsack {

	/**
	 * 
	 * The knapsack problem or rucksack problem is a problem in combinatorial
	 * optimization: Given a set of items, each with a weight and a value,
	 * determine the number of each item to include in a collection so that the
	 * total weight is less than or equal to a given limit and the total value
	 * is as large as possible. It derives its name from the problem faced by
	 * someone who is constrained by a fixed-size knapsack and must fill it with
	 * the most valuable items.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		int maxWeight = 300;
		int[] tab = new int[maxWeight + 1];
		int[] vs = new int[number];
		int[] ws = new int[number];
		for (int i = 0; i < number; i++) {
			vs[i] = (int) (Math.random() * 1000);
			ws[i] = (int) (Math.random() * maxWeight);
		}

		System.out.println(Arrays.toString(vs));
		System.out.println(Arrays.toString(ws));

		System.out.println(knapsackR(ws, vs, vs.length - 1, maxWeight));
		System.out.println(knapsackM(ws, vs, tab,0,maxWeight));
	}

	// recursion
	static int knapsackR(int[] ws, int[] vs, int i, int maxWeight) {
		if (i < 0) {
			return 0;
		}
		if (ws[i] > maxWeight) {
			return knapsackR(ws, vs, i - 1, maxWeight);
		} else {
			return Math.max(knapsackR(ws, vs, i - 1, maxWeight),
					knapsackR(ws, vs, i - 1, maxWeight - ws[i]) + vs[i]);
		}
	}

	// memoization ???
	static int knapsackM(int[] ws, int[] vs, int[] tab, int i, int maxWeight) {
		if (i >= vs.length)
			return 0;
		
		if (tab[maxWeight] != 0)
			return tab[maxWeight];

		int value1 = knapsackM(ws,vs,tab,i + 1,maxWeight);
		int value2 = 0;
		if (maxWeight >= ws[i])
			value2 = knapsackM(ws,vs,tab,i+1, maxWeight - ws[i])
					+ vs[i];

		return tab[maxWeight] = (value1 > value2) ? value1 : value2;
	}

}
