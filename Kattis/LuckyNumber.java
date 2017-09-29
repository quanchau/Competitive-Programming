import java.math.BigInteger;
import java.util.*;

public class LuckyNumber {
	static BigInteger start;
	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i <= 9; i++) {
			generate(2, new BigInteger("" + i));
		}
		System.out.println(count);
		
	}
	
	
	static final BigInteger TEN= new BigInteger("10");
	static long count;
	
	public static void generate(int num, BigInteger a) {
		BigInteger temp = new BigInteger("" + num);
		BigInteger temp2 = a;
		for (int i = 0; i <= 9; i++) {
			a = a.multiply(TEN).add(new BigInteger("" + i));
			if (a.mod(temp).toString().equals("0")) {
				if (num < n) generate(num+1, a);
				else count++;
			}
			a = temp2;
		}
			
		
	}
}
