import java.util.*;
public class KindergartenExcursion {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		arr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = Integer.parseInt("" + s.charAt(i));
		}
		count = 0;
		mergeSort(0, s.length()-1);
		System.out.println(count);
	}
	static long count;
	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end)/2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			merge(start, mid, end);
		}
	}
	
	public static void merge(int s, int m, int e) {
		int[] left = new int[m+1 - s];
		int[] right = new int[e - m];
		int ind1 = 0;
		int ind2 =0;
		for (int i = s; i <= m; i++) {
			left[ind1] = arr[i];
			ind1++;
		}
		for (int i = m+1; i <=e;i++) {
			right[ind2] = arr[i];
			ind2++;
		}
		int k = 0;
		int j = 0;
		
		for (int i = s; i <= e; i++) {
			if (k == left.length || (j < right.length && left[k] > right[j])) {
				arr[i] = right[j];
				count += ind1 - k;
				j++;
			} else {
				arr[i] = left[k];
				k++;
			}
		}
	}
}
