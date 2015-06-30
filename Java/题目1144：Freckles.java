
// 题目1144：Freckles

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1144
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1144
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            double path[][] = new double[n + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    path[i][j] = Double.MAX_VALUE;
                }
            }

            double x[] = new double[n + 1];
            double y[] = new double[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                x[i] = st.nval;
                st.nextToken();
                y[i] = st.nval;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = i + 1; j < n + 1; j++) {
                    double len = Math.sqrt((y[j] - y[i]) * (y[j] - y[i])
                            + (x[j] - x[i]) * (x[j] - x[i]));
                    path[i][j] = len;
                    path[j][i] = len;
                }
            }
            double minLen[] = new double[n + 1];
            int visit[] = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                minLen[i] = path[1][i];
            }

            prime(path, minLen, visit, n);
        }
    }

    private static void prime(double[][] path, double[] minLen, int[] visit,
            int n) {

        minLen[1] = 0;
        visit[1] = 1;
        int minj = 1;
        double resLen = 0;

        for (int i = 1; i < n; i++) {

            double min = Double.MAX_VALUE;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] < min) {
                    min = minLen[j];
                    minj = j;
                }
            }

            visit[minj] = 1;

            resLen += min;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] > path[minj][j]) {
                    minLen[j] = path[minj][j];
                }
            }
        }
        System.out.printf("%.2f\n", resLen);
    }
}
/**************************************************************
 Problem: 1144
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:19472 kb
 ****************************************************************/




