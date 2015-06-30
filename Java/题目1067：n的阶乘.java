
// 题目1067：n的阶乘

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1067
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
     * 1067
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long num = getFacNum(n);
            System.out.println(num);
        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-12,下午01:18:03
     * @author wangzq
     * @version 3.0.0
     *
     * @param n
     * @return
     */
    private static long getFacNum(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getFacNum(n - 1);
        }
    }
}

/**************************************************************
 Problem: 1067
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15468 kb
 ****************************************************************/




