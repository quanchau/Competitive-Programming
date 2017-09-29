import java.util.*;
import java.math.*;
public class ThreePowers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger[] arr = new BigInteger[64];
		arr[0] = new BigInteger("1");
		BigInteger three = new BigInteger("3");
		for (int i = 1; i <64; i++) {
			arr[i] = arr[i-1].multiply(three);
		}
		
		while (in.hasNext()) {
			BigInteger n = new BigInteger(in.next());
			n = n.subtract(arr[0]);
			if (n.equals(new BigInteger("-1"))) {
				break;
			} 
			ArrayList<BigInteger> res = new ArrayList<BigInteger>();
			System.out.print("{ ");
			for (int i = 0; i < 64; i++) {
				if (n.testBit(i)) {
					res.add(arr[i]);
				}
			}
			for (int i = 0; i < res.size(); i++) {
				if (i == res.size() -1) {
					System.out.print(res.get(i) +" ");
				} else {
					System.out.print(res.get(i) + ", ");
				}
			}
			System.out.print("}");
			System.out.println();
		}
	}
}
