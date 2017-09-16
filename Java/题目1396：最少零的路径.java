
// 题目1396：最少零的路径

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2017-09-16 22:48:42
 * @url:http://ac.jobdu.com/problem.php?pid=1396
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    private static int n;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            int matrix[][] = new int[n][n];
            int twoArr[][] = new int[n][n];
            int fiveArr[][] = new int[n][n];
            boolean flag = false;
            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    matrix[i][j] = (int) st.nval;
                    if (!flag && matrix[i][j] == 0) {
                        x = i;
                        y = j;
                        flag = true;
                    }
                    twoArr[i][j] = countFactor(matrix[i][j], 2);
                    fiveArr[i][j] = countFactor(matrix[i][j], 5);
                }
            }

            int dp1[][] = getDp(twoArr);
            int dp2[][] = getDp(fiveArr);

//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(dp1[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("==========");
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(dp2[i][j] + " ");
//                }
//                System.out.println();
//            }

            int min = Integer.MAX_VALUE;
            if (dp1[n - 1][n - 1] < dp2[n - 1][n - 1]) {
                min = dp1[n - 1][n - 1];
            } else {
                min = dp2[n - 1][n - 1];
            }
            if (flag && min >= 1) { // has zero
                printZero(x, y);
                continue;
            }
            if (dp1[n - 1][n - 1] < dp2[n - 1][n - 1]) {
                printResult(dp1[n - 1][n - 1], dp1);
            } else {
                printResult(dp2[n - 1][n - 1], dp2);
            }
        }
    }

    private static void printResult(int min, int[][] array) {
        System.out.println(min);
        StringBuffer sb = new StringBuffer();
        int x = n - 1, y = n - 1;
        for (int i = 0; i < 2 * n - 2; i++) {
            if (x == 0) {
                sb.append("R");
                continue;
            }
            if (y == 0) {
                sb.append("D");
                continue;
            }
            if (array[x - 1][y] < array[x][y - 1]) {
                sb.append("D");
                x--;
            } else {
                sb.append("R");
                y--;
            }
        }
        System.out.println(sb.reverse());
    }

    private static void printZero(int x, int y) {
        System.out.println(1);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < x; i++) {
            sb.append("D");
        }
        for (int i = 0; i < y; i++) {
            sb.append("R");
        }
        for (int i = x; i < n - 1; i++) {
            sb.append("D");
        }
        for (int i = y; i < n - 1; i++) {
            sb.append("R");
        }
        System.out.println(sb);
    }

    private static int[][] getDp(int[][] array) {
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == Integer.MAX_VALUE) {
                    dp[i][j] = Integer.MAX_VALUE;
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = array[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] == Integer.MAX_VALUE ? dp[i][j - 1] :
                            (dp[i][j - 1] + array[i][j]);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] == Integer.MAX_VALUE ? dp[i - 1][j] :
                            (dp[i - 1][j] + array[i][j]);
                } else {
                    int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    dp[i][j] = min == Integer.MAX_VALUE ? min : (min + array[i][j]);
                }
            }
        }
        return dp;
    }


    private static int countFactor(int num, int factor) {
        int count = 0;
        if (num == 0) {
            return Integer.MAX_VALUE;
        }
        while (num != 0 && num % factor == 0) {
            num /= factor;
            count++;
        }
        return count;
    }
}

/**************************************************************
 * Problem: 1396
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:840 ms
 * Memory:40864 kb
 ****************************************************************/




