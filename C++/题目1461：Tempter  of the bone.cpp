
// 题目1461：Tempter  of the bone

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1461
 */

import java.util.Scanner;
#include <stdio.h>
#include <stdlib.h>
#include<queue>

using namespace std;
const int maxn = 8;
int visit[maxn][maxn];
char mazeArr[maxn][maxn];
int step[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
int n, m, t;
bool success;
int i, j;


void dfs(int x, int y, int time) {
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

int main() {

    while (scanf("%d%d%d", &n, &m, &t) != EOF) {
        if (n == 0 && m == 0 && t == 0) {
            break;
        }

        for (i = 0; i < n; i++) {
            scanf("%s", mazeArr[i]);

        }
        int startx;
        int starty;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (mazeArr[i][j] == 'S') {
                    startx = i;
                    starty = j;
                }
                visit[i][j] = 0;
            }
        }
        success = false;
        dfs(startx, starty, 0);
        printf("%s\n", success == true ? "YES" : "NO");
    }

    return 0;
}
/**************************************************************
Problem: 1461
User: wangzhenqing
Language: C++
Result: Accepted
Time:10 ms
Memory:1020 kb
****************************************************************/


                        

