import java.util.*;
public class KastenlaufNew {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
		Step start = new Step(in.nextInt(), in.nextInt());
		Deque<Step> deque = new ArrayDeque<Step>();
		deque.addLast(start);
		Deque<Step> deque2 = new ArrayDeque<Step>();
		for (int i = 0; i< n; i++) {
			deque2.addLast(new Step(in.nextInt(), in.nextInt()));
		}
	    Step des = new Step(in.nextInt(), in.nextInt());
	    boolean yes = false;
		deque2.addLast(des);
		while (!deque.isEmpty()) {
			Step s = deque.remove();
			int size = deque2.size();
			for (int i = 0; i< size; i++) {
				Step temp = deque2.remove();
				int dif = Math.abs(s.x - temp.x) + Math.abs(s.y -temp.y);
				if (dif > 1000) {
					deque2.addLast(temp);
				} else {
					if (temp.x == des.x && temp.y == des.y) {
						System.out.println("happy");
						yes = true;
						break;
					}
					deque.addLast(temp);
				}
			}
			if (yes) {
				break;
			}
		}
		if (!yes) {
			System.out.println("sad");
		}
		}
		
	}
	
	public static class Step {
		int x;
		int y;
		public Step(int initX, int initY) {
			x = initX;
			y = initY;
		}
	}
}
