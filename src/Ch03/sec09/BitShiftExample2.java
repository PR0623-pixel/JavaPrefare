package Ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]
		
		// 우측으로 24bit (3byte) 이동 후, 끝 1바이트만 읽는다.
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255; //비트 논리곱 시행
		System.out.println("첫 번째 byte unsigned 값 : " + int1);
		
		//우측으로 2byte, 끝 1byte만 읽는다.
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 byte unsigned 값 : " + int2);
		
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255; //비트 논리곱
		System.out.println("세 번째 byte unsigned 값 : " + int3);
		
		//끝 1byte만 읽음.
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 byte unsigned 값 : " + int4);
				
		
	}

}
