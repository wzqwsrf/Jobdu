
// 题目1398：移动次数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1398
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1398
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            int maxi = 0;
            int mini = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                if (array[maxi] <= array[i]) {
                    maxi = i;
                }
                if (array[mini] > array[i]) {
                    mini = i;
                }
            }
            int result = mini - 1 + n - maxi;
            if (mini > maxi) {
                result--;
            }
            System.out.println(result);
        }
    }
}

/**************************************************************
 Problem: 1398
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1100 ms
 Memory:36940 kb
 ****************************************************************/




