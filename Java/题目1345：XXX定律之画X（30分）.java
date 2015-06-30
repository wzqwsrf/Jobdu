
// 题目1345：XXX定律之画X（30分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1345
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1161
     */
    private static char[][] oriArr;

    private static char[][] finalArr;

    private static int n = 3;

    static {

        oriArr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                oriArr[i][j] = ' ';
            }
        }
        oriArr[0][0] = 'X';
        oriArr[0][2] = 'X';
        oriArr[1][1] = 'X';
        oriArr[2][0] = 'X';
        oriArr[2][2] = 'X';
    }

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int k = (int) st.nval;
            if (k <= 0) {
                break;
            }
            if (k == 1) {
                System.out.println("X");
                System.out.println("#");
                continue;
            }
            if (k == 2) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(new String(oriArr[i]));
                }
                System.out.println("#");
                continue;
            }
            int size = n;
            for (int i = 1; i < k - 1; i++) {
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
                        drawMap(k - 1, i, j);
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println(new String(finalArr[i]));
            }
            System.out.println("#");
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
 Problem: 1345
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:580 ms
 Memory:21020 kb
 ****************************************************************/




