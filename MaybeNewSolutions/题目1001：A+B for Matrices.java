
import java.util.Scanner;

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日17:32:32
 * @url:http://ac.jobdu.com/problem.php?pid=1001
 * 矩阵相加，求整行和整列为0的行列数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/37882211
 */

public class Main {

    public static void main(String[] args) {

        int m, n;
        int zeroNum = 0;
        int[][] matrices1;
        int[][] matrices2;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            m = scanner.nextInt();
            if (m == 0 || m < 0) {
                break;
            }
            n = scanner.nextInt();
            matrices1 = new int[m][n];
            matrices2 = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrices1[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrices2[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrices1[i][j] = matrices1[i][j] + matrices2[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                boolean isZero = true;
                for (int j = 0; j < n; j++) {
                    if (matrices1[i][j] != 0) {
                        isZero = false;
                    }
                }
                if (isZero) {
                    zeroNum++;
                }
            }

            for (int j = 0; j < n; j++) {
                boolean isZero = true;
                for (int i = 0; i < m; i++) {
                    if (matrices1[i][j] != 0) {
                        isZero = false;
                    }
                }
                if (isZero) {
                    zeroNum++;
                }
            }
            System.out.println(zeroNum);
            zeroNum = 0;
        }
    }
}
/**************************************************************
	Problem: 1001
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:920 ms
	Memory:18868 kb
****************************************************************/


                        