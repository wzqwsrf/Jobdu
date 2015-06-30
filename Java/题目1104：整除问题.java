
// 题目1104：整除问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1104
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1104
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int a = (int) st.nval;
            int sum = 1;
            int count = 0;
            for (int i = 2; i <= n; i++) {
                sum = sum * i;
                while (sum % a == 0) {
                    count++;
                    sum = sum / a;
                }
                sum = sum % a;
            }
            System.out.println(count);
        }
    }
}
/**************************************************************
 Problem: 1104
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14560 kb
 ****************************************************************/




