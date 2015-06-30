
// 题目1015：还是A+B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1015
 */

import java.util.Scanner;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1015
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int k = scanner.nextInt();
            String newA = a + "";
            String newB = b + "";
            int aLength = newA.length();
            int bLength = newB.length();
            if (k >= aLength && k >= bLength) {
                if (a == b) {
                    System.out.println(-1);
                } else {
                    System.out.println(a + b);
                }
            } else if (k >= aLength && k < bLength) {
                int num = Integer
                        .parseInt(newB.substring(bLength - k, bLength));
                if (a == num) {
                    System.out.println(-1);
                } else {
                    System.out.println(a + b);
                }
            } else if (k < aLength && k >= bLength) {
                int num = Integer
                        .parseInt(newA.substring(aLength - k, aLength));
                if (b == num) {
                    System.out.println(-1);
                } else {
                    System.out.println(a + b);
                }
            } else {
                int numa = Integer.parseInt(newA
                        .substring(aLength - k, aLength));
                int numb = Integer.parseInt(newB
                        .substring(bLength - k, bLength));
                if (numa == numb) {
                    System.out.println(-1);
                } else {
                    System.out.println(a + b);
                }
            }
        }
    }

}
/**************************************************************
 Problem: 1015
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15472 kb
 ****************************************************************/




