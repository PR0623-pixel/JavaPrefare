package Ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for(int score : scores) { //(가져올 변수의 저장값 : 가져올 배열)로 반복문 가능.
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		//배열 항목 평균
		
		double avg = (double) sum/ scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
