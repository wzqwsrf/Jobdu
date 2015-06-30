
// 题目1180：对称矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1180
 */

import java.util.Scanner;

public class Main {
    /*
     * 1180
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int array[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (array[i][j] == array[j][i]) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
/**************************************************************
 Problem: 1180
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:680 ms
 Memory:94364 kb
 ****************************************************************/




