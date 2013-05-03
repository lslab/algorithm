package lslab.algorithm.question.recursion;

public class HonoiTower {

	/**
	 * @param args
	 */
	
	private static int movecount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi("A","B","C",6);
		System.out.println(movecount);
	}
	
	public static void hanoi(String from, String to,String by,int count){
		if(1==count){
			++movecount;
			System.out.println(from + by +to);
			return;
		}
		hanoi(from,by,to,count-1);
		hanoi(from,to,by,1);
		hanoi(by,to,from,count-1);
	}

}
