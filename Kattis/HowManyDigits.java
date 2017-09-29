import java.util.*;
public class HowManyDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] mem = new double[1000001];
		int temp = 1;
		double res = 0;
		while (temp <= 1000000) {
			res += Math.log10(temp);
			mem[temp] = res;
			temp++;

		}
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				System.out.println(1);
			} else {
				System.out.println((int)Math.floor(mem[n]) +1);
			}
			
		}
	}

}
