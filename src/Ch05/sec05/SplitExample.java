package Ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바학습,참조타입,String을 학습합니다.,홍길동";
		
		//문자열 분리.
		String[] tokens = board.split(","); // ,을 기준으로 문자열을 분리한다.
		
		//Index별로 읽기.
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("쓴이 : " + tokens[3]);
		System.out.println();
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
