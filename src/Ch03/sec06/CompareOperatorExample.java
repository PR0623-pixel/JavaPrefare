package Ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // num1, num2가 같냐?
		boolean result2 = (num1 != num2); // 틀리냐?
		boolean result3 = (num1 <= num2); // num2가 num1보다 크거나 작냐?
		System.out.println("result1 : " + result1); //boolean 이므로 True or False로 나타남
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //ASCII Code로 변환해서 값 위상 정함.
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); //n3, n4 같아?의 True 값을 저장
		System.out.println("result5 : " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);		//Type에 따른 진위여부 확인
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6 : " + result6); //Type이 다르므로 같진 않다.
		System.out.println("result7 : " + result7); // 타입을 통일 시켰더니 같게 인식이 된다.
		
		String str1 = "자바";
		String str2 = "Java";
		
		boolean result8 = (str1.equals(str2)); // string1, 2가 같나? 여부
		boolean result9 = (! str1.equals(str2)); // 윗줄과 반대.
		System.out.println("result8 : " + result8);
		System.out.println("result9 : " + result9);
	}

}
