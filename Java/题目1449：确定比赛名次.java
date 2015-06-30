
// 题目1449：确定比赛名次

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1449
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1449
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int group[][] = new int[n + 1][n + 1];
            int indegree[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                if (group[a][b] == 0) {
                    indegree[b]++;
                    group[a][b] = 1;
                }
            }
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (indegree[j] == 0) {
                        indegree[j] = -1;
                        if (i != n) {
                            System.out.printf("%d ", j);
                        } else {
                            System.out.printf("%d", j);
                        }
                        for (int k = 1; k < n + 1; k++) {
                            if (group[j][k] == 1) {
                                indegree[k]--;
                            }
                        }
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}

/**************************************************************
 Problem: 1449
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:790 ms
 Memory:44564 kb
 ****************************************************************/




