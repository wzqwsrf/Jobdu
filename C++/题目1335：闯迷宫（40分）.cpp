
// 题目1335：闯迷宫（40分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1335
 */

#include <stdio.h>
#include <stdlib.h>
#include<queue>

using namespace std;
const int maxn = 102;
int visit[maxn][maxn];
int mazeArr[maxn][maxn];
int stepArr[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
int n;

struct Node {
    int x;
    int y;
    int step;

    Node(int x1, int y1, int step1) : x(x1), y(y1), step(step1) {
    }
};

int bfs() {
    Node node(0, 0, 0);
    queue<Node> q;
    while (!q.empty()) q.pop();
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        if (node.x == n - 1 && node.y == n - 1) {
            return node.step;
        }
        visit[node.x][node.y] = 1;
        for (int i = 0; i < 4; i++) {
            int x = node.x + stepArr[i][0];
            int y = node.y + stepArr[i][1];
            if (x >= 0 && y >= 0 && x < n && y < n
                    && visit[x][y] == 0 && mazeArr[x][y] == 0) {
                visit[x][y] = 1;
                Node next(x, y, node.step + 1);
                q.push(next);
            }
        }
    }
    return -1;
}

int main() {
    while (scanf("%d", &n) != EOF) {
        if (n == 0) {
            break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                scanf("%d", &mazeArr[i][j]);
                visit[i][j] = 0;
            }
        }
        if (mazeArr[0][0] == 1 || mazeArr[n - 1][n - 1] == 1) {
            printf("%d\n", -1);
            continue;
        }
        printf("%d\n", bfs());
    }

    return 0;
}
/**************************************************************
Problem: 1335
User: wangzhenqing
Language: C++
Result: Accepted
Time:100 ms
Memory:1136 kb
****************************************************************/


                        

