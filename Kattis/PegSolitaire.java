import java.util.*;
public class PegSolitaire {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i_n = 0; i_n < n; i_n++) {
			arr = new char[5][9];
			count = 0;
			for (int i = 0; i < 5; i++) {
				String s = in.next();
				for (int j = 0; j < 9; j++) {
					arr[i][j] = s.charAt(j);
					if (arr[i][j] == 'o') count++;
				}
			}
			
			min = 10000;
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 9; j++) {
					generate(i, j, 0);
				}
			}
			System.out.println(min + " " + minSteps);
		}
	}
	static char[][] arr;
	static int min;
	static int minSteps;
	static int count;
	
	public static void generate(int x, int y, int c) {
		boolean ok = true;
		if (count < min) {
			min = count;
			minSteps= c;
		} else if (count == min && c < minSteps) {
			minSteps = c;
		}
		
		if (arr[x][y] == 'o') {
			if (x + 1 < 4 && arr[x+1][y] == 'o' && arr[x+2][y] == '.') {
			    arr[x][y] = '.';
				arr[x+1][y] = '.';
				arr[x+2][y] = 'o';
				count--;
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 9; j++) {
						generate(i, j, c+1);
					}
				}
			    arr[x][y] = 'o';
				arr[x+1][y] = 'o';
				arr[x+2][y] = '.';
				count++;
			}
			if (x - 1 > 0 && arr[x-1][y] == 'o' && arr[x-2][y] == '.') {
				ok = false;
				count--;
				arr[x][y] = '.';
				arr[x-1][y] = '.';
				arr[x-2][y] = 'o';
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 9; j++) {
						generate(i, j, c+1);
					}
				}
				  arr[x][y] = 'o';
				arr[x-1][y] = 'o';
					arr[x-2][y] = '.';
				count++;
			}
			

			if (y+1 < 8 && arr[x][y+1] == 'o' && arr[x][y+2] == '.') {
				ok = false;
				count--;
				  arr[x][y] = '.';
				arr[x][y+1] = '.';
				arr[x][y+2] = 'o';
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 9; j++) {
						generate(i, j, c+1);
					}
				}
				  arr[x][y] = 'o';
				arr[x][y+1] = 'o';
				arr[x][y+2] = '.';
				count++;
			}
			
			if (y - 1 > 0 && arr[x][y-1] == 'o' && arr[x][y-2] == '.') {
				ok = false;
				count--;
				  arr[x][y] = '.';
				arr[x][y-1] = '.';
				arr[x][y-2] = 'o';
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 9; j++) {
						generate(i, j, c +1);
					}
				}
				 arr[x][y] = 'o';
				arr[x][y-1] = 'o';
				arr[x][y-2] = '.';
				count++;
			}
			
		}
	}
}