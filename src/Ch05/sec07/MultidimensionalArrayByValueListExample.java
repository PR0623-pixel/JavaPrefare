package Ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 96},
				{70, 88}
		};

		System.out.println("1차원 배열 길이 (반의 수) : " + scores.length);
		System.out.println("2차원 배열 (첫반 학생수) : " + scores[0].length);
		System.out.println("2차원 배열 (두 번째 반 학생수" + scores[1].length);
		
		System.out.println("scores[0][2] : " + scores[0][2]);
		
		System.out.println("scores[1][1] : " + scores[1][1]);
		
		//첫번째 행 scores[0][]의 점수 표현
		int class1Sum = 0;
		for(int i = 0; i< scores[0].length;i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫반 평균 점수 : " + class1Avg);
		
		//두번째 행 scores[1][]의 점수 표현
		int class2Sum = 0;
		for(int i = 0; i< scores[1].length;i++) {
			class2Sum += scores[0][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두번째 반 평균 점수 : " + class2Avg);
		
		// 전체 학생 평균 점수. (모든 행, 열 조사)
		int totalStu = 0;
		int totalSum = 0;
		for(int i = 0; i<scores.length; i++) { // 행 조사
			totalStu += scores[i].length;
			for(int k = 0; k<scores[i].length; k++ ) { //각 행의 열 조사
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum/totalStu;
		System.out.println("전체 학생 평균 점수 : " + totalAvg);
		
	}

}
