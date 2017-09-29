import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ButtonBashing {
	static int tar;
	static int gap;
	static int num;
	static int[] arr;
	static int[][] visited;
	static final int INF = 1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i_T= 0; i_T < T; i_T++) {
			int n = in.nextInt();
			tar = in.nextInt();
			gap = INF;
			num = INF;
			arr = new int[n];
			visited = new int[3601][n];
			for (int i = 0 ; i <n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			if (tar == 0) {
				System.out.println("0 0");
			} else {
				Deque<Step> deque= new ArrayDeque<Step>();
				deque.add(new Step(0,0, -1));
				while(!deque.isEmpty()) {
					if (num == 1 && gap == 0) break;
					Step s = deque.remove();
					s.cur = Math.min(s.cur, 3600);
					s.cur = Math.max(s.cur, 0);
					if (s.cur >= tar) {
						if (s.cur - tar < gap) {
							gap = s.cur -tar;
							num = s.count;
						} else if (s.cur- tar == gap) num = Math.min(num, s.count);
					} else {
					if (s.count < num && s.cur < tar && (s.ind == -1 || visited[s.cur][s.ind] == 0 || s.count <= visited[s.cur][s.ind])) {
						if (s.ind != -1)visited[s.cur][s.ind] = s.count;
						for (int i = n-1; i >=0; i--) {
							deque.add(new Step(s.count+1, s.cur + arr[i], i));
						}
					}
					}
				}
				System.out.println(num + " " + gap);
			}
		}
	}
	
	public static class Step {
		int count;
		int cur;
		int ind;
		public Step(int co, int cu, int ii) {
			count = co;
			cur = cu;
			ind = ii;
		}
	}


	
}
