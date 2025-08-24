package level2;
import java.util.Scanner;
public class DigitFrequency {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        String numStr = Long.toString(num);
        int length = numStr.length();

        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i]);
            }
        }

        sc.close();
    }
}

