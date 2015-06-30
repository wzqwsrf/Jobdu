
// 题目1142：Biorhythms

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1142
 */

import java.util.Scanner;

public class Main {
    /*
     * 1142
     */
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int t = 0;
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int e = scanner.nextInt();
            int i = scanner.nextInt();
            int d = scanner.nextInt();
            if (p == -1 && e == -1 && i == -1 && d == -1) {
                break;
            }
            int sum = (5544 * p + 14421 * e + 1288 * i) % 21252;
            if (sum - d <= 0) {
                sum += 21252;
            }
            System.out.printf(
                    "Case %d: the next triple peak occurs in %d days.", ++t,
                    sum - d);
            System.out.println();
        }
    }
}

/**************************************************************
 Problem: 1142
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15628 kb
 ****************************************************************/




