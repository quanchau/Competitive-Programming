import java.util.*;
public class Arcade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n*(n+1)/2];
		for (int i = 0; i < n*(n+1)/2; i++) {
			arr[i] = in.nextInt();
		}
		double[][] prob = new double[n*(n+1)/2][5];
		for (int i = 0; i < n*(n+1)/2; i++) {
			for (int j = 0; j <5; j++) {
				prob[i][j] = in.nextDouble();
			}
		}
		double[] right = new double[n*(n+1)/2];
		double[][] cal = new double[(n*(n+1))/2][(n*(n+1))/2];
		int count = 1;
		int i = 0;
		while (count*(count+1)/2 <= n*(n+1)/2) {
			cal[i][i] = 1;
			if (i- count >=0) cal[i][i - count] = -prob[i][0];
			if (i - (count-1) >= 0 && count-1 != 0) cal[i][i - (count-1)] = -prob[i][1];
			if (i  + count < n*(n+1)/2) cal[i][i + count] = -prob[i][2];
			if (i  + count + 1 < n*(n+1)/2) cal[i][i + count+1] = -prob[i][3];
			right[i] = prob[i][4] * arr[i];
			if (i+1 == count*(count+1)/2) {
				count++;
			}
			
			i++;
		}
		
	/**	for (int k = 0; k < n*(n+1)/2; k++) {
			for (int j = 0; j < n*(n+1)/2; j++) {
				System.out.print(cal[k][j] + " ");
			}
			System.out.println();
		}*/
		double[] res = generate(cal, right);
		System.out.println(res[0]);
		
		
	}
	
	public static double[] generate(double[][] left, double[] right) {
		int n = right.length;
		double[] res = new double[n];
		for (int p = 0; p < n; p++) {
			int max = p;
			for (int i = p+1; i < n; i++) {
				if (Math.abs(left[i][p]) > Math.abs(left[max][p])) {
					max = i;
				}
			}
			
			double[] temp = left[p];
			left[p] = left[max];
			left[max] = temp;
			
			double tem = right[p];
			right[p] = right[max];
			right[max] = tem;
			
			for (int i = p+1; i <n; i++) {
				double alpha = left[i][p]/left[p][p];
				right[i] -= alpha*right[p];
				for (int j = p; j < n; j++) {
					left[i][j] -= alpha*left[p][j]; 
				}
			}
			
			
		}
		
		for (int i = n-1; i >=0; i--) {
			double sum = 0.0;
			for (int j = i+1; j <n; j++) {
				sum += left[i][j]*res[j];
			}
			
			res[i]= (right[i] - sum)/left[i][i];
		}
		
		return res;
	}
    

}
