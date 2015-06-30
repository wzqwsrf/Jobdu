
// 题目1513：二进制中1的个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1513
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
     * 1513
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int t = (int) st.nval;
            for (int i = 0; i < t; i++) {
                st.nextToken();
                int n = (int) st.nval;
                System.out.println(getBinaryNum(n));

            }
        }
    }

    private static int getBinaryNum(int x) {
        int count = 0;
        while (x != 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}

/**************************************************************
 Problem: 1513
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1570 ms
 Memory:37764 kb
 ****************************************************************/




