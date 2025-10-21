package Ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		int [][] mathscores = new int[2][3];
		
		for (int i = 0; i< mathscores.length;i++) {
			for(int k = 0; k < mathscores[i].length;k++) {
				System.out.println("mathScores[" +i+"]["+k+"] : "+ mathscores[i][k]);
			}
		}
		System.out.println();
		
		// 배열 element 값 변경
		mathscores[0][0] = 80;
		mathscores[0][1] = 83;
		mathscores[0][2] = 85;
		mathscores[1][0] = 86;
		mathscores[1][1] = 90;
		mathscores[1][2] = 92;

		int totalstu = 0;
		int totalmathsum = 0;
		for (int i = 0; i < mathscores.length; i++) {
			totalstu += mathscores[i].length;
			for(int k = 0; k< mathscores[i].length; k++) {
				totalmathsum += mathscores[i][k];
			}
		}
		double totalmathavg = (double) totalmathsum / totalstu;
		System.out.println("전체 학생 수학 평균 점수 : " + totalmathavg);
		System.out.println();
		
		//각반의 학생수 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] engscores = new int [2][];
		engscores[0] = new int[2];
		engscores[1] = new int[3];
		
		for(int i = 0 ; i < engscores.length;i++) {
			for(int k = 0; k < engscores[i].length; k++) {
				System.out.println("engscores["+i+"]["+k+"] : "+ engscores[i][k]);
			}
		}
		System.out.println();
		
		engscores[0][0] = 90;
		engscores[0][1] = 91;
		engscores[1][0] = 92;
		engscores[1][1] = 93;
		engscores[1][2] = 94;
		
		totalstu = 0;
		int totalengsum = 0;
		for (int i = 0; i < engscores.length; i++) {
			totalstu += engscores[i].length;
			for(int k = 0; k< engscores[i].length; k++) {
				totalengsum += engscores[i][k];
			}
		}
		
		double totalengavg = (double) totalengsum / totalstu;
		System.out.println("전체 학생 영어 평균 점수 : " + totalengavg);
		System.out.println();
		
		

	}

}
