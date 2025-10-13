package Ch05.sec04;

public class NullpointerExceptionExample {

	public static void main(String[] args) {
		int[] intarr = null;
		intarr[0] = 10; //주소 미지정, Exception 발생

		String str = null;
		System.out.println("총 문자수: " + str.length()); //지정된 문자열 X, 주소또한 X Exception
		//당연히 Exception Error 발생
	}

}
