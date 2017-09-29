import java.util.*;
public class BigTruck {
    static int n;
    static int[] items;
    static ArrayList<ArrayList<Integer>> adj;
    static int[][] vals;
    static long[] dist;
    static final int INF = 1000000007;
    static int[] itemNums;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        items = new int[n+1];
        dist = new long[n+1];
        itemNums = new int[n+1];
        adj = new ArrayList<ArrayList<Integer>>();
        vals = new int[n+1][n+1];
        adj.add(new ArrayList<Integer>());
        for (int i = 1; i <= n; i++){ 
            items[i] = in.nextInt();
            dist[i] = INF;
            adj.add(new ArrayList<Integer>());
            itemNums[i] = -1;
        }
        int m = in.nextInt();
        for (int i = 0; i < m ; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int val = in.nextInt();
            vals[u][v] = val;
            vals[v][u] = val;
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }

        PriorityQueue<Step> q = new PriorityQueue<Step>();
        q.add(new Step(1, items[1]));
        dist[1] = 0;
        itemNums[1] = items[1];
        while(!q.isEmpty()) {
            Step s = q.remove();
            ArrayList<Integer> temp = adj.get(s.pos);
    
            for (int i : temp) {
                long newDist = dist[s.pos] + vals[s.pos][i];
                int newItems = itemNums[s.pos]  + items[i];
                if (newDist< dist[i] || (newDist == dist[i] && newItems > itemNums[i])) {
                	itemNums[i] = newItems;
                    dist[i] = newDist;
                    if (i == n) continue;
                    q.add(new Step(i, s.items + items[i]));
                    
                }
            }
        }
        if (dist[n] >= INF) System.out.println("impossible");
        else System.out.println(dist[n] + " " + itemNums[n]);
        
    }
    
    static class Step implements Comparable<Step> {
        int pos;
        int items;
        public Step(int x, int it) {
            pos = x;
            items = it;
        }
        public int compareTo(Step s2) {
        	if (Long.compare(dist[pos], dist[s2.pos]) == 0) return -Integer.compare(itemNums[pos], itemNums[s2.pos]);
            return Long.compare(dist[pos], dist[s2.pos]);
        }
    }
}