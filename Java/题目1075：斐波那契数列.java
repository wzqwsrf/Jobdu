
// 题目1075：斐波那契数列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1075
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
     * 1075
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 2 * i - 2; j++) {
                    sb.append(getFibNum(j) + " ");
                }
                sb.append(getFibNum(2 * i - 2));
                if (i < n) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
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
 Problem: 1075
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2520 ms
 Memory:17464 kb
 ****************************************************************/




