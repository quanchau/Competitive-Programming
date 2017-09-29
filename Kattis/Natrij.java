import java.util.*;

public class Natrij {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cur = in.next();
		String tar = in.next();
		int hour1 = Integer.parseInt(cur.substring(0,2));
		int hour2 = Integer.parseInt(tar.substring(0,2));
		int min1 =Integer.parseInt(cur.substring(3,5));
		int min2 = Integer.parseInt(tar.substring(3,5));
		int sec1 = Integer.parseInt(cur.substring(6,8));
		int sec2 = Integer.parseInt(tar.substring(6,8));
		int sec = 0;
		int min = 0;
		int hour = 0;
		if (sec2 >= sec1) sec = sec2 - sec1;
		else {
			sec = 60 - sec1+ sec2;
			min--;
		}
		if (min2 >= min1) {
			min += (min2 - min1);
			
		} else {
			min += 60 - min1 + min2;
			hour--;
		}
		if (hour2 >= hour1) {
			hour += (hour2 - hour1);
			
		} else {
			hour += (24-hour1 + hour2);
		}
		
		if (min < 0) {
			min = min + 60;
			hour--;
		}
		if (hour < 0) hour = hour + 24;
		if (hour == 0 && min ==0 && sec ==0) hour =24;
		String h = "" + hour;
		if (h.length() == 1) h = "0" + h;
		String m = "" + min;
		if (m.length() == 1) m = "0" + m;
		String s = "" + sec;
		if (s.length() == 1) s = "0" + s;

		System.out.println(h + ":" + m + ":" + s);

	}
}
