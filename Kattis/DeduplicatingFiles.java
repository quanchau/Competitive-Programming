import java.util.*;
public class DeduplicatingFiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
        	int n = in.nextInt();
            if (n== 0) break;
            in.nextLine();
            String[] arr =new String[n];
            HashMap<String, Integer> hash = new HashMap<String, Integer>();
            HashMap<Long, Integer> map = new HashMap<Long, Integer>();
            for (int i = 0; i <n; i++) {
                arr[i] = in.nextLine();
                byte[] b = arr[i].getBytes();
       
                long sum = 0;
                for (byte temp : b) sum^= temp;
                
                if(!map.containsKey(sum)) {
                	map.put(sum, 1);
                } else {
                	map.put(sum, map.get(sum) +1);
                }    
                if (!hash.containsKey(arr[i])) {
                	hash.put(arr[i], 1);
                } else hash.put(arr[i], hash.get(arr[i])+1);
                
  
            }
            Set<Long> keys = map.keySet();
            int count = 0;
            for (long i : keys) {
            	int num = map.get(i)-1;
            	count += (num*(num+1))/2;
            }
            System.out.print(hash.size() + " ");
            Set<String> keys2 = hash.keySet();
            for (String s : keys2) {
            	int num = hash.get(s)-1;
            	count-=(num*(num+1))/2;
            }
  
            System.out.print(count);
            System.out.println();
        }
    }
}