import java.util.*;
public class BankQueue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int t = in.nextInt();
		HashMap<Integer, PriorityQueue<Integer>> list = new HashMap<Integer, PriorityQueue<Integer>>();
		for (int i = 0; i<t; i++) {
			list.put(i, new PriorityQueue<Integer>(Collections.reverseOrder()));
		}
		int[] arr = new int[n];
		for (int i = 0; i <n; i++) {
			int temp = in.nextInt();
			arr[i] = in.nextInt();
			list.get(arr[i]).add(temp);	
		}
		Arrays.sort(arr);
		long sum = 0;
		int time = 0;
		PriorityQueue<Integer> res=  new PriorityQueue<Integer>();
		for (int i : arr) {
			if (i >= time && !list.get(i).isEmpty()) {
				int num = list.get(i).poll();
				res.add(num);
				sum += num;
				time+= 1;
			} else {
				if (list.get(i).peek() > res.peek()) {
					sum -= res.poll();
					int q = list.get(i).poll();
					sum += q;
					res.add(q);
				}
			}
		}
		System.out.println(sum);
		
		
	}
}
