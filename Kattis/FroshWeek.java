import java.util.*;
public class FroshWeek {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		arr = new int[n];
		for (int i = 0; i< n; i++) {
			arr[i] = in.nextInt();
		}
		c = 0;
		mergeSort(0, arr.length-1);

		System.out.println(c);
	}
	static int[] arr;
	static long c;
	
		public static void mergeSort(int start, int end) {
			if (start < end) {
			int mid = (start + end)/2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			merge(start, mid ,end);
			}
			
			
		}
		
		public static void merge(int start, int mid, int end) {
			int[] left = new int[mid+1-start];
			int[] right = new int[end - mid];
			int ind1 = 0;
			int ind2 = 0;
			for (int i = start; i <= mid; i++) {
				left[ind1] = arr[i];
				ind1++;
			}
			for (int i = mid+1; i <= end; i++) {
				right[ind2] = arr[i];
				ind2++;
			}
			int num = start;
			int i = 0;
			int j = 0;
	
			for (int k = start; k<= end; k++) {
				if (j < right.length && (i == left.length || left[i] > right[j]) ) {
					arr[k] = right[j];
					c+= ind1 - i;
					j++;
				} else {
					arr[k] = left[i];
					i++;
				}
			}

			

		
		}

}
