
// 题目1539：师弟

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1539
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17581157
 */

#include <stdio.h>
#include <string.h>
#include <queue>

using namespace std;
#define INF 10000000;
const int maxn = 1002;
int path[maxn][maxn];
int minLen[2][maxn];
int visited[maxn];
int n, m, k;

void dijkstra(int s, int rank) {
    int i, j;
    minLen[rank][s] = 0;
    visited[s] = 1;
    int minj = s;
    for (i = 1; i < n + 1; i++) {
        int min = INF;
        for (j = 1; j < n + 1; j++) {
            if (visited[j] == 0 && minLen[rank][j] < min) {
                min = minLen[rank][j];
                minj = j;
            }
        }
        visited[minj] = 1;
        for (j = 1; j < n + 1; j++) {
            if (visited[j] == 0 && minLen[rank][j] > (minLen[rank][minj] + path[minj][j])) {
                minLen[rank][j] = minLen[rank][minj] + path[minj][j];
            }
        }
    }
}

int bfs(int len) {
    queue<int> q;
    while (!q.empty()) q.pop();
    q.push(1);
    int num = 0;
    int allNum = 0;
    visited[1] = 1;
    while (!q.empty()) {
        int size = q.size();//这里是bfs，针对每一个搜索到的点，判断是否为关键路上的点
        if (num > k) {
            return allNum;
        }
        num++;
        while (size--) {
            int s = q.front();
            q.pop();
            if (minLen[0][s] + minLen[1][s] == len) {
                allNum++;
            }
            for (int i = 1; i < n + 1; i++) {
                //	printf("%d\n",path[s][i]);
                if (visited[i] == 0 && path[s][i] < 10000000) {
                    visited[i] = 1;
                    q.push(i);
                }
            }
        }
    }
    return allNum;
}

int main() {
    int i, j;
    while (scanf("%d%d%d", &n, &m, &k) != EOF) {
        for (i = 1; i < n + 1; i++) {
            for (j = 1; j < n + 1; j++) {
                path[i][j] = INF;
            }
        }
        for (i = 0; i < m; i++) {
            int a, b, d;
            scanf("%d%d%d", &a, &b, &d);
            if (path[a][b] > d) {
                path[a][b] = d;
                path[b][a] = d;
            }
        }
        memset(visited, 0, sizeof(visited));
        for (i = 1; i < n + 1; i++) {
            minLen[0][i] = path[1][i];
            minLen[1][i] = path[n][i];
        }
        dijkstra(1, 0);
        memset(visited, 0, sizeof(visited));
        dijkstra(n, 1);
        memset(visited, 0, sizeof(visited));
        int allNum = bfs(minLen[0][n]);
        printf("%d\n", allNum);
    }
    return 0;
}

/**************************************************************
Problem: 1539
User: wangzhenqing
Language: C++
Result: Accepted
Time:650 ms
Memory:4988 kb
****************************************************************/


                        

