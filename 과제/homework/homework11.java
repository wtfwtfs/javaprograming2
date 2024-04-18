package homework;
import java.util.Scanner;
public class homework11 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("처음 수를 입력하세요: ");
	        int start = scanner.nextInt();
	        System.out.print("나중 수를 입력하세요: ");
	        int end = scanner.nextInt();
	        System.out.print("짝수를 합산하려면 'e', 홀수를 합산하려면 'o'를 입력하세요: ");
	        char choice = scanner.next().charAt(0);
	        int sum = 0;
	        if (choice == 'e') {
	            for (int i = start; i <= end; i++) {
	                if (i % 2 == 0) {
	                    sum += i;
	                }
	            }
	            System.out.println("짝수 합: " + sum);
	        } else if (choice == 'o') {
	            for (int i = start; i <= end; i++) {
	                if (i % 2 != 0) {
	                    sum += i;
	                }
	            }
	            System.out.println("홀수 합: " + sum);
	        } else {
	            System.out.println("잘못된 입력입니다. 'e' 또는 'o' 중에 선택해주세요.");
	        }

	        scanner.close();
	    }
	}