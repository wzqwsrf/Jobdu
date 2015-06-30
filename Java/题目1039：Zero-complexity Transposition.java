
// 题目1039：Zero-complexity Transposition

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1039
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
     * 1039
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            long array[] = new long[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (long) st.nval;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = n - 1; i > 0; i--) {
                sb.append(array[i] + " ");
            }
            sb.append(array[0]);
            System.out.println(sb.toString());
        }
    }
}
/**************************************************************
 Problem: 1039
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14560 kb
 ****************************************************************/




