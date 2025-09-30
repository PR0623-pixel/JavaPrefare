package Ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'A'; //ASCII Code로 위상 비교.
							//grade를 변환해서 결과값 변환 가능.
		switch(grade) {
			case 'A':	//대문자, 소문자 구분없이 진행하기 위해.
			case 'a':	//case를 엮어서 제시.
				System.out.println("우수 회원");
				break; // 단일 결과값만 추출이 목적이므로.
			case 'B':
			case 'b':
				System.out.println("일반 회원");
				break;
			default:
				System.out.println("손님");
		}

	}

}
