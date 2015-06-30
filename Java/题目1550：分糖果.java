
// 题目1550：分糖果

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1550
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1053
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int[] ratings = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                ratings[i] = (int) st.nval;
            }
            System.out.println(candy(ratings));
        }
    }

    public static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int len = ratings.length;
        int candyNum[] = new int[len];
        for (int i = 0; i < len; i++) {
            candyNum[i] = 1;
        }
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyNum[i] = candyNum[i - 1] + 1;
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candyNum[i] <= candyNum[i + 1]) {
                candyNum[i] = candyNum[i + 1] + 1;
            }
        }
        int allCandy = 0;
        for (int i = 0; i < len; i++) {
            allCandy += candyNum[i];
        }
        return allCandy;
    }
}
/**************************************************************
 Problem: 1550
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1040 ms
 Memory:27216 kb
 ****************************************************************/




