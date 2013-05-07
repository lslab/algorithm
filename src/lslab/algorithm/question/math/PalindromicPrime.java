package lslab.algorithm.question.math;

/*
 * PALINDROMIC PRIMES

 A palindromic number is a number that reads the same backwards as forwards (1991 for example). 
 A prime number is a number with only two factors, itself and one (17 for example). 
 A palindromic prime number is a number that is both a palindromic number and a prime number (151 for example). 
 Find the largest 5-digit palindromic prime number.

 Remember, to solve this problem and appear on the leaderboard, 
 email both your solution and your source code (in any language) to lewiscornwall13@gmail.com. Good luck!!
 * 
 */
public class PalindromicPrime {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int icount = 0;
		int ibegin = 99999;
		
		while (ibegin > 10000 && icount < 6) {
			if (isPrimeMoreEfficency(ibegin)) {
				if (isPalindrome(String.valueOf(ibegin))) {
					System.out.println(ibegin);
					++icount;
				}
			}
			--ibegin;

		}
		
		

	}

	public static boolean isPalindrome(String str) {
		return str
				.equals((new StringBuffer()).append(str).reverse().toString());
	}

	boolean isPalindromeMoreEfficiency(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;
	}

	public static boolean isPrime(long p) {
		if (p == 1)
			return false;
		if (p == 2)
			return true;
		int limit = (int) Math.sqrt(p);
		for (int i = 3; i <= limit; i += 2) {
			if (p % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrimeMoreEfficency(int x) {
		if (x == 1)
			return false;
		if (x == 2 || x == 3)
			return true;
		if (x % 2 == 0 || x % 3 == 0)
			return false;

		int testUpTo = (int) ((Math.sqrt(x)) + 1);
		for (int i = 6; i < testUpTo; i += 6) {
			if ((x % (i - 1)) == 0 || x % (i + 1) == 0) {
				return false;
			}
		}
		return true;
	}
}
