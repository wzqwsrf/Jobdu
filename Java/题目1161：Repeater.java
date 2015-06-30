
// 题目1161：Repeater

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1161
 */

import java.util.Scanner;

public class Main {

    /*
     * 1161
     */
    private static char[][] oriArr;

    private static char[][] finalArr;

    private static int n;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                break;
            }
            oriArr = new char[n][n];
            for (int i = 0; i < n; i++) {
                oriArr[i] = scanner.nextLine().toCharArray();
            }
            int q = Integer.parseInt(scanner.nextLine());
            int size = n;
            for (int i = 1; i < q; i++) {
                size *= n;
            }
            finalArr = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    finalArr[i][j] = ' ';
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (oriArr[i][j] != ' ') {
                        drawMap(q, i, j);
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println(new String(finalArr[i]));
            }
        }
    }

    private static void drawMap(int q, int x, int y) {
        if (q == 1) {
            finalArr[x][y] = oriArr[x % n][y % n];
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (oriArr[i][j] != ' ')
                    drawMap(q - 1, x * n + i, y * n + j);
            }
        }
    }
}
/**************************************************************
 Problem: 1161
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:240 ms
 Memory:27492 kb
 ****************************************************************/




