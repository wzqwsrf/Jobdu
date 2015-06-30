
// 题目1207：质因数的个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1207
 */

import java.util.Scanner;

public class Main {
    /*
     * 1207
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            int count = 0;
            while (n != 1) {
                n = isPrime(n);
                if (n == 1) {
                    System.out.println(count + 1);
                } else {
                    count++;
                }
            }
        }
    }

    private static long isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                n = n / i;
                return n;
            }
        }
        return 1;
    }
}
/**************************************************************
 Problem: 1207
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18928 kb
 ****************************************************************/




