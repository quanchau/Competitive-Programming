import java.util.*;
public class GetShorty {
	static int n;
	static final int INF = -1;
	static HashMap<Integer, ArrayList<double[]>> list;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			n = in.nextInt();
			int m = in.nextInt();
			if (n == 0 && m == 0) break;
			dist = new double[n];
			list = new HashMap<Integer, ArrayList<double[]>>();
			for (int i = 0; i < n; i++) {
				list.put(i, new ArrayList<double[]>());
				dist[i] = INF;
			}
			dist[0] = 1;
			for (int i = 0; i < m ; i++) {
	            int u = in.nextInt();
	            int v = in.nextInt();
	            double f = in.nextDouble();
	            double[] i1 = {u, f};
	            double[] i2 = {v ,f};
	            list.get(u).add(i2);
	            list.get(v).add(i1);

			}
		
			boolean[] alr = new boolean[n];
	        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
	        queue.add(new Vertex(0));
	        while(!queue.isEmpty()) {
	            int u = queue.poll().num;
	            alr[u] = false;
	            ArrayList<double[]> temp = list.get(u);
	            for (double[] i : temp) {
	                double newDist = dist[u]*i[1];
	               if (newDist > dist[(int)i[0]]) {
	                	dist[(int)i[0]] = newDist;
	                    if (!alr[(int)i[0]]) {
	                        alr[(int)i[0]] = true;
	                        queue.add(new Vertex((int)i[0]));
	                    }
	                }
	            }
	        }
	        System.out.printf("%.4f", dist[n-1]);
	        System.out.println();
	           
	    }
	}
	 
	static double[] dist;
	
	
	public static class Vertex implements Comparable<Vertex> {
	        int num;
	        public Vertex(int i) {
	            num= i;
	        }
	        
	        public int compareTo(Vertex v2) {
	            return -Double.compare(dist[this.num], dist[v2.num]);
	        }
	    }


	

}
