
// 题目1489：计算两个矩阵的乘积

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1489
 */

import java.util.Scanner;

public class Main {
    /*
     * 1489
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int arrayA[][] = new int[2][3];
            int arrayB[][] = new int[3][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    arrayA[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    arrayB[i][j] = scanner.nextInt();
                }
            }
            int arrayC[][] = new int[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    int result = 0;
                    for (int k = 0; k < 3; k++) {
                        result += arrayA[i][k] * arrayB[k][j];
                    }
                    arrayC[i][j] = result;

                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sb.append(arrayC[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
/**************************************************************
 Problem: 1489
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:19084 kb
 ****************************************************************/




