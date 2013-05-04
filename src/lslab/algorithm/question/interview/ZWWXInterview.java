package lslab.algorithm.question.interview;

import java.util.Arrays;

public class ZWWXInterview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = bitCountSub(3);
		System.out.println(count);
		toInteger("123434234");
		toString(978654321);
		int[] a={1,2,3,4,5,6,7,8,9,10};
		divideOddandEven(a);
	}

	public static int bitCount(int i) {
		int count = 0;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.bitCount(i));
		while (i != 0) {
			if ((i & 0x1) != 0)
				++count;
			i = i >>> 1;
		}
		return count;
	}

	public static int bitCountSub(int i) {
		int count = 0;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.bitCount(i));
		while (i != 0) {
			++count;
			i = (i - 1) & i;
		}
		return count;
	}

	//
	public static int toInteger(String strI) {
		// the first verify string, if string is uneligial, show throw
		// exception,but i don't process this.
		// verify include:length,char,sign, etc.
		int tmp = 0;
		for (int i = 0; i < strI.length(); ++i) {
			tmp = tmp * 10 + (strI.charAt(i) - '0');
		}
		System.out.println(tmp);
		return tmp;
	}

	public static String toString(int i) {
		String result = "";
		String sign = "";
		if (i == 0)
			return "0";
		if (i < 0)
			sign = "-";
		i = Math.abs(i);
		StringBuffer sb = new StringBuffer();
		while (i != 0) {
			sb.append(i % 10);
			i = i / 10;
		}
		result = sign + sb.reverse().toString();
		System.out.println(result);
		return result;
	}

	public static void divideOddandEven(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (true) {
			if (a[i] % 2 == 1)
				i++;
			if (a[j] % 2 == 0)
				j--;
			if (i >= j)
				break;
			else {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}

		}
		System.out.println(Arrays.toString(a));
	}

}
