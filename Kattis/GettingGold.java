import java.util.*;
public class GettingGold {
	static int[][] arr;
	static int w;
	static int h;
	static int[] list1;
	static int[] list2;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		w = in.nextInt();
		h = in.nextInt();
		arr= new int[h][w];
		int x = 0;
		count = 0;
		int y = 0;
		int[] list11 = {0, -1, 1, 0};
		int[] list22 = {-1, 0, 0, 1};
		list1 = list11;
		list2 = list22;
		visited = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			String s = in.next();
			for (int j = 0; j < w;j++) {
				char c = s.charAt(j);
				if (c == '.') {
					arr[i][j] = 1; 
				} else if (c == 'G') {
					arr[i][j] = 2;
				} else if (c == 'T') {
					arr[i][j] = -1;
				} else if (c == 'P') {
					arr[i][j] = 1;
					x = j;
					y= i;
				}
			}
		}
		generate(x, y);
		System.out.println(count);
	}
	static int count;
	static boolean[][] visited;
	public static void generate(int x, int y) {
		if (!visited[y][x]) {
			visited[y][x] = true;
			if (arr[y][x] != -1 && arr[y][x] != 0) {

				if (arr[y][x] == 2){
					count++;
				} 

				boolean ok = true;
				for (int i = 0; i < 4; i++) {

						if (y+list1[i] >=0 && y+list1[i] < h && x+list2[i] >=0 && x+list2[i] < w && arr[y+list1[i]][x+list2[i]] == -1) {
							ok = false;
						
					}
				}
				if (ok) {
					for (int i = 0; i < 4; i++) {
							if (y+list1[i] >=0 && y+list1[i] < h && x+list2[i] >=0 && x+list2[i] < w) {
								generate(x+list1[i], y+list2[i]);
							}
						
					}
				}
			}
		}
	}
}
