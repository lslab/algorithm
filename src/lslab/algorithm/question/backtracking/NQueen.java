package lslab.algorithm.question.backtracking;

import java.util.Arrays;

public class NQueen {

	/**
	 * @param args
	 */
	
	public static int solvecounts=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxN = 8;
		int[] solves = new int[maxN];
		nqueen(maxN, 0, solves);
		System.out.println(solvecounts);

	}

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

	public static void nqueen(int maxN, int curN, int[] solves) {
		if (curN >= maxN) {
			//System.out.println(Arrays.toString(solves));
			printsolves(maxN,solves);
			++solvecounts;
			return;
		}
		for (int j = 0; j < maxN; ++j) {
			int tmp = curN * maxN + j;
			if (isSafe(maxN, curN, tmp, solves)) {
				solves[curN] = tmp;
				nqueen(maxN, curN + 1, solves);
			}

		}

	}
	
	public static void printsolves(int maxN,int[] solves){
		for(int i=0;i<solves.length;i++){
			for(int j=0;j<maxN;++j){
				if(j==solves[i]%maxN)
					System.out.print("|X");
				else
					System.out.print("|_");
			}
			System.out.println("|");
		}
		System.out.println();
	}

}
