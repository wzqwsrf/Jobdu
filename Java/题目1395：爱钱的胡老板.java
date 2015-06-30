
// 题目1395：爱钱的胡老板

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1395
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1395
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                sum += array[i];
            }
            Arrays.sort(array);
            int dp[] = new int[sum + 1];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = array[i]; j <= sum; j++) {
                    dp[j] += dp[j - array[i]];
                }
                if (dp[sum] > 1) {
                    break;
                }
            }
            System.out.println(dp[sum] == 1 ? sum : -1);
        }
    }
}
/**************************************************************
 Problem: 1395
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:440 ms
 Memory:31444 kb
 ****************************************************************/




