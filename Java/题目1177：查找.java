
// 题目1177：查找

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1177
 */

import java.util.Scanner;

public class Main {
    /*
     * 1177
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            int n = scanner.nextInt();
            String newA = a;
            for (int i = 0; i < n; i++) {
                String order = scanner.next();
                if (order.charAt(0) == '0') {
                    int starti = order.codePointAt(1) - '0';
                    int tempLen = order.codePointAt(2) - '0';
                    int endi = starti + tempLen - 1;
                    String startA = newA.substring(0, starti);
                    String midA = newA.substring(starti, endi + 1);
                    String endA = newA.substring(endi + 1);
                    newA = startA + new StringBuffer(midA).reverse().toString()
                            + endA;
                    System.out.println(newA);
                } else if (order.charAt(0) == '1') {
                    int starti = order.codePointAt(1) - '0';
                    int tempLen = order.codePointAt(2) - '0';
                    int endi = starti + tempLen - 1;
                    String midA = newA.substring(starti, endi + 1);
                    String curA = order.substring(3);
                    newA = newA.replace(midA, curA);
                    System.out.println(newA);
                }
            }

        }
    }
}
/**************************************************************
 Problem: 1177
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15476 kb
 ****************************************************************/




