package Ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; //값은 동일하지만, heap 영역에서 저장된 주소가 다르다.
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2; //동일한 주소를 가져오므로, heap 영역 주소가 같아진다.
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}

}
