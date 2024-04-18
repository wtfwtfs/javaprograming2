package homework;
import java.util.Scanner;
public class homework21 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("n을 입력하세요: ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        StringBuilder expression = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            factorial *= i;
            expression.append("*").append(i);
        }
        
        System.out.println(expression + "=" + factorial);
        
        scanner.close();
    }
}