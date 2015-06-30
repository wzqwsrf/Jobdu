
// 题目1179：阶乘

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1179
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
     * 1179
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            long evenNum = 0;
            long oddNum = 0;
            for (long i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    evenNum += getFactorial(i);
                } else {
                    oddNum += getFactorial(i);
                }
            }
            System.out.println(oddNum + " " + evenNum);
        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-10,下午12:26:10
     * @author wangzq
     * @version 3.0.0
     *
     * @param n
     * @return
     */
    private static long getFactorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
/**************************************************************
 Problem: 1179
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15488 kb
 ****************************************************************/




