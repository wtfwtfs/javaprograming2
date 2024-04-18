package homework;
import java.util.Scanner;

public class homework03 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("반복할 횟수를 입력하세요: ");
	        int repeatCount = scanner.nextInt();
	        for (int i = 1; i <= repeatCount; i++) {
	            System.out.println("안녕 (횟수: " + i + ")");
	        }
	        scanner.close();
	    }
	}