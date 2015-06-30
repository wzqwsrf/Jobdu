
// 题目1483：求最大最小数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1483
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
     * 1483
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int num = (int) st.nval;
            int max = num;
            int min = num;
            for (int i = 1; i < n; i++) {
                st.nextToken();
                int tempNum = (int) st.nval;
                if (tempNum > max) {
                    max = tempNum;
                }
                if (tempNum < min) {
                    min = tempNum;
                }
            }
            System.out.println(max + " " + min);
        }
    }
}

/**************************************************************
 Problem: 1483
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:19064 kb
 ****************************************************************/




