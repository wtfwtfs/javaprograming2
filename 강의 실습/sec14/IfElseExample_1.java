package week02.sec14;

import java.util.Scanner;

public class IfElseExample_1 {

	public static void main(String[] args) {
		//int score = 85;
		Scanner scanner = new Scanner(System.in);
		System.out.println("수입력 : ");
		int score = scanner.nextInt();
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
		}

	}

}
