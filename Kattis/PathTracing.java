import java.util.*;
public class PathTracing {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int[] list = new int[4];
		int maxX = 0;
		int minX = 0;
		int curX = 0;
		int maxY = 0;
		int minY = 0;
		int curY = 0;
		while(in.hasNext()) {
			String s= in.next();
			if (s.equals("0")) break;
			if (s.equals("down")) {
				curX++;
			} else if (s.equals("up")) curX--;
			else if(s.equals("left")) curY--;
			else curY++;
			arr.add(s);
			maxX = Math.max(curX, maxX);
			minX = Math.min(curX, minX);
			minY = Math.min(curY, minY);
			maxY = Math.max(curY, maxY);
	
		}
		
		int h = maxX- minX +1;
		int w = maxY - minY + 1;
		int[][] res = new int[h][w];
		int x = 0 - minX;
		int y = 0 - minY;
		res[x][y] = 2;
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i);
			if (s.equals("down")) {
				x++;
			} else if (s.equals("up")) {
				x--;
			} else if (s.equals("left")) {
				y--;
			} else {
				y++;
			}
			if (i == arr.size() -1) {
			res[x][y] = 3;
			} else if (res[x][y] !=2) {
				res[x][y] = 1;
			}
		}
		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
 		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j == 0) System.out.print("#");
				if (res[i][j] == 0) {
				System.out.print(" ");
				} else if (res[i][j] == 1) {
					System.out.print("*");
					
				} else if (res[i][j] == 2) {
					System.out.print("S");
				} else {
					System.out.print("E");
				}
				if (j == w-1) System.out.print("#");
			}
			System.out.println();
		}
 		
 		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}
