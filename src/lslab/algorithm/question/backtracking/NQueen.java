package lslab.algorithm.question.backtracking;

import java.util.Arrays;

public class NQueen {

	/**
	 * @param args
	 */

	public static int solvecounts = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxN = 8;
		int[] solves = new int[maxN];
		nqueensimple(maxN, 0, solves);
		System.out.println(solvecounts);
		factorial(5000);

	}

	// maxN是最大的个数。curN是当前的行数。solves保存是一维数组的索引
	public static boolean isSafe(int maxN, int curN, int curIndex, int[] solves) {
		if (0 == curN) {
			return true;
		}
		for (int i = 0; i < curN; ++i) {
			if (solves[i] % maxN == curIndex % maxN)
				return false;
			else if (solves[i] % maxN + (curN - i) == curIndex % maxN)
				return false;
			else if (solves[i] % maxN - (curN - i) == curIndex % maxN)
				return false;
		}
		return true;
	}

	// maxN是最大的个数。curN是当前的行数。solves保存是一维数组的索引
	public static void nqueen(int maxN, int curN, int[] solves) {
		if (curN >= maxN) {
			// System.out.println(Arrays.toString(solves));
			printsolves(maxN, solves);
			++solvecounts;
			return;
		}
		for (int j = 0; j < maxN; ++j) {
			int tmp = curN * maxN + j;
			if (isSafe(maxN, curN, tmp, solves)) {
				solves[curN] = tmp;
				nqueen(maxN, curN + 1, solves);
				solves[curN]=0;
			}

		}

	}

	public static void printsolves(int maxN, int[] solves) {
		for (int i = 0; i < solves.length; i++) {
			for (int j = 0; j < maxN; ++j) {
				if (j == solves[i] % maxN)
					System.out.print("|X");
				else
					System.out.print("|_");
			}
			System.out.println("|");
		}
		System.out.println();
	}

	// solves保存是每行的列号。curN是当前的行号。
	public static void nqueensimple(int maxN, int curN, int[] solves) {
		if (curN >= maxN) {
			printsolves(maxN, solves);
			++solvecounts;
			return;
		}
		for (int j = 0; j < maxN; ++j) {
			if (isSafe(curN, j, solves)) {
				solves[curN] = j;
				nqueensimple(maxN, curN + 1, solves);
			}

		}

	}

	// solves保存是每行的列号。
	public static boolean isSafe(int row, int col, int[] solves) {
		for (int i = 0; i < row; ++i) {
			if (col == solves[i]) // 列相同
				return false;
			if (Math.abs(col - solves[i]) == Math.abs(i - row)) // 斜线相同
				return false;
		}
		return true;
	}
	
	public static void factorial(int n){
		java.math.BigInteger  bi=new java.math.BigInteger("1");
		
		
		for(int i=1;i<=n;++i){
			bi=bi.multiply(new java.math.BigInteger(i+""));
			System.out.println(i);
		}
		System.out.println(bi);
		System.out.println(bi.toString().length());
	}

}
