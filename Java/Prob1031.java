
// 题目1031：xxx定律

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:18:02
 * @url:http://ac.jobdu.com/problem.php?pid=1031
 */

import java.util.Scanner;

public class Prob1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int num = chanegN(n);
            System.out.println(num);
        }
    }

    /**
     * @param n
     * @Description: TODO
     * @date 2013-8-11,下午04:25:14
     * @author wangzq
     * @version 3.0.0
     */
    private static int chanegN(int n) {
        int num = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                num++;
            } else {
                n = (3 * n + 1) / 2;
                num++;
            }
        }
        return num;
    }
}

/**
 * ***********************************************************
 * Problem: 1031
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:120 ms
 * Memory:18616 kb
 * ***************************************************************/
