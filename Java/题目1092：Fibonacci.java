
// 题目1092：Fibonacci

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1092
 */

import java.io.StreamTokenizer;

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
/**************************************************************
 Problem: 1092
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:15684 kb
 ****************************************************************/




