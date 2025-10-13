package Ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {84, 90, 96};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //scores의 배열 길이 만큼 반복.
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length; //퍙균은 총합 / 언소 개수이므로
		System.out.println("평균 : " + avg);
	}

}
