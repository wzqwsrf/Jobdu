
// 题目1193：矩阵转置

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1193
 */

import java.util.Scanner;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1193
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int array[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int num = scanner.nextInt();
                    array[j][i] = num;
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    sb.append(array[i][j] + " ");
                }
                sb.append(array[i][N - 1]);
                if (i < N - 1) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }
}

/**************************************************************
 Problem: 1193
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:420 ms
 Memory:34152 kb
 ****************************************************************/




