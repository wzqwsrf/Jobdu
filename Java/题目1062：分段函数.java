
// 题目1062：分段函数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1062
 */

import java.util.Scanner;

public class Main {
    /*
     * 1062
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double num = 0;
            double N = scanner.nextDouble();
            if ((N >= 0.0) && (N < 2.0)) {
                num = 2.5 - N;
            }
            if ((N >= 2.0) && (N < 4.0)) {
                num = 2 - 1.5 * (N - 3) * (N - 3);
            }
            if ((N >= 4.0) && (N < 6.0)) {
                num = N / 2 - 1.5;
            }
            System.out.printf("%.3f\n", num);
        }
    }
}

/**************************************************************
 Problem: 1062
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:680 ms
 Memory:39080 kb
 ****************************************************************/




