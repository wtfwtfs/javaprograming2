package homework;

public class homework07 {
	   public static void main(String[] args) {
	        int sum = 0;
	        int number = 1;
	        while (sum < 100 && number <= 19) {
	            sum += number;
	            if(number != 19) {
	                System.out.print(number + " + ");
	            } else {
	                System.out.print(number);
	            }
	            number += 2;
	        }
	        System.out.println(" = " + sum);
	    }
	}