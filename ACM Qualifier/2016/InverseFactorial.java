import java.util.*;
import java.math.*;
public class InverseFactorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long[] arr = new long[10];
		double[] log = new double[1000001];
		arr[1] = 1;
		arr[0] = 1;
		int sum = 1;
		log[1] = 0;
	
		
		for (int i = 2; i < 10; i++) {
			arr[i] = arr[i-1]*i;
		}
		int largest = ("" + arr[9]).length();
		if (s.length() <= largest) {
			for (int i = 1; i <=9 ; i++) {
				if (s.equals("" + arr[i])) {
					System.out.println(i);
					break;
				}
			}
		} else {
			for (int i = 2; i < 1000001; i++) {
				log[i] = Math.log10(i)+ log[i-1];
				if (log[i] + 1 >= s.length())  {
					System.out.println(i);
					break;
				}
					
			}
		}
		
	}
}
