package Ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		//week enum type 변수 선언.
			Week today = null; // 같은 package 에서 받아온 enum 값.
			
			//Calendar 열기
			Calendar cal = Calendar.getInstance();
			
			//오늘의 요일 열거.
			int week = cal.get(Calendar.DAY_OF_WEEK);
			
			switch(week) {
				case 1: today = Week.SUNDAY;	break;
				case 2: today = Week.MONDAY;	break;
				case 3: today = Week.TUESDAY;	break;
				case 4: today = Week.WEDNESDAY;	break;
				case 5: today = Week.THURSDAY;	break;
				case 6: today = Week.FRIDAY;	break;
				case 7: today = Week.SATURDAY;	break;
			}
			
			if(today == Week.SUNDAY) {
				System.out.println(today);
				System.out.println("일요일은 축구를 합니다.");
			} else {
				System.out.println(today);
				System.out.println("열심히 자바 공부를 합니다");
			}

	}

}
