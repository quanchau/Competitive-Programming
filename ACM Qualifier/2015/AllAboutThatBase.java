package ZOIS;
import java.util.*;
import java.math.*;
public class AllAboutThatBase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i_n = 0; i_n < n; i_n++) {
            StringBuilder res = new StringBuilder();
            String num1 = in.next();
            String op = in.next();
            String num2 = in.next();
            in.next();
            String result = in.next();
            int max = 0;
            boolean not1 = false;
            for (int i = 0; i < num1.length(); i++) {
                int num = 0;
                if (num1.charAt(i) != '1') not1 = true;
                if (num1.charAt(i) >= '1' && num1.charAt(i) <='9') num = Integer.parseInt("" +num1.charAt(i));
                else num = num1.charAt(i) - 'a' + 10;
                if (num > max) max =num; 
            }
            for (int i = 0; i < num2.length(); i++) {
                int num = 0;
                if (num2.charAt(i) != '1') not1 = true;
                if (num2.charAt(i) >= '1' && num2.charAt(i) <='9') num = Integer.parseInt("" +num2.charAt(i));
                else num = num2.charAt(i) - 'a' + 10;
                if (num> max) max =num; 
            }
            for (int i = 0; i < result.length(); i++) {
                int num = 0;
                if (result.charAt(i) != '1') not1 = true;
                if (result.charAt(i) >= '1' && result.charAt(i) <='9') num = Integer.parseInt("" +result.charAt(i));
                else num = result.charAt(i) - 'a' + 10;
                if (num> max) max =num; 
            }
            if (max == 1 && !not1) {
                if (op.equals("+") && num1.length() + num2.length() == result.length()) res.append("1");
                if (op.equals("-") && num1.length() - num2.length() == result.length()) res.append("1");
                if (op.equals("*") && num1.length() * num2.length() == result.length()) res.append("1");
                if (op.equals("/") && num1.length() / num2.length() == result.length() && num1.length()%num2.length() == 0) res.append("1");
            }
            for (int i = max+1; i <= 36; i++) {
                BigInteger temp1 = new BigInteger(num1, i);
                BigInteger temp2 = new BigInteger(num2, i);
                if (op.equals("+")) {
                    BigInteger temp3 = temp1.add(temp2);
                    if (temp3.toString(i).equals(result)) {
                        if (i < 10) {
                            res.append(i);
                        } else {
                            if (i == 36) res.append("0");
                            else res.append((char)(i-10 + 'a')); 
                        }
                    } 
                } else if (op.equals("-")) {
                    BigInteger temp3 = temp1.subtract(temp2);
                    if (temp3.toString(i).equals(result)) {
                        if (i < 10) {
                            res.append(i);
                        } else {
                            if (i == 36) res.append("0");
                            else
                            res.append((char)(i-10 + 'a')); 
                        }
                    }
                } else if (op.equals("*")) {
                    BigInteger temp3 = temp1.multiply(temp2);
                    if (temp3.toString(i).equals(result)) {
                        if (i < 10) {
                            res.append(i);
                        } else {
                            if (i == 36) res.append("0");
                            else
                            res.append((char)(i-10 + 'a')); 
                        }
                    }
                } else {
                    BigInteger temp3 = temp1.divide(temp2);
                    if (temp1.mod(temp2).equals(BigInteger.ZERO) && temp3.toString(i).equals(result)) {
                        if (i < 10) {
                            res.append(i);
                        } else {
                            if (i == 36) res.append("0");
                            else
                            res.append((char)(i-10 + 'a')); 
                        }
                    }
                }
            }
                
            
            if (res.length() == 0) System.out.println("invalid");
            else System.out.println(res.toString());
            
        }
    }
}
