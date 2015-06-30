
// 题目1474：矩阵幂

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1474
 */

import java.util.Scanner;

public class Main {
    /*
     * 1474
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                int array[][] = new int[n][n];
                int arrayRes[][] = new int[n][n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        array[j][k] = scanner.nextInt();
                    }
                }
                arrayRes = array;
                for (int t = 0; t < m - 1; t++) {
                    arrayRes = multiMatrix(array, arrayRes);
                }
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n - 1; k++) {
                        sb.append(arrayRes[j][k] + " ");
                    }
                    sb.append(arrayRes[j][n - 1]);
                    sb.append("\n");
                }
                System.out.print(sb.toString());
            }
        }
    }

    private static int[][] multiMatrix(int[][] array, int[][] arrayRes) {
        int length = array.length;
        int arrayC[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int result = 0;
                for (int k = 0; k < length; k++) {
                    result += array[i][k] * arrayRes[k][j];
                }
                arrayC[i][j] = result;
            }
        }
        return arrayC;
    }
}
/**************************************************************
 Problem: 1474
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:130 ms
 Memory:19272 kb
 ****************************************************************/




