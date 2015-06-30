
// 题目1436：Repair the Wall

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1436
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1454
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int l = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }

            Arrays.sort(array);
            int count = 0;
            int i = n - 1;
            while (i >= 0 && l >= array[i]) {
                l -= array[i];
                i--;
                count++;
            }
            if (i < 0 && l > 0) {
                System.out.println("impossible");
            } else if (l == 0) {
                System.out.println(count);
            } else if (i >= 0 && l > 0) {
                System.out.println(count + 1);
            }
        }
    }
}
/**************************************************************
 Problem: 1436
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:23488 kb
 ****************************************************************/




