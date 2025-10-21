package Ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//길이 3 배열
		String[] oldStrArray = {"java", "array", "copy"};
		
		//길이 5 배열 new 로 만듦.
		String[] newStrArray = new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
					//원본, 원본 시작 인덱스, 복사본, 복사본 시작 인덱스, 복사 원소 수
					//또한, old 에서 지정한 각 객체의 주소를, new 로 카피하면서, 주소값을 받아오는 것.
		for(int i = 0 ; i< newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		// String 에서 array의 빈자리는 0이 아니라 null 값으로 저장된다.
	
	}

}
