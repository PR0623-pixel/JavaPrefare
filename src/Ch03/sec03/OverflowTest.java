package Ch03.sec03;

public class OverflowTest {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z); // int 값을 넘기는 bit 수이므로 overflow
		
		System.out.println("--------------------");
		
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = (long)x * (long)y;
		
		System.out.println(z1); //long으로 강제 변환하여 연산하였으므로 bit수가 늘어나 연산가능.
		//overflow가 발생하지 않는다.
	}

}
