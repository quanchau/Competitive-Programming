import java.util.*;
public class Register {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = {1, 2, 4, 6, 10, 12, 16,18};
		int[] arr2 = new int[8];
		for (int i = 0; i < 8; i++) {
			arr2[i] = in.nextInt();
		}
		int res = 0;
		int sum = 0;
		while(arr2[7] != 19) {
			res++;
			for (int i = 0; i < 8; i++) {
				arr2[i]++;	
				if (arr2[i] > arr[i] && i!= 7) arr2[i] =0;
				else break;
				
			}
	
		}
		System.out.println(res-1);
	}
}
