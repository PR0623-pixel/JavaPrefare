package Ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		//새로우 배열에 내용 복사
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 항목 출력
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		// old에서 가져온 값은 3개의 element 밖에 없으므로, 나머지 칸은 0으로 남아 있다.

	}

}
