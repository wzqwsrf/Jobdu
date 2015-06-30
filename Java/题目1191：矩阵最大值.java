
// 题目1191：矩阵最大值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1191
 */

import java.util.Scanner;

public class Main {
    /*
     * 1191
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int array[][] = new int[m][n];
            int sumArray[] = new int[m];
            int maxIndex[] = new int[m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = scanner.nextInt();
                    sumArray[i] += array[i][j];
                }
                maxIndex[i] = array[i][0];
            }

            for (int i = 0; i < m; i++) {
                int index = 0;
                for (int j = 0; j < n; j++) {
                    if (array[i][j] > maxIndex[i]) {
                        index = j;
                        maxIndex[i] = array[i][j];
                    }
                }
                array[i][index] = sumArray[i];
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    sb.append(array[i][j] + " ");
                }
                sb.append(array[i][n - 1]);
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
/**************************************************************
 Problem: 1191
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:810 ms
 Memory:94780 kb
 ****************************************************************/




