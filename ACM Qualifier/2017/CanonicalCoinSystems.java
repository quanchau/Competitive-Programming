import java.util.*;
public class CanonicalCoinSystems {
    static final int INF = 100000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i<n ;i++) {
            arr[i] = in.nextInt();
            
        }
        memGreedy = new int[arr[n-1]+arr[n-2]+1];
        memChange = new int[arr[n-1]+arr[n-2]+1];
        boolean can = true;
        for (int i = arr[0];i < arr[n-1]+arr[n-2]+1; i++) {
            int greedy = greedy(n-1, i);
            int change = change(i);
            if (change < greedy) {
                can = false;
                break;
            }
        }
        if (can) System.out.println("canonical");
        else System.out.println("non-canonical");
        
        
        
    }
    static int[] memChange;
    static int[] memGreedy;
    static int[] arr;
    public static int greedy(int index, int val) {
        if (val == 0) return 0;
        if ((index < 0 && val > 0) || val < 0) return INF;
        
        if (memGreedy[val] > 0) return memGreedy[val];
        int res = 0;
        if (val - arr[index] >= 0) {
            res=  1 + greedy(index, val-arr[index]);
        } else {
            res = greedy(index-1, val);
        }
        memGreedy[val] = res;
        return res;
    }
    
    public static int change(int val) {
        if (val == 0) return 0;
        if (val < 0) return INF;
        if (memChange[val] > 0) return memChange[val];
        int res = INF;
        for (int i = 0; i < arr.length; i++) {
            res = Math.min(res, 1 + Math.min(res,change(val - arr[i])));
        }
        memChange[val] = res;
        return res;
        
    }
}
