package KattisPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TheCalculusOfAda {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
			
		}
		long sum = list.get(list.size()-1);
		int count= 0;
		while (list.size() > 1) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			boolean same = true;
			int prev = list.get(1)-list.get(0);
			for (int i = 0; i +1 < list.size(); i++) {
				int num = list.get(i+1) - list.get(i);
				temp.add(num);
				if (num != prev) {
					same = false;
				}
				
			}
			sum += temp.get(temp.size()-1);
			list = temp;
			count++;
			if (same) break;
		}
		System.out.println(count + " " + sum);
		
	}
}
