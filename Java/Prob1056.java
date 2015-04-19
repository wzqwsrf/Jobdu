
// 题目1056：最大公约数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:46:55
 * @url:http://ac.jobdu.com/problem.php?pid=1056
 */

import java.util.Scanner;

public class Prob1056 {
    /*
     * 1056
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            for (long i = Math.min(a, b); i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1056
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:80 ms
 * Memory:15460 kb
 * **************************************************************
 */