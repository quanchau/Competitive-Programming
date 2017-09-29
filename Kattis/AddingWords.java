import java.util.*;
public class AddingWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		while (in.hasNext()) {
			String s = in.next();
			if (s.equals("clear")) {
				map = new HashMap<String, Integer>();
				map2 = new HashMap<Integer, String>();
			} else if (s.equals("def")) {
				String s2 = in.next();
				int num = in.nextInt();
				map.put(s2,  num);
				map2.put(num, s2);
			} else {
				String s2 = in.nextLine();
				String[] temp = s2.split(" ");
				for (int i = 1; i < temp.length; i++) System.out.print(temp[i] + " ");
				int temp2 = 0;
				for (int i = 1; i < temp.length;i+=2) {
					String s3 = temp[i+1];
					if (!map.containsKey(temp[i])) temp2 = -Integer.MAX_VALUE;
					else if (temp2 > -Integer.MAX_VALUE) {
						int num = map.get(temp[i]);
						if (temp[i-1].equals("-")) num = -num;
						temp2 = temp2 + num;
					}
					if (s3.equals("=")) {
						if (!map2.containsKey(temp2) || (map.get(map2.get(temp2)) != temp2)) {
							System.out.print("unknown");
						} else {
							System.out.print(map2.get(temp2));
						}
					}


				}
				System.out.println();
			}
		}
	}
}
