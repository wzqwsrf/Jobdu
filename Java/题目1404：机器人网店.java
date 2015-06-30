
// 题目1404：机器人网店

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1404
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
     * 1404
     */
    private static int mazeArr[][];

    private static int visit[][][];

    private static int stepArr[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    private static int w, h, startx, starty, endx, endy;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            w = (int) st.nval;
            st.nextToken();
            h = (int) st.nval;
            if (w == 0 && h == 0) {
                break;
            }
            mazeArr = new int[h][w];
            visit = new int[h][w][9];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    st.nextToken();
                    mazeArr[i][j] = (int) st.nval;
                    if (mazeArr[i][j] == 1) {
                        startx = i;
                        starty = j;
                    }
                    if (mazeArr[i][j] == 2) {
                        endx = i;
                        endy = j;
                    }
                }
            }
            int result = bfs();
            System.out.println(result == -1 ? "Pity oz!" : result);
        }
    }

private static int bfs() {
        Node node = new Node(startx, starty, 0, 8);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node newNode = queue.poll();
            if (newNode.x == endx && newNode.y == endy) {
                return newNode.time;
            }
            visit[newNode.x][newNode.y][8] = 1;
            for (int i = 0; i < 4; i++) {
                int x = newNode.x + stepArr[i][0];
                int y = newNode.y + stepArr[i][1];
                if (x < 0 || y < 0 || x >= h || y >= w || mazeArr[x][y] == -1) {
					continue;
				}
                int power = newNode.power - 1;
                if (power <= 0) {
					continue;
				}
                if (mazeArr[x][y] == 3) {
					power = 8;
				}
                if (visit[x][y][power] == 1) {
					continue;
				}
                visit[x][y][power] = 1;
                Node next = new Node(x, y, newNode.time+1, power);
                queue.add(next);
            }
        }
        return -1;
    }    private static class Node {
        private int x;

        private int y;

        private int time;

        private int power;

        public Node(int x, int y, int time, int power) {
            super();
            this.x = x;
            this.y = y;
            this.time = time;
            this.power = power;
        }
    }
}
/**************************************************************
 Problem: 1404
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:14848 kb
 ****************************************************************/




