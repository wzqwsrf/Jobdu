
// 题目1544：数字序列区间最小值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 18:53:55
 * @url:http://ac.jobdu.com/problem.php?pid=1544
 */

#include <stdio.h>
#include <cmath>

const int maxn = 100002;
int valueArr[maxn];
int dp[maxn][50];
int n;
int i, j;

int min(int a, int b) {
    return a > b ? b : a;
}

void initDp() {
    for (i = 1; i < n + 1; i++) {
        dp[i][0] = valueArr[i];
    }

    for (j = 1; j <= log((double) n) / log(2.0); j++) {
        for (i = 1; i + (1 << j) - 1 <= n; i++) {
            dp[i][j] = min(dp[i][j - 1], dp[i + (1 << (j - 1))][j - 1]);
        }
    }
}

int query(int a, int b) {
    int k = (int) (log((double) (b - a + 1)) / log(2.0));
    return min(dp[a][k], dp[b - (1 << k) + 1][k]);
}

int main() {


    while (scanf("%d", &n) != EOF) {
        for (i = 1; i < n + 1; i++) {
            scanf("%d", &valueArr[i]);
        }
        initDp();

        int t;
        scanf("%d", &t);
        while (t > 0) {
            t--;
            int l, r;
            scanf("%d%d", &l, &r);
            printf("%d\n", query(l, r));
        }
    }
    return 0;
}
/**************************************************************
Problem: 1544
User: wzqwsrf
Language: C++
Result: Accepted
Time:310 ms
Memory:20988 kb
****************************************************************/


                        

