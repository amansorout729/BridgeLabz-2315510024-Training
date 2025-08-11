package bridge_Labz;
import java.util.*;

public class prg5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height");
		double h=sc.nextInt();
		System.out.println("enter the radius");
		double r =sc.nextInt();
		double Volume = 22/7 *  Math.pow(r,2) * h;
		System.out.println("volume of cylinder is:" + Volume);
		
	}

}
