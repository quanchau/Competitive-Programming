import java.util.*;
public class Cross {
	public static void main(String[] args) {
		int[] listX = {0, 3, 6};
		int[] listY = {0, 3, 6};
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int count = 0;
		boolean[] avail = new boolean[10];
		for (int i = 0; i < 9; i++) {
			String s = in.next();
			for (int j = 0; j < 9; j++) {
				char c = s.charAt(j);
				if (c != '.') {
					arr[i][j] = Integer.parseInt("" + c);
					avail[arr[i][j]]= true;
				} else {
					arr[i][j] = 0;
					count++;
				}
			}
		}
		
		boolean ok = false;
		boolean ok2 = true;
		boolean ok3 = true;
		while(ok2) {
			ok2 = false;
			for (int i = 1; i <= 9; i++) {
		//	System.out.println(i);
		//	if (avail[i]) {
				boolean[] x = new boolean[9];
				boolean[] y = new boolean[9];
				int[] cX = new int[9];
				int[] cY = new int[9];
				for (int j = 0; j < 9; j++) {
					for (int k = 0; k < 9; k++) {
						if (arr[k][j] == i) {
							x[j] = true;
							y[k] = true;
							cX[j]++;
							cY[k]++;
							if (cX[j] >=2 || cY[j] >=2) ok3= false;
						}
					}
				}
				//System.out.println(i);
				for (int p : listX) {
					for (int q : listY) {

						int num = 0;
						int resU = 0;
						int resV =0;
						
						int hasI = 0;
						for (int u = p; u <= p+2; u++) {
							for (int v = q; v <= q+2; v++) {
								if(arr[v][u] == i) {
									hasI++;
		
								}
								if (!x[u] && !y[v] && arr[v][u] == 0) {
									num++;
									resU = u;
									resV = v;
								}
								if (num >=2) break;
							}
							if (num>=2) break;
						}
				
						if (num == 1 && hasI == 0) {
							//if (!hasI) {
							ok = true;
							ok2 = true;
							arr[resV][resU] =i;
						}
					
					if (hasI >= 2||(num == 0 && hasI == 0) ) {
						ok3 = false;
					}
					
						
					}
				}
				
				
				
			}
		}
		if (count == 0) ok = true;
		if (!ok|| !ok3)  {
			System.out.println("ERROR");
		} else {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (arr[i][j] == 0) {
						System.out.print(".");
					} else {
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
		}
		
		
	}
}
