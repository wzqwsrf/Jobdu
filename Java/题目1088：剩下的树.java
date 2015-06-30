
// 题目1088：剩下的树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1088
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1088
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int l = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int array[] = new int[l + 1];
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int lpoint = (int) st.nval;
                st.nextToken();
                int rpoint = (int) st.nval;
                for (int j = lpoint; j <= rpoint; j++) {
                    array[j] = 1;
                }
            }
            int sum = 0;
            for (int i = 0; i < l + 1; i++) {
                if (array[i] == 0) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
/**************************************************************
 Problem: 1088
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:690 ms
 Memory:25408 kb
 ****************************************************************/




