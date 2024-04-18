package homework;
import java.util.Scanner;

public class homework10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        System.out.println(number + "까지의 짝수:");
        for (int i = 2; i <= number; i += 2) {
            System.out.println(i);
        }
        
        System.out.println(number + "까지의 홀수:");
        for (int i = 1; i <= number; i += 2) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}