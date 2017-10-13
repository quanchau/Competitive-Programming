import java.util.*;
public class GlitchBot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		desX = in.nextInt();
		desY = in.nextInt();
		n =in.nextInt();
		arr = new String[n];
		String[] temp = {"North", "East", "South", "West"};
		dirs = temp;
		for (int i = 0; i < n; i++) {
			arr[i] = in.next();
			
		}
		
		for (int i = 0; i <n; i++) {
			String s = arr[i];
			if (!s.equals("Forward")) {
				arr[i] = "Forward";
				generate(0, 0, 0, 0);
				arr[i] = s;
			}
			if (ok) {
				System.out.println(i+1 + " Forward");
				break;
			}
			
			if (!s.equals("Left")) {
				arr[i] = "Left";
				generate(0, 0, 0, 0);
				arr[i] = s;
			}
			if (ok) {
				System.out.println(i+1 + " Left");
				break;
			}
			
			if (!s.equals("Right")) {
				arr[i] = "Right";
				generate(0, 0, 0, 0);
				arr[i] = s;
			}
			if (ok) {
				System.out.println(i+1 + " Right");
				break;
			}
			
		}
	}	
	static int desX;
	static int desY;
	static int n;
	static String[] arr;
	static String[] dirs;
	static boolean ok;
	public static void generate(int index, int x, int y, int dir) {
		if (index == n) {
			if (x == desX && y == desY) {
				ok = true;
			}
		} else {
		if (arr[index].equals("Forward")) {
			if (dir == 0) y += 1;
			else if (dir == 1) x+= 1;
			else if (dir == 2) y-= 1;
			else x-= 1;
		} else if (arr[index].equals("Right")) {
			dir = (dir + 1)%4;
		} else {
			dir = (dir - 1 + 4)%4;
		}
		
		generate(index+1, x, y, dir);
		}
	}
}
