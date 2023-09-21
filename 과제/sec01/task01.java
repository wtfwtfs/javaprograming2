package week03_2.sec01;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// 값을 입력 받아서 10이상 10미만의 수를 구분.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("값 입력");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		if (x>=10) {
			System.out.println("10이상의 수 입니다.");
		}
		if (x<10) {
			System.out.println("10미만의 수  입니다.");
		}
	}

}
