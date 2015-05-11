
// 题目1092：Fibonacci

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年05月11日17:52:51
 * @url:http://ac.jobdu.com/problem.php?pid=1092
 */

import java.io.StreamTokenizer;

public class Prob1092 {
    /*
     * 1092
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println(getFibNum(n));
        }
    }

    private static int getFibNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibNum(n - 1) + getFibNum(n - 2);
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1092
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:100 ms
 * Memory:15684 kb
 * **************************************************************
 */