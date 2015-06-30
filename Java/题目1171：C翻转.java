
// 题目1171：C翻转

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1171
 */

import java.util.Scanner;

public class Main {
    /*
     * 1171
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int arrayA[][] = new int[6][6];
            int arrayB[][] = new int[6][6];
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    arrayA[i][j] = scanner.nextInt();
                    arrayB[i][j] = arrayA[i][j];
                }
            }
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if ((a == 1 && b == 2) || (a == 1 && b == 3)) {
                for (int i = x; i < (x + b); i++) {
                    for (int j = y; j < (y + b); j++) {
                        arrayB[i][j] = arrayA[b + 1 - j][i];
                    }
                }
            } else if ((a == 2 && b == 2) || (a == 2 && b == 3)) {
                for (int i = x; i < (x + b); i++) {
                    for (int j = y; j < (y + b); j++) {
                        arrayB[i][j] = arrayA[j][b + 1 - i];
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j < 5; j++) {
                    sb.append(arrayB[i][j] + " ");
                }
                sb.append(arrayB[i][5] + "\n");
            }
            System.out.print(sb);
        }
    }
}
/**************************************************************
 Problem: 1171
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:18776 kb
 ****************************************************************/




