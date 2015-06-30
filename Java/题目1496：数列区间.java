
// 题目1496：数列区间

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1496
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int array[] = new int[n + 1];
            int operArr[][] = new int[m + 1][2];
            for (int i = 1; i < m + 1; i++) {
                st.nextToken();
                int l = (int) st.nval;
                st.nextToken();
                int r = (int) st.nval;
                operArr[i][0] = l;
                operArr[i][1] = r;
            }
            int next[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                next[i] = i + 1;
            }

            for (int i = m; i >= 1; i--) {
                int l = operArr[i][0];
                int r = operArr[i][1];
                for (int j = l; j <= r;) {
                    if (array[j] == 0) {
                        array[j] = i;
                    }
                    //获取下一次操作的坐标，并且将lr范围内的next都置为r;
                    int temp = next[j];
                    next[j] = next[r];
                    j = temp;
                }
            }
            int i = 1;
            int k = 1;
            int max = 1;
            while (i <= n) {
                if (array[i] == 0) {
                    i++;
                    continue;
                }
                k = 1;
                while ((i + k) <= n && array[i] == array[i + k]) {
                    k++;
                }
                if (k > max) {
                    max = k;
                }
                i += k;
            }
            System.out.println(max);
        }
    }
}

/**************************************************************
 Problem: 1496
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1310 ms
 Memory:57632 kb
 ****************************************************************/




