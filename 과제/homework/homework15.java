package homework;
import java.util.Scanner;
public class homework15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("처음 수를 입력하세요: ");
        int start = scanner.nextInt();
        
        System.out.print("나중 수를 입력하세요: ");
        int end = scanner.nextInt();
        
        long product = 1; 
        for (int i = start; i <= end; i++) {
            product *= i; 
        }
        System.out.println(start + "부터 " + end + "까지의 곱: " + product);
        
        scanner.close();
    }
}