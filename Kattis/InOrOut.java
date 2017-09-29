import java.util.*;
public class InOrOut {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c= 1;
		while(in.hasNext()) {
			System.out.print("Case " + c + ": ");
			double x = in.nextDouble();
			double y = in.nextDouble();
			int r = in.nextInt();
			Step[] arr = new Step[r+1];
		
			boolean ok = true;
			if (r>0) {
			arr[1] = new Step(x, y);
			}
			
			if (r==0) ok = false;
			for (int i = 2; i <= r; i++) {
				double newX = Math.pow(arr[i-1].x,2) - Math.pow(arr[i-1].y, 2) + x;
				double newY =  2*arr[i-1].x*arr[i-1].y + y;
				arr[i] = new Step(newX,newY);
			/**	if (Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2)) < 2) {
					ok = false;
					break;
				}
				
				 || Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < 2
				*/
				
			}
			if (r> 0&& Math.sqrt(Math.pow(arr[r].x, 2) + Math.pow(arr[r].y, 2)) < 2) {
				ok = false;
			
			}
			if (!ok) {
				System.out.print("IN");
			} else {
				System.out.print("OUT");
			}
			System.out.println();
			c++;
		}
	}
	
	public static class Step {
		double x;
		double y;
		public Step(double xx, double yy) {
			x = xx;
			y = yy;
			
		}
	}
}
