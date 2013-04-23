package lslab.algorithm.question.math.probability;

public class BirthdayParadox {

	/**
	 * @param args
	 * 
	 * The birthday problem asks whether any of the people in a given group has a birthday matching any of the others 
	 * — not one in particular. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counts=1;
		float prob=0.0f;
		float uniqProb=1.0f;
		while(prob<0.5){
			uniqProb=uniqProb*(365-(counts-1))/365;
			prob=1-uniqProb;
			System.out.println("the counts of the people is " + counts + ",the probability is "+prob);
			++counts;
		}

	}

}
