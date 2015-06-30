
// 题目1091：棋盘游戏

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1091
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1091
     */
    private static int chessArr[][];

    private static int visit[][];

    private static int endx;

    private static int endy;

    private static int maxCost;

    private static int step[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            while (n > 0) {
                n--;
                chessArr = new int[6][6];
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        st.nextToken();
                        chessArr[i][j] = (int) st.nval;
                    }
                }
                st.nextToken();
                int startx = (int) st.nval;
                st.nextToken();
                int starty = (int) st.nval;
                st.nextToken();
                endx = (int) st.nval;
                st.nextToken();
                endy = (int) st.nval;
                maxCost = Integer.MAX_VALUE;
                visit = new int[6][6];
                //				visit[startx][starty] = 1;
                dfs(startx, starty, 0, 1);
                System.out.println(maxCost);
            }
        }
    }

    private static void dfs(int startx, int starty, int cost, int state) {
        if (cost > maxCost) {
            return;
        }
        if (startx == endx && starty == endy) {
            if (cost < maxCost) {
                maxCost = cost;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int sx = startx + step[i][0];
            int sy = starty + step[i][1];
            if (sx >= 0 && sy >= 0 && sx < 6 && sy < 6 && visit[sx][sy] == 0) {
                int newCost = state * chessArr[sx][sy];
                visit[sx][sy] = 1;
                dfs(sx, sy, cost + newCost, newCost % 4 + 1);
                visit[sx][sy] = 0;
            }
        }

    }
}
/**************************************************************
 Problem: 1091
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:17684 kb
 ****************************************************************/




