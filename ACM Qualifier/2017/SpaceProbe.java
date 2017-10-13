import java.util.*;
public class SpaceProbe {
	static Interval[] ins;
	static long[] arr;
	static ArrayList<Interval> res;
	static int n;
	static int k;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		res = new ArrayList<Interval>();
		long t1 = in.nextLong();
		long t2 = in.nextLong();
		ins = new Interval[k];
		arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLong();
		}
		for (int i = 0; i < k; i++) {
			ins[i] = new Interval(in.nextLong(), in.nextLong());
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				long start = Math.max(t1, ins[j].s-arr[i]);
				long end = Math.min(t2, ins[j].e - arr[i]);
				if (start < end) {
					res.add(new Interval(start, end));
				}
			}
		}
		long sum = 0;
		Collections.sort(res);
		if (res.size() > 0) {
			long start = res.get(0).s;
			long end = res.get(0).e;
			sum += (end - start);
			for (int i = 1; i < res.size(); i++) {
				Interval temp = res.get(i);
				if (temp.s < end) {
					sum += Math.max(0, temp.e - end);
					end = Math.max(temp.e, end);
				} else {
					start = temp.s;
					end = temp.e;
					sum += (end - start);
				}
			}
		}
		
		/**Collections.sort(res);
		long sum = 0;
	//	System.out.println(res);
		if (res.size() > 0) { 
			long min = res.get(0);
			for (int i = 1; i < res.size(); i++) {
				if (res.get(i) - res.get(i-1) > 1) {
					sum+= (res.get(i-1)-min);
					min = res.get(i);
				} 
				if (i == res.size()-1) sum+= (res.get(i)-min);
			}
		} else {
			sum = 0;
		}*/
		
		System.out.printf("%.6f",1- (double)(sum)/(t2-t1));
	
		
	}
	
	public static class Interval implements Comparable<Interval> {
		long s;
		long e;
		public Interval(long ss, long ee) {
			s = ss;
			e = ee;
		}
		public int compareTo(Interval i2) {
			int start = Long.compare(s, i2.s);
			if (start == 0) {
				return Long.compare(e, i2.e);
			}
			return start;
		}
	}
	
	/**public static void binarySearch(long start, long end) {
		if (start < end) {
			long mid = (start + end)/2;
			if (mid + arr[0] >= ins[k-1].e) {
				binarySearch(start, mid);
			} else if (mid + arr[n-1] <= ins[0].s) {
				binarySearch(mid+1, end);
			} else {
				boolean ok = true;
				for (int i = 0; i < n; i++) {
					long temp = mid + arr[i];
					for (int j = 0; j < k; j++) {
						if (temp <= ins[j].e && temp >= ins[j].s) {
							res.add(mid);
							ok = false;
							break;
						}
					}
					if (!ok) break;
				}
				binarySearch(start, mid);
				binarySearch(mid+1, end);
			}
		}
	} */
}
