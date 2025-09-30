package Ch03.sec01;

public class SignOpreratorExample {

	public static void main(String[] args) {
		int x =  -100;
		x = -x;
		System.out.println("x : " + x);
		
		byte b = 100; 
		int y = -b; //byte값을 음수로 변환 시, int로 설정 해야함, 변환됨.
		System.out.println("y : " + y);

	}

}
