import java.util.*;
public class PerfectPthPowers {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()) {
			long n = in.nextLong();
			if (n ==0) {
				break;
			}
			long max = 1;
		//	System.out.println((int)Math.sqrt(n));
			if (n < 0) {
				for (int i = -2; i >= -(int)Math.sqrt(-n) -1; i--){
					long num =1;
					long temp = (long)Math.pow(i, num);
					while (temp >= n) {
						if (temp ==n) {
							if (num > max) {
								max = num;
							}
							break;
						}
					
						num+= 2;
						temp = (long)Math.pow(i, num);
						
					}
				}
			} else {
			for (int i = 2; i <= (int) Math.sqrt(n) +1; i++) {
				long num =1;
				long temp = (long)Math.pow(i, num);
				while (temp <= n) {
					if (temp ==n) {
						if (num > max) {
							max = num;
						}
						break;
					}
					num++;
					temp = (long)Math.pow(i, num);
				}
			}
			}
			
			System.out.println(max);
		
	}
	}
 

	
}
