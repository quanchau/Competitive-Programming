import java.util.*;
public class NarrowArtGallery {
	static int n;
	static int k;
	static int[][][] mem;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		n = in.nextInt();
		k = in.nextInt();
		if (n == 0 && k ==0) {
			break;
		}
		mem = new int[n][3][k+1];
		arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
			for (int j = 0; j <3; j++) {
				for (int m = 0; m < k+1; m++) {
					mem[i][j][m] = -1;
				}
			}
		}
		
		System.out.println(res(n, 2, 0));
		}
		
	}
	
	public static int res(int x, int y, int count) {
		if (x == 0) {
			if (count < k) {
	//			System.out.println(x + " " + y + " " + count + " " + (-80002));
				mem[x][y][count] = -80002;
				return -80002;
			} else {
				mem[x][y][count] = 0;
				return 0;
			}
		}
		
		if (x < n && mem[x][y][count] != -1) {
			return mem[x][y][count];
		}
		int num = -90000;
		if (count < k) {
			if (y == 2) {
				num = Math.max(num, arr[x-1][0] + res(x-1,1,count+1));
				num = Math.max(num, arr[x-1][1] + res(x-1,0,count+1));			
			} else if (y == 1) {
				num = Math.max(num, arr[x-1][0] + res(x-1,1,count+1));
			} else if (y == 0) {
				num = Math.max(num, arr[x-1][1] + res(x-1,0,count+1));
			}
		} 
		num = Math.max(num, arr[x-1][0] + arr[x-1][1] + res(x-1,2,count));
		if (x < n) {
		mem[x][y][count] = num;
		}
		return num;
	}
}
