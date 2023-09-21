package week03_2.sec01;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// 값을 입력 받아서 10이상 30미만 사이로 3구역으로 나누어 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("값 입력");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		if(10>x) {
			System.out.println("10미만의 수 입니다.");
		}
		if(10<= x & x<30) {
			System.out.println("10과 30사이의 수 입니다.");
		}
		if(x>=30) {
			System.out.println("30이상의 수 입니다.");
		}

	}

}
