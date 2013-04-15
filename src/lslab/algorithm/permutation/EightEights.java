package lslab.algorithm.permutation;

public class EightEights {

	/**
	 * @param args
	 * 
	 *            Using eight eights and addition only, can you make 1000?
	 * 
	 *            the following is answer of Erik Poupaert@google+ I've found 20
	 *            possible matches, which are all permutations of the same
	 *            solution. By deriving the valid expressions from: expression
	 *            =8.op[7].8.op[6].8.op[5].8.op[4].8.op[3].8.op[2].8.op[1].8 In
	 *            which op[i] with i=1..7, representing a value in the set
	 *            {'','+"}. There are 2^7=128 such combinations possible.
	 *            Numbered from 0 ... 127: 0) 88888888 1) 8888888+8 2) 888888+88
	 *            3) 888888+8+8 ... Which corresponds to the binary
	 *            representation for the number: 0) 0000000 1) 0000001 2)
	 *            0000010 3) 0000011 4) 0000100 ... If the digit is "1", the
	 *            expression contains a "+" in that place. This produces the
	 *            following list of expressions that evaluate to 1000:
	 *            1)888+88+8+8+8 2)888+8+88+8+8 3)888+8+8+88+8 4)888+8+8+8+88
	 *            5)88+888+8+8+8 6)88+8+888+8+8 7)88+8+8+888+8 8)88+8+8+8+888
	 *            9)8+888+88+8+8 10)8+888+8+88+8 11)8+888+8+8+88 12)8+88+888+8+8
	 *            13)8+88+8+888+8 14)8+88+8+8+888 15)8+8+888+88+8
	 *            16)8+8+888+8+88 17)8+8+88+888+8 18)8+8+88+8+888
	 *            19)8+8+8+888+88 20)8+8+8+88+888 These are all permutations of
	 *            +(8,8,8,88,888). So, there is apparently just one solution
	 *            possible.﻿
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tmp="";
		int isum=0;
		int icur=0;
		for(int i=0;i<127;++i){
			tmp="";
			isum=0;
			icur=0;
			for(int j=0;j<7;++j){
				if(j==0){
					tmp="8";					
					icur=8;
				}
				if(((i>>>j) & 0x01) ==0){
					tmp="8" + tmp;	
					icur=icur*10+8;
					if(j==6){
						isum=isum+icur;
					}
				}
				else{
					tmp="8" + "+" +tmp;
					isum=isum+icur;
					icur=8;
					if(j==6){
						isum=isum+icur;
					}
						
				}
				
			}
			System.out.println(isum);
			System.out.println(tmp);
			if(isum==1000)
				System.out.println(tmp);
		}
	}
}
