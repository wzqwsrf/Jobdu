
// 题目1262：Sequence Construction puzzles(I)_构造全递增序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1262
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1262
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int maxLen = 0;
            int maxi = 0;
            int dp[] = new int[n];
            int pre[] = new int[n];
            for (int i = 0; i < n; i++) {
                int tempLen = 0;
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[i] && dp[j] > tempLen) {
                        tempLen = dp[j];
                        pre[i] = j;
                    }
                }
                dp[i] = tempLen + 1;
                if (dp[i] > maxLen) {
                    maxLen = dp[i];
                    maxi = i;
                }
            }

            int finalArr[] = new int[maxLen];
            int k = 0;
            while (maxLen > 0) {
                finalArr[k] = array[maxi];
                maxi = pre[maxi];
                k++;
                maxLen--;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = k - 1; i >= 0; i--) {
                sb.append(finalArr[i] + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
/**************************************************************
 Problem: 1262
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:26052 kb
 ****************************************************************/




