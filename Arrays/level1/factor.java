package level1;
import java.util.*;
public class factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArrayList<Integer> factorsList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }

        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }

        System.out.print("Factors of " + num + " are: ");
        for (int f : factors) {
            System.out.print(f + ", ");
        }

        sc.close();
    }
}
