package week03_2.sec04;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// 입사시험 면접, 코딩 테스트, 인성시험으로 합격 여부 결정
		//인성테스트가 80점이상인지 구분하여 코딩테스트(80점 이상)와 인성 면접(80점 이상) 일때 합격이고 불합격을 구분하여 불합격 이유를 출력
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("면접 결과 : ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
		
		System.out.print("코딩 테스트 결과 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		System.out.print("인성시험 결과 : ");
		String strZ = scanner.nextLine();
		int z = Integer.parseInt(strZ);
		
		if(y>=80) {
			if(z>=80) {
				System.out.println("코딩테스트 80점 이상, 인성 시험 80점 이상으로 최종 합격입니다.");
			}else {
				System.out.println("코딩테스트는 80점 이상이지만 인성 시험 80점 미만으로 최종 불합격입니다.");
			}
		}else {
			if(y>=80) {
				System.out.println("인성 시험은 80점 이상이지만 코딩테스트 80점 미만으로 최종 불합격 입니다.");
			}else {
				System.out.println("코딩테스트, 인성시험 모두 80점 미만으로 최종 불합격 입니다.");
			}
		}
		

		

	}

}
