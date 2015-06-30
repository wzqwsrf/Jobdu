
// 题目1461：Tempter  of the bone

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1461
 */

import java.util.Scanner;

public class Main {
    /*
     * 1461
     */
    private static char mazeArr[][];

    private static int visit[][];

    private static int step[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    private static int n, m, t;

    private static boolean success;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            t = scanner.nextInt();
            if (n == 0 && m == 0 && t == 0) {
                break;
            }
            mazeArr = new char[n][m];
            visit = new int[n][m];
            for (int i = 0; i < n; i++) {
                String tempStr = scanner.next();
                mazeArr[i] = tempStr.toCharArray();
            }
            int startx = 0;
            int starty = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mazeArr[i][j] == 'S') {
                        startx = i;
                        starty = j;
                    }
                }
            }

            success = false;
            dfs(startx, starty, 0);
            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void dfs(int x, int y, int time) {
        for (int i = 0; i < 4; i++) {
            int sx = x + step[i][0];
            int sy = y + step[i][1];
            if (sx < 0 || sy < 0 || sx > n - 1 || sy > m - 1) {
                continue;
            }
            if (mazeArr[sx][sy] == 'X') {
                continue;
            }
            if (visit[sx][sy] == 1) {
                continue;
            }

            if (mazeArr[sx][sy] == 'D') {
                if (time + 1 == t) {
                    success = true;
                    return;
                } else {
                    continue;
                }
            }
            visit[sx][sy] = 1;
            dfs(sx, sy, time + 1);
            visit[sx][sy] = 0;
            if (success) {
                return;
            }
        }
    }
}

/**************************************************************
 Problem: 1461
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:19760 kb
 ****************************************************************/




