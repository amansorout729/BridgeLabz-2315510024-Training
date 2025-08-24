package arrays;
import java.util.*;
public class Leader {

	public static void main(String[] args) {
		int[] arr = {16,17,4,5,3,2};
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0;i <= arr.length-1 ;i++){
			boolean isLeader = true;
			for(int j = i+1;j <= arr.length-1; j++){
				if(arr[i]<=arr[j]) {
				isLeader = false;
				break;
					}
				}
				if(isLeader == true) {
					result.add(arr[i]);
			}
		}
		System.out.println(result);
	}

}
