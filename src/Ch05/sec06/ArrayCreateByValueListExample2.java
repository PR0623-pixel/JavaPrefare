package Ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : "+ sum1);
		
		printItem( new int[] {83, 90, 87}); //호출

	}
	//printItem Method 새롭게 선언
	public static void printItem( int[] score) {
		for(int i=0; i<3; i++) {
			System.out.println("score["+ i + "] : " + score[i]);
		}
	}
}
