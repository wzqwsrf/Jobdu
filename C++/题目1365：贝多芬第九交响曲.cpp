
// 题目1365：贝多芬第九交响曲

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 18:47:40
 * @url:http://ac.jobdu.com/problem.php?pid=1365
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<queue>

using namespace std;
const int maxn = 102;
int visit[maxn][maxn];
int stepArr[8][2] = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {1, 2}, {2, 1}, {-1, 2}, {-2, 1}};
int n;
int startx, starty, endx, endy;

struct Node {
    int x;
    int y;
    int step;

    Node(int x1, int y1, int step1) {
        x = x1;
        y = y1;
        step = step1;
    }

};

int bfs() {
    Node node(startx, starty, 0);
    queue<Node> q;
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        if (node.x == endx && node.y == endy) {
            return node.step;
        }
        visit[node.x][node.y] = 1;
        for (int i = 0; i < 8; i++) {
            int tx = node.x + stepArr[i][0];
            int ty = node.y + stepArr[i][1];

            if (tx >= 1 && ty >= 1 && tx <= n && ty <= n
                    && visit[tx][ty] == 0) {
                visit[tx][ty] = 1;
                Node next(tx, ty, node.step + 1);
                q.push(next);
            }
        }
    }
    return -1;
}

int main() {
    while (scanf("%d", &n) != EOF) {

        scanf("%d %d %d %d", &startx, &starty, &endx, &endy);
        memset(visit, 0, sizeof(visit));
        printf("%d\n", bfs());
    }

    return 0;
}
/**************************************************************
Problem: 1365
User: wzqwsrf
Language: C++
Result: Accepted
Time:500 ms
Memory:1092 kb
****************************************************************/


                        

