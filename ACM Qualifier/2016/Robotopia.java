import java.util.*;
public class Robotopia {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		for (int i_n = 0; i_n < n; i_n++) {
			int l1 = in.nextInt();
			int a1 = in.nextInt();
			int l2 = in.nextInt();
			int a2 = in.nextInt();
			int l0 = in.nextInt();
			int a0 = in.nextInt();
			int count = 1;
			int res = 0;
			int num1 = 0;
			int num2 =0;
			while (true) {
				int tempL1 = l0 - count*l1;
				int tempA1 = a0 - count*a1;
				if (tempL1 <= 0 || tempA1 <= 0) break;
				if (tempL1%l2 == 0 && tempA1%a2==0 && tempL1/l2 == tempA1/a2) {
					res++;
					if (res == 2) {
						break;
					}
					num2 = tempL1/l2;
					num1 = count;
				}
				count++;
			}
			
			if (res == 1) System.out.println(num1 + " " + num2);
			else System.out.println("?");
		}
	}
}
