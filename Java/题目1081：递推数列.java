
// 题目1081：递推数列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1081
 */

import java.util.Scanner;

public class Main {
    /*
     * 1081
     */
    private static int mod = 10000;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a0 = scanner.nextInt();
            int a1 = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int k = scanner.nextInt();
            if (k == 0) {
                System.out.println(a0 % mod);
            } else if (k == 1) {
                System.out.println(a1 % mod);
            } else {
                int a = a1 % mod, b = a0 % mod;
                int l = 1, m = 0;
                while (k > 0) {
                    if (k % 2 != 0) {
                        int temp = a;
                        a = (p * a + q * b) % 10000;
                        b = (l * temp + m * b) % 10000;
                        --k;
                    } else {
                        k = k / 2;
                        int temp1 = p, temp2 = q, temp3 = l, temp4 = m;
                        p = (temp1 * temp1 + temp2 * temp3) % 10000;
                        q = (temp1 * temp2 + temp2 * temp4) % 10000;
                        l = (temp1 * temp3 + temp3 * temp4) % 10000;
                        m = (temp3 * temp2 + temp4 * temp4) % 10000;
                    }
                }
                System.out.println(b);
            }
        }
    }
}

/**************************************************************
 Problem: 1081
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:430 ms
 Memory:30192 kb
 ****************************************************************/




