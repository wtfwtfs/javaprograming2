package week03_2.sec01;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		// 원의 넓이, 둘레, 삼각형의 넓이, 둘레, 사각형의 넓이, 둘레를 구하는 것을 값을 입력 받아 계산하는 프로그램 작성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도형 선택(1:원의 둘레 2:원의 넓이 3:삼각형의 둘레 4:삼각형의 넓이 5:사각형의 둘레 6:사각형의 넓이)");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		if(x == 1) {
			System.out.print("반지름 : ");
			String strR = scanner.nextLine();
			int r = Integer.parseInt(strR);

			double a = 2*3.14*r;
			
			System.out.println("원의 둘레 : " + a);
		}
		if(x==2) {
			System.out.print("반지름 : ");
			String strR = scanner.nextLine();
			int r = Integer.parseInt(strR);
			
			double b = 3.14*r*r;
			
			System.out.println( "원의 넓이 : " +b );
		}
		if(x == 3) {
			System.out.println("삼각형의 한변 : ");
			String strZ = scanner.nextLine();
			int z = Integer.parseInt(strZ);
						
			System.out.println("삼각형의 다른 한변1 : ");
			String strM= scanner.nextLine();
			int m = Integer.parseInt(strM);
			
			System.out.println("삼각형의 다른 한변2 : ");
			String strN= scanner.nextLine();
			int n = Integer.parseInt(strN);
			
			double d = z+m+n;
			
			System.out.println("삼각형 둘레 : "+d);
		}
		if (x==4) {
			System.out.println("삼각형의 한변 : ");
			String strZ = scanner.nextLine();
			int z = Integer.parseInt(strZ);
			
			System.out.println("그 변에 수직인 선분 길이(높이) : ");
			String strY= scanner.nextLine();
			int y = Integer.parseInt(strY);
			
			double c = (z*y)/2;
			
			System.out.println("삼각형의 넓이 : " + c );
		}
		if(x==5) {
			System.out.println("사각형 한변의 길이 : ");
			String strU = scanner.nextLine();
			int u = Integer.parseInt(strU);
			
			System.out.println("사각형 다른 한변의 길이 : ");
			String strO = scanner.nextLine();
			int o = Integer.parseInt(strO);
			
			double t = (2*u)+(2*o);
			
			System.out.println("사각형의 둘레 : "+ t);
		}
		if(x==6) {
			System.out.println("사각형 한변의 길이 : ");
			String strU = scanner.nextLine();
			int u = Integer.parseInt(strU);
			
			System.out.println("사각형 다른 한변의 길이 : ");
			String strO = scanner.nextLine();
			int o = Integer.parseInt(strO);
			
			double w = u*o;
			
			System.out.println("사각형의 넓이 : " +w);
		}
	}

}
