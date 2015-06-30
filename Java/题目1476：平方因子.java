
// 题目1476：平方因子

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1476
 */

import java.util.Scanner;

public class Main {
    /*
     * 1476 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            boolean flag = false;
            for (int i = (int) Math.sqrt(n); i < n; i++) {
                if (n % i == 0 && (i * i) % n == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
/**************************************************************
 Problem: 1476
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:16988 kb
 ****************************************************************/




