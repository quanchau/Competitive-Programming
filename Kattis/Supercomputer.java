import java.util.*;

public class Supercomputer {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		double num1 = Math.floor(Math.sqrt(n));
		int num = (int) num1;
		int k = in.nextInt();
		int[] sum = new int[(int) (Math.ceil(n/num1))];
		for (int i_k = 0; i_k< k; i_k++) {
			String s = in.next();
			if (s.equals("F")) {
				int ind = in.nextInt();
				int temp = arr[ind-1];
				arr[ind-1] = 1- arr[ind-1];
				temp = arr[ind-1] - temp;
				sum[(ind-1)/num] += temp;
			} else {
				int count = 0;
				int start = in.nextInt()-1;
				int end = in.nextInt()-1;
				while (start%num != 0 && start <=end) {
					count+= arr[start];
					start++;
				}
				while (end%num != num -1 && end >= start) {
					count+= arr[end];
					end--;
				}
				for (int i = start; i <= end; i += num) {
					count+= sum[i/num];
				}
				System.out.println(count);
			}
		}
		
	}

}
