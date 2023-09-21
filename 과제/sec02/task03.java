package week03_2.sec02;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// 복리 단리를 조건문을 사용하여 사용자가 원하는 금리 계산
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단리, 복리 선택(1:단리, 이외의 숫자는 복리)");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		if(x == 1) {
			System.out.println("원금 : ");
			String strA = scanner.nextLine();
			int a = Integer.parseInt(strA);
			
			System.out.println("이자율 : ");
			String strB= scanner.nextLine();
			int b = Integer.parseInt(strB);
			
			System.out.println("기간 : ");
			String strC = scanner.nextLine();
			int c = Integer.parseInt(strC);
			
			double FV1 = a*(1+(0.01*b)*c);
			//double FV2 = PV*(Math.pow((1+(0.01*r)),n));
			
			System.out.println("이자를 포함한 총 금액 : "+ FV1 );
		}
		
		else {
			System.out.println("원금 : ");
			String strD = scanner.nextLine();
			int d = Integer.parseInt(strD);
			
			System.out.println("이자율 : ");
			String strE= scanner.nextLine();
			int e = Integer.parseInt(strE);
			
			System.out.println("기간 : ");
			String strF = scanner.nextLine();
			int f = Integer.parseInt(strF);
		
			double FV2 = d*(Math.pow((1+(0.01*e)),f));
			
			System.out.println("이자를 포함한 총 금액 : "+ FV2 );
		}
	}

}
