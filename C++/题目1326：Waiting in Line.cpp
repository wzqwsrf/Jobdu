
// 题目1326：Waiting in Line

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1326
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17475331
 */

#include <stdio.h>
#include <queue>
#include <string.h>

using namespace std;
const int maxk = 1002;
const int maxn = 22;
int n, m, k, q;
int i, j;
int taskArr[maxk];
queue<int> qu[maxn];
int allTime[maxk];

int main() {
    while (scanf("%d%d%d%d", &n, &m, &k, &q) != EOF) {
        for (i = 1; i < k + 1; i++) {
            scanf("%d", &taskArr[i]);
        }
        for (i = 0; i < n; i++) {
            while (!qu[i].empty()) {
                qu[i].pop();
            }
        }
        memset(allTime, 0, sizeof(allTime));
        int count = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                count++;
                if (count > k) {
                    break;
                }
                allTime[count] = taskArr[count];
                if (!qu[j].empty()) {
                    allTime[count] += allTime[qu[j].back()];
                }
                qu[j].push(count);
            }
            if (count > k) {
                break;
            }
        }

        while (count < k) {
            count++;
            int minTime = allTime[qu[0].front()];
            int groupId = 0;
            for (i = 1; i < n; i++) {
                int tempTime = allTime[qu[i].front()];
                if (tempTime < minTime) {
                    minTime = tempTime;
                    groupId = i;
                }
            }
            allTime[count] = taskArr[count];
            if (!qu[groupId].empty()) {
                allTime[count] += allTime[qu[groupId].back()];
            }
            qu[groupId].pop();
            qu[groupId].push(count);
        }
        int rank;
        for (i = 0; i < q; i++) {
            scanf("%d", &rank);
            if (allTime[rank] > 540) {
                printf("Sorry\n");
            } else {
                printf("%02d:%02d\n", 8 + allTime[rank] / 60, allTime[rank] % 60);
            }
        }
    }
    return 0;
}

/**************************************************************
Problem: 1326
User: wangzhenqing
Language: C++
Result: Accepted
Time:10 ms
Memory:1064 kb
****************************************************************/


                        

