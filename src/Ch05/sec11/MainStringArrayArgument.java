package Ch05.sec11;

public class MainStringArrayArgument {
	//eclipse 에서는, 매개변수인 args 를 터미널에서 받을 수 없기 때문에, Run -> Run configurations 로 가서 Argument 를 따로 입력해주어야 한다.
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("프로그램 입력 값 부족");
			System.exit(0); //시스템 강제 종료 코드
		}
		
		String strNum1 = args[0]; //arguments 는 매개변수임.
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2+"="+result);
	}

}
