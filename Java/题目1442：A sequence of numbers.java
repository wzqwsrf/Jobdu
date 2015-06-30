
// 题目1442：A sequence of numbers

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1442
 */

import java.util.Scanner;

public class Main {
    /*
     * 1442
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int mod = 200907;
            for (int i = 0; i < n; i++) {
                long firNum = scanner.nextLong();
                long secNum = scanner.nextLong();
                long thrNum = scanner.nextLong();
                int k = scanner.nextInt();
                if (thrNum - secNum == secNum - firNum) {
                    long kNum = firNum % mod
                            + ((k - 1) % mod * (secNum - firNum) % mod) % mod;
                    System.out.println(kNum);
                } else if (thrNum / secNum == secNum / firNum) {
                    long x = thrNum / secNum;
                    long kNum = (firNum % mod * pow(mod, x, k - 1)) % mod;
                    System.out.println(kNum);
                }
            }
        }
    }

    private static long pow(int mod, long x, int k) {
        long sum = 1;
        while (k != 0) {
            if ((k & 1) != 0)
                sum = (sum * x) % mod;
            x = (x * x) % mod;
            k >>= 1;
        }
        return sum;
    }
}
/**************************************************************
 Problem: 1442
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:18864 kb
 ****************************************************************/




