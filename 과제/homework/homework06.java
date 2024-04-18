package homework;
import java.util.Scanner;
public class homework06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("처음 입력받을 수: ");
		 int first = scanner.nextInt();
		 
		 System.out.print("나중에 입력받을 수: ");
		 int end = scanner.nextInt();
		 
		 int sum = 0;
		 for(int i = first; i<=end; i++) {
			 sum += i;
		 }
		 System.out.println(first + "부터" + end + "까지의 합: " + sum );
		 scanner.close();
	}
}
