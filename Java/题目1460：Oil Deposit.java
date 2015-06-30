
// 题目1460：Oil Deposit

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1460
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17449261
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
     * 1460
     */
    private static char mazeArr[][];

    private static int visit[][];

    private static int stepArr[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 },
            { 0, 1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

    private static int m, n, startx, starty;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            if (m == 0 && n == 0) {
                break;
            }
            mazeArr = new char[m][n];
            visit = new int[m][n];
            for (int i = 0; i < m; i++) {
                mazeArr[i] = scanner.next().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mazeArr[i][j] != '*' && visit[i][j] == 0) {
                        startx = i;
                        starty = j;
                        bfs();
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

private static void bfs() {
        Node node = new Node(startx, starty);
        visit[startx][starty] = 1;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node newNode = queue.poll();
            for (int i = 0; i < 8; i++) {
                int x = newNode.x + stepArr[i][0];
                int y = newNode.y + stepArr[i][1];
                if (x < 0 || y < 0 || x >= m || y >= n || visit[x][y] == 1 || mazeArr[x][y] == '*') {
					continue;
				}
                visit[x][y] = 1;
                Node next = new Node(x, y);
                queue.add(next);
            }
        }
    }    private static class Node {
        private int x;

        private int y;

        public Node(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }
}
/**************************************************************
 Problem: 1460
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:290 ms
 Memory:27724 kb
 ****************************************************************/




