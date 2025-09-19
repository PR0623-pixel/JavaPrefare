package Ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int temp = 0;
		if (v1> 10) {
			int v2 =  v1 - 10;
			temp = v2 ;
		}
		int v3 = v1 + temp + 5;
		System.out.println(v3);
	}

}
