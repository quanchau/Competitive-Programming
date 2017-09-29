import java.util.*;
public class NinePacks {
	static int[] hs;
	static int[] bs;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		hs = new int[in.nextInt()];
		for (int i = 0; i < hs.length; i++) {
			hs[i] = in.nextInt();
		}
		bs = new int[in.nextInt()];
		for (int i = 0; i < bs.length; i++) {
			bs[i] = in.nextInt();
		}
		memH = new int[100001][hs.length];
		memB = new int[100001][bs.length];
		int res=  minimum();
		if (res > 1000000) System.out.println("impossible");
		else System.out.println(res);
		
	}
	
	static int[][] memH;
	static int[][] memB;
	static final int INF = 1000000007;
	
	static int minimum() {
		int res = INF;
		for (int i = 1; i < 100001; i++) {
			int val = minH(i, hs.length-1) + minB(i, bs.length-1);
			
			res = Math.min(res, val);
			
		}
//	int val = minH(10, hs.length-1) + minB(10, bs.length -1);
		
		return res;
	}
	
	static int minH(int k, int i) {
		if (i == -1 || k < 0) {
			if (k == 0) return 0;
			else return 100000000;
		}
		else {
			if (memH[k][i] > 0) return memH[k][i];
			int takeVal = 1+ minH(k-hs[i], i-1);
			int leaveVal = minH(k, i-1);
			int val = Math.min(takeVal, leaveVal);
			memH[k][i] = val;
			return val;
		}
		
	}
	
	static int minB (int k, int i) {
		if (i == -1 || k < 0) {
			
			if (k == 0) return 0;
			else return 100000000;
		}
		else {
			if (memB[k][i] > 0) return memB[k][i];
			int takeVal = 1+ minB(k-bs[i], i-1);
			int leaveVal = minB(k, i-1);
			int val = Math.min(takeVal, leaveVal);
			memB[k][i] = val;
			
			return val;
		}

	}
}
