import java.util.*;
public class NumberSets {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		boolean[] fact = new boolean[1001];
		fact[2] = true;
		for (int i = 3; i < 1001; i++) {
			if (isPrime(i)) {
				fact[i] = true;
			}
		}
		for (int i_c = 0; i_c < c; i_c++) {
			int start = in.nextInt();
			int end = in.nextInt();
			int p = in.nextInt();
			arr = new int[end+1];
			for (int i = start; i < end+1; i++) {
				arr[i] = i;
			}
			int count = end - start +1;
			for (int i = start; i < end+1; i++) {
				for (int j = i+1; j < end+1; j++) {
					if (find(i) != find(j)) {
					   for (int m = p; m <= i; m++) {
						   if (i%m == 0 && j %m == 0 && fact[m]) {
							   count--;
							   union(i,j);
							   break;
						   }
					   }
					}
				}
			}
			System.out.println("Case #"+ (i_c+1) + ": " +count);
		}
	}
	
	public static int find(int num) {
		if (arr[num] == num) {
			return num;
		} else {
			arr[num] = find(arr[num]);
			return arr[num];
		}
	}
	
	public static void union(int num1, int num2) {
		arr[find(num1)] = find(num2);
	}
	
	public static boolean isPrime(int n) {
	    for(int i=2;2*i<=n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
