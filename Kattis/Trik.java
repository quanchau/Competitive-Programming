import java.util.*;
public class Trik {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		arr= new int[3];
		arr[0] = 1;
		String s=  in.next();
		for (int i= 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') swap(1,2);
			else if (s.charAt(i) == 'B') swap(2,3);
			else swap(1,3);
		}
		for (int i = 0; i < 3; i++) {
			if (arr[i] == 1) {
				System.out.println(i+1);
				break;
			}
		}
	}
	
	public static void swap(int i1, int i2) {
		int temp = arr[i1-1];
		arr[i1-1] = arr[i2-1];
		arr[i2-1] = temp;
	}

}
