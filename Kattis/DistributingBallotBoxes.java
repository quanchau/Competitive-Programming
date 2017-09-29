import java.util.*;
public class DistributingBallotBoxes {
	static int boxes;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			int n = in.nextInt();
			boxes = in.nextInt();
		if (n == -1 && boxes == -1) {
			break;
		}
			list = new ArrayList<Integer>(n);
			int[] arr = new int[5000001];
			for (int i = 0; i< n; i++) {
				int num = in.nextInt();
				list.add(num);
				arr[num] = 1;
			}
			System.out.println(generate(arr, n));
		}
		}
		
	
	public static int generate(int[] arr, int count) {
		int max = -1;
		int maxVal = -1;
		for (int i : list) {
		 if (i/arr[i] > maxVal) {
			 max = i;
			 maxVal = i/arr[i];
		 } else if (i/arr[i] == maxVal && i > max) {
			 max = i;
		 }
		}
		if (count == boxes) {
			return max/arr[max];
		}
		arr[max]++;
		return generate(arr, count+1);
		
		
	}
}
