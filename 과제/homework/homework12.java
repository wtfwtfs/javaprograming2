package homework;
import java.util.Scanner;
public class homework12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("구구단의 단수를 입력하세요: ");
	        int num = scanner.nextInt();
	        
	        System.out.println(num + "단:");
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	        
	        scanner.close();
	    }
	}