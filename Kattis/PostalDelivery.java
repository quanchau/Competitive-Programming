package KattisPractice;

import java.util.*;

public class PostalDelivery {
	static final int INF = 1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c =in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		ArrayList<Integer> pos = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int p = in.nextInt();
			int d = in.nextInt();
			map.put(p, d);
			if (p >= 0) pos.add(p);
			else neg.add(p);
			
		}
		Collections.sort(pos);
		Collections.sort(neg, Collections.reverseOrder());
		long sum = 0;
		int rem = c;
		int index = pos.size() -1;
		if (pos.size() > 0) {
			sum += pos.get(pos.size()-1);
			sum += pos.get(0);
		
		}
		while (index >= 0) {
			if (index < pos.size() -1) sum += Math.abs(pos.get(index+1) - pos.get(index));
			int temp = map.get(pos.get(index));
			if (rem >= temp) {
				rem = rem - temp;
			} else {
				while (temp > 0) {
					if (temp <= rem) {
			
						rem = rem - temp;
						temp = 0;
						break;
					}
					temp = temp - rem;
					rem = c;
					sum += ((Math.abs(pos.get(index)))*2);
				}
			}
			
			index--;
		}
	
		index = neg.size() -1;
		if (neg.size() > 0) {
			sum += Math.abs(neg.get(neg.size()-1));
			sum += Math.abs(neg.get(0));
		}
		rem = c;
		while (index >= 0) {
			if (index < neg.size() -1) sum += Math.abs(neg.get(index+1) - neg.get(index));
			int temp = map.get(neg.get(index));
			if (rem >= temp) {
				rem = rem - temp;
			} else {
				while (temp > 0) {
					if (temp <= rem) {
				
						rem = rem-temp;
						temp =0;
						break;
					}
					temp = temp - rem;
					rem = c;
					sum += ((Math.abs(neg.get(index)))*2);
				}
			}
			
			index--;
		}

		System.out.println(sum);


		
	}

}
