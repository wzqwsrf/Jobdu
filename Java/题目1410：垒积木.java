
// 题目1410：垒积木

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1410
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1410
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int blocks[][][] = new int[101][101][101];
            int maxx = -1;
            int maxy = -1;
            int maxz = -1;
            while (n > 0) {
                st.nextToken();
                int l = (int) st.nval;
                st.nextToken();
                int w = (int) st.nval;
                st.nextToken();
                int h = (int) st.nval;
                blocks[l][w][h]++;
                maxx = Math.max(maxx, l);
                maxy = Math.max(maxy, w);
                maxz = Math.max(maxz, h);
                n--;
            }
            int result = -1;
            for (int i = 1; i <= maxx; i++) {
                for (int j = 1; j <= maxy; j++) {
                    for (int k = 1; k <= maxz; k++) {
                        int temp = 0;
                        if (i > 1) {
                            temp = Math.max(temp, blocks[i - 1][j][k]);
                        }
                        if (j > 1) {
                            temp = Math.max(temp, blocks[i][j - 1][k]);
                        }
                        if (k > 1) {
                            temp = Math.max(temp, blocks[i][j][k - 1]);
                        }
                        blocks[i][j][k] += temp;
                        result = Math.max(result, blocks[i][j][k]);
                    }
                }
            }
            System.out.println(result);
        }
    }
}

/**************************************************************
 Problem: 1410
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2000 ms
 Memory:88940 kb
 ****************************************************************/




