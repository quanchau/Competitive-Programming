import java.util.*;
public class PowerStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			if (s.equals(".")) {
				break;
			}
			CharSequence cs =s;
			int[] sf = SuffixArray.suffixArray(cs);
			int[] arr = new int[s.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr.length - i;
			}
			int max = 1;
			int count = 1;
		    int l = arr[sf[0]];
			for (int i = 1; i < sf.length; i++) {
				if(arr[sf[i]]%l == 0) {
					count++;
				} else{
					count = 1;
					l = arr[sf[i]];
				}
				if (count > max) {
					max = count;
				}
			}
			System.out.println(max);
		}
	}
}
