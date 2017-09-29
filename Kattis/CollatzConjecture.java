import java.util.*;
public class CollatzConjecture {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int a1 = a;
			int b = in.nextInt();
			int b1 = b;
			if (a ==0 && b== 0) {
				break;
			}
			int[] arr = new int[30000000];
			int num = 0;
			int num2 = 0;
			boolean ok = false;
			while (a != 1) {
				arr[a] = num;
				if (a%2 == 0) {
					a = a/2;
				}  else {
					a = 3*a +1;
				}
				num++;
			}
			while (b!= 1) {
				if (arr[b] > 0 || b == a1) {
					System.out.println(a1 + " needs " + arr[b]+ " steps, " + b1 + " needs "+ num2 + " steps, they meet at " + b);
					ok = true;
					break;
				}
				if (b%2 == 0) {
					b = b/2;
				}  else {
					b = 3*b +1;
				}
				num2 ++;
			}
			if (a == 1 && b==1) {
				System.out.println(a1 + " needs " + arr[b]+ " steps, " + b1 + " needs "+ num2 + " steps, they meet at " + b);
			}
			
		
		
		}
	}
}
