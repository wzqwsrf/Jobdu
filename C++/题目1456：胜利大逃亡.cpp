
// 题目1456：胜利大逃亡

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 18:52:46
 * @url:http://ac.jobdu.com/problem.php?pid=1456
 */

#include <stdio.h>
#include <stdlib.h>
#include<queue>

#define INF 1000000000;
using namespace std;
const int maxn = 52;
int visit[maxn][maxn][maxn];
int mazeArr[maxn][maxn][maxn];
int stepArr[6][3] = {{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, -1}};
int a, b, c;

struct Node {
    int x;
    int y;
    int z;
    int step;

    Node(int x1, int y1, int z1, int step1) {
        x = x1;
        y = y1;
        z = z1;
        step = step1;
    }
};

bool isTrue(int m, int n) {
    if (m >= 0 && m < n) {
        return true;
    }
    return false;
}

int bfs() {
    Node node(0, 0, 0, 0);
    queue<Node> q;
    while (!q.empty()) q.pop();
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        visit[node.x][node.y][node.z] = 1;
        if (node.x == a - 1 && node.y == b - 1 && node.z == c - 1) {
            return node.step;
        }
        for (int i = 0; i < 6; i++) {
            int x = node.x + stepArr[i][0];
            int y = node.y + stepArr[i][1];
            int z = node.z + stepArr[i][2];

            if (isTrue(x, a) && isTrue(y, b) && isTrue(z, c)
                    && visit[x][y][z] == 0 && mazeArr[x][y][z] == 0) {
                visit[x][y][z] = 1;
                Node next(x, y, z, node.step + 1);
                q.push(next);
            }
        }
    }
    return INF;
}

int main() {
    int t;
    scanf("%d", &t);
    while (t > 0) {
        t--;
        int time;
        scanf("%d%d%d%d", &a, &b, &c, &time);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    scanf("%d", &mazeArr[i][j][k]);
                    visit[i][j][k] = 0;
                }
            }
        }
        if (a + b + c - 3 > time) {
            printf("-1\n");
            continue;
        }
        if (mazeArr[a - 1][b - 1][c - 1] == 1) {
            printf("-1\n");
            continue;
        }
        int allTime = bfs();
        printf("%d\n", allTime <= time ? allTime : -1);
    }

    return 0;
}
/**************************************************************
Problem: 1456
User: wangzhenqing
Language: C++
Result: Accepted
Time:30 ms
Memory:2152 kb
****************************************************************/


                        

