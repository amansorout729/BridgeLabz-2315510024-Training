package bridge_Labz;
import java.util.*;
public class prg6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the principal");
		int p=sc.nextInt();
		System.out.println("enter the rate");
		int r=sc.nextInt();
		System.out.println("Enter the time");
		int t=sc.nextInt();
		int SI=(p*r*t)/100;
		System.out.println("Simple intrest is " + SI);
	}

}
