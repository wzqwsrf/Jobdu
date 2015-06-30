
// 题目1404：机器人网店

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1404
 */

import java.io.BufferedReader;
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <queue>

using namespace std;
const int maxn = 12;
int visit[maxn][maxn][9];
int mazeArr[maxn][maxn];
int stepArr[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
int w, h;
int startx, starty;
int endx, endy;

struct Node {
    int x;
    int y;
    int time;
    int power;

    Node(int x1, int y1, int time1, int power1) : x(x1), y(y1), time(time1), power(power1) {
    }
};

int bfs() {
    Node node(startx, starty, 0, 8);
    queue<Node> q;
    while (!q.empty()) q.pop();
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        if (node.x == endx && node.y == endy) {
            return node.time;
        }
        visit[node.x][node.y][8] = 1;
        for (int i = 0; i < 4; i++) {
            int x = node.x + stepArr[i][0];
            int y = node.y + stepArr[i][1];
            if (x < 0 || y < 0 || x >= h || y >= w) {
                continue;
            }
            if (mazeArr[x][y] == -1) {
                continue;
            }
            int power = node.power - 1;
            if (power <= 0) {
                continue;
            }
            if (mazeArr[x][y] == 3) {
                power = 8;
            }
            if (visit[x][y][power]) {
                continue;
            }
            visit[x][y][power] = 1;
            Node next(x, y, node.time + 1, power);
            q.push(next);
        }
    }
    return -1;
}

int main() {
    while (scanf("%d%d", &w, &h) != EOF) {
        if (w == 0 && h == 0) {
            break;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                scanf("%d", &mazeArr[i][j]);
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
        memset(visit, 0, sizeof(visit));
        int num = bfs();
        if (num == -1) {
            printf("Pity oz!\n");
        } else {
            printf("%d\n", num);
        }
    }

    return 0;
}

/**************************************************************
Problem: 1404
User: wzqwsrf
Language: C++
Result: Accepted
Time:20 ms
Memory:1060 kb
****************************************************************/


                        

