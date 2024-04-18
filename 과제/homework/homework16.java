package homework;

import java.util.Scanner;

public class homework16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("처음 수를 입력하세요: ");
        int start = scanner.nextInt();
        System.out.print("나중 수를 입력하세요: ");
        int end = scanner.nextInt();
        System.out.print("짝수를 곱셈하려면 'A', 홀수를 곱셈하려면 'B'를 입력하세요: ");
        char choice = scanner.next().charAt(0);
        long product = 1; 
        if (choice == 'A') { 
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    product *= i; 
                }
            }
            System.out.println("짝수 곱: " + product);
        } else if (choice == 'B') { 
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    product *= i; 
                }
            }
            System.out.println("홀수 곱: " + product);
        } else {
            System.out.println("잘못된 입력입니다. 'A' 또는 'B' 중에 선택해주세요.");
        }

        scanner.close();
    }
}