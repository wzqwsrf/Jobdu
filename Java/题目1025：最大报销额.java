
// 题目1025：最大报销额

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1025
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19124427
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1025
     */
public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double q = scanner.nextDouble();
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            List<Integer> numList = new ArrayList<Integer>();
            while (n > 0) {
                double A = 0;
                double B = 0;
                double C = 0;
                int valid = 0;
                int m = scanner.nextInt();
                while (m > 0) {
                    String a = scanner.next();
                    String typeArr[] = a.split(Pattern.quote(":"));
                    double price = Double.parseDouble(typeArr[1]);
                    if (typeArr[0].equals("A")) {
                        A += price;
                    }else if (typeArr[0].equals("B")) {
                        B += price;
                    }else if (typeArr[0].equals("C")) {
                        C += price;
                    }else {
                        valid = 1;
                    }
                    m--;
                }
                 
                if (valid == 0 && A <= 600.00 && B <= 600.00 && C <= 600.00) {
                    double total = A + B + C;
                    if (total <= 1000.00 && total <= q) {
                        numList.add((int) (total*100));
                    }
                }
                n--;
            }
            int len = numList.size();
            int hunq = (int) (q * 100);
            int dp[] = new int[hunq + 1];
            for (int i = 0; i < len; i++) {
                int tempNum = numList.get(i);
                for (int j = hunq; j >= tempNum; j--) {
                    dp[j] = Math.max(dp[j], dp[j - tempNum] + tempNum );
                }
            }
            double res = (double)(dp[hunq]/100.00);
            System.out.printf("%.2f\n" , res);
        }
    }}
/**************************************************************
 Problem: 1025
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:420 ms
 Memory:49096 kb
 ****************************************************************/




