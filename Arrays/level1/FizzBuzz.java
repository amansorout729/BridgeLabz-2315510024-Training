package level1;

import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive number: ");
	        int num = sc.nextInt();
	        String[] results = new String[num + 1];

	        for (int i = 0; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0 && i != 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0 && i != 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i);
                }
            }
	       
	        System.out.println("FizzBuzz Results:");
            for (int i = 0; i <= num; i++) {
                System.out.println("Index " + i + " = " + results[i]);
            }
	        

	        sc.close();
	    }
	

}

