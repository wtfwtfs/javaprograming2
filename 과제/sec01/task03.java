package week03_2.sec01;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		//사칙연산 계산기를 만들어 보시오(두 값 입력)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a값 입력");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		
		System.out.print("b값 입력");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		
		System.out.print("사용할 공식 선택(1번:덧셈,2번:뺄셈,3번:곱셉,4:나눗셈 / a,b)");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		if(x == 1) {
			System.out.printf("a + b =%d " , a+b);
		}
		if(x == 2) {
			System.out.printf("a - b = %d" , a-b);
		}
		if(x == 3) {
			System.out.printf("a * b =%d " , a*b);
		}
		if(x == 4) {
			System.out.printf("a / b = %d" , a/b);
		}
	}
}
