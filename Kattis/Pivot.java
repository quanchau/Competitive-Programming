import java.util.*;
public class Pivot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		boolean[] list = new boolean[n];
		int ind = 0;
		int max = arr[ind];
		while (ind < n) {
			if (arr[ind] >= max) {
				list[ind] = true;
				max = arr[ind];
			}
			ind++;
		}
		int ind2 = n-1;
		int count = 0;
		int min = arr[ind2]; 
		while (ind2 >= 0) {
			if (arr[ind2] <= min) {
				min = arr[ind2];
				if (list[ind2]){
				count++;
				}
				
			}
			ind2--;
		}
		System.out.println(count);
	}
}
