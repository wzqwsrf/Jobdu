
// 题目1431：Sort

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1431
 */

import java.io.StreamTokenizer;
import java.util.Arrays;

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
     * 1431
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            StringBuffer sb = new StringBuffer();
            if (m >= n) {
                for (int i = n - 1; i > 0; i--) {
                    sb.append(array[i] + " ");
                }
                sb.append(array[0]);
            } else {
                for (int i = n - 1; i > n - m; i--) {
                    sb.append(array[i] + " ");
                }
                sb.append(array[n - m]);
            }
            System.out.println(sb.toString());
        }
    }
}

/**************************************************************
 Problem: 1431
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:690 ms
 Memory:31516 kb
 ****************************************************************/




