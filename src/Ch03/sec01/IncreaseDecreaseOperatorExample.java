package Ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x가 입력되고 1을 더함.
		++x; // x가 입력되기 전에 1을 더함.
		System.out.println("x = " + x); // x = 12
		
		System.out.println("-----------------------");
		y--; //매한 가지로 y 입력 후, 1을 뺌
		--y; // y 입력 전 1을 뺌.
		
		System.out.println("y = " + y); // y = 8
		
		System.out.println("-----------------------");
		z = x++; // z에 값을 대입함. 이때, x값도 1 증가됨.
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		
		System.out.println("-----------------------");
		z = ++x; // z에 x가 1증가된 값을 대입함. x값도 1증가.
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z = " + z); // x가 증가된 값, y 그대로 값을 받음. 즉, 15 + 8
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
	}

}
