
// 题目1100：最短路径

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1100
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class Main {
    /*
     * 1100
     */
    private static BigInteger array[];

    private static BigInteger mod = new BigInteger("100000");

    private static BigInteger times = new BigInteger("2");

    private static BigInteger max;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            array = new BigInteger[m];
            max = times.pow(m);
            initArray(m);
            if (n == 0 && m == 0) {
                break;
            }
            BigInteger path[][] = new BigInteger[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    path[i][j] = max;
                }
            }

            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;

                path[a][b] = array[i];
                path[b][a] = array[i];
            }

            BigInteger minLen[] = new BigInteger[n];
            int visit[] = new int[n];

            for (int i = 0; i < n; i++) {
                minLen[i] = path[0][i];
            }

            dijkstra(path, minLen, visit, n);

            for (int i = 1; i < n; i++) {
                if (minLen[i] != max) {
                    System.out.println(minLen[i].mod(mod));
                } else {
                    System.out.println(-1);
                }
            }
        }
    }

    private static void initArray(int m) {
        array[0] = new BigInteger(1 + "");
        for (int i = 1; i < m; i++) {
            array[i] = array[i - 1].multiply(times);
        }
    }

    private static void dijkstra(BigInteger[][] path, BigInteger[] minLen,
                                 int[] visit, int n) {

        minLen[0] = new BigInteger("0");
        visit[0] = 1;
        for (int i = 1; i < n; i++) {
            int minj = 0;
            BigInteger min = max;
            for (int j = 1; j < n; j++) {
                if (visit[j] == 0 && minLen[j].compareTo(min) == -1) {
                    min = minLen[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            for (int j = 1; j < n; j++) {
                BigInteger tempValue = minLen[minj].add(path[minj][j]);
                if (visit[j] == 0 && minLen[j].compareTo(tempValue) == 1
                        && minLen[minj] != max && path[minj][j] != max) {
                    minLen[j] = tempValue;
                }
            }
        }
    }
}
/**************************************************************
 * Problem: 1100
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:190 ms
 * Memory:23628 kb
 ****************************************************************/




