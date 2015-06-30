
// 题目1007：奥运排序问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1007
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17175819
 */

#include <stdio.h>

const int maxn = 100000;
int i, j;
int n;
int m;

struct Country {
    int goldNum;
    int medalNum;
    double rate1;
    double rate2;
} countrys[maxn];

int needArr[maxn];

int main() {
    while (scanf("%d%d", &n, &m) != EOF) {

        for (i = 0; i < n; i++) {
            int peopleNum;
            scanf("%d%d%d", &countrys[i].goldNum, &countrys[i].medalNum, &peopleNum);
            countrys[i].rate1 = (double) countrys[i].goldNum / peopleNum;
            countrys[i].rate2 = (double) countrys[i].medalNum / peopleNum;
        }

        for (i = 0; i < m; i++) {
            scanf("%d", &needArr[i]);
        }

        for (i = 0; i < m; i++) {
            int rank[4] = {1, 1, 1, 1};
            for (j = 0; j < m; j++) {
                if (needArr[j] == needArr[i]) {
                    continue;
                }
                if (countrys[needArr[i]].goldNum < countrys[needArr[j]].goldNum) {
                    rank[0]++;
                }
                if (countrys[needArr[i]].medalNum < countrys[needArr[j]].medalNum) {
                    rank[1]++;
                }
                if (countrys[needArr[i]].rate1 < countrys[needArr[j]].rate1) {
                    rank[2]++;
                }
                if (countrys[needArr[i]].rate2 < countrys[needArr[j]].rate2) {
                    rank[3]++;
                }
            }
            int high = n + 1;
            int seq = 0;
            for (j = 0; j < 4; j++) {
                if (rank[j] < high) {
                    high = rank[j];
                    seq = j;
                }
            }
            printf("%d:%d\n", high, seq + 1);
        }
        printf("\n");
    }
    return 0;
}

/**************************************************************
Problem: 1007
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:3756 kb
****************************************************************/



