package Ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1;i<=10; i++) {
			if(i%2 != 0) { // 2로 나눴을 때, 나머지가 나오면..
				continue; //값을 내보내지 않고 반복시작.
			}
			System.out.print(i+" ");
		}

	}

}

