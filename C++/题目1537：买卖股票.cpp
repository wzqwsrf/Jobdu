
// 题目1537：买卖股票

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1537
 */

import java.io.BufferedReader;
#include <stdio.h>
#include <string.h>

const int maxn = 1002;
int array[maxn];
int dp[maxn][maxn];

int max(int a, int b) {
    return a > b ? a : b;
}

int main() {
    int n, k, i;
    while (scanf("%d%d", &n, &k) != EOF) {
        for (i = 1; i < n + 1; i++) {
            scanf("%d", &array[i]);
        }
        memset(dp, 0, sizeof(dp));
        int result = 0;
        int tempValue = 99999999;
        for (i = 1; i < k + 1; i++) {
            tempValue = dp[i - 1][1] - array[1];
            for (int j = 2; j < n + 1; j++) {
                dp[i][j] = max(tempValue + array[j], dp[i][j - 1]);
                result = max(dp[i][j], result);
                tempValue = max(tempValue, dp[i - 1][j] - array[j]);
            }
        }
        printf("%d\n", result);
    }
    return 0;
}

/**************************************************************
Problem: 1537
User: wzqwsrf
Language: C++
Result: Accepted
Time:90 ms
Memory:4948 kb
****************************************************************/


                        

