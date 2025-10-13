package Ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = ""; //빈 문자열로 정의. null 값이 아니므로 주소값은 저장된다.
		if(hobby.equals("")) {
			System.out.println("hobby 변수 - 참조 : string | 객체는 빈문자열 ");
		}

	}

}
