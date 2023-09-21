package week03_2.sec03;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// 입사시험 면접, 코딩 테스트, 인성시험으로 합격 여부 결정
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("면접 결과 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("코딩 테스트 결과 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		System.out.print("인성시험 결과 : ");
		String strZ = scanner.nextLine();
		int z = Integer.parseInt(strZ);
		
		if(x==0&y==0&z==0) {
			System.out.println("3가지 시험 모두 불합격으로 최종 불합격 입니다.");
		}else if (x==0&y==1&z==0) {
			System.out.println("면접, 인성시험 불합격으로 최종 불합격 입니다.");
		}else if (x==0&y==0&z==1) {
			System.out.println("면접, 코딩테스트 불합격으로 최종 불합격 입니다.");
		}else if (x==0&y==1&z==1) {
			System.out.println("면접 불합격으로 최종 불합격 입니다.");
		}else if (x==1&y==0&z==0) {
			System.out.println("코딩테스트, 인성 시험 불합격으로 최종 불합격 입니다.");
		}else if (x==1&y==1&z==0) {
			System.out.println("인성 시험 불합격으로 최종 불합격 입니다.");
		}else if (x==1&y==0&z==1) {
			System.out.println("코딩테스트 불합격으로 최종 불합격 입니다.");
		}else if (x==1&y==1&z==1) {
				System.out.println("면접, 코딩테스트, 인성 시험 모두 합격으로 최종 합격입니다.");
		}else {
				System.out.println("올바른 값을 입력하세요.");
		}
	}

}
