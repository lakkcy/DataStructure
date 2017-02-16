
import java.util.*;


public class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr_len = scan.nextInt();
		int[] arr = new int[arr_len];
		for(int i = 0; i < arr_len; i++){
			arr[i] = scan.nextInt();
		}
		System.out.println(arr_len);
		for(int i = arr_len-1; i >= 0; i--){
			System.out.print(arr[i] + " ");
		}
	}
}
