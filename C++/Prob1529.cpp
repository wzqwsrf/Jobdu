// 题目1529：棋盘寻宝

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月04日11:37:20
 * @url：http://ac.jobdu.com/problem.php?pid=1529
 * 简单dp，每次只能往右或者往下走。
 * 1、当在首行时，上一步走到当前步，只能是右走。因此当前拿到礼物的最大价值是前一列拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i][j-1] + array[i][j];
 * 2、当在首列时，上一步走到当前步，只能是下走。因此当前拿到礼物的最大价值是前一行拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i-1][j] + array[i][j];
 * 3、在其他位置，可以往下或者往右，因此最大值为
 * dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/25304325
 */

#include<stdio.h>
#include<string.h>
const int len = 8;
int array[len][len];
int dp[len][len];
int i, j;

int max(int a,int b){
    return a > b ? a : b;
}

int main(){
    while(scanf("%d",&array[0][0]) != EOF){
        memset(dp, 0, sizeof(dp));
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                scanf("%d",&array[i][j]);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = array[i][j];
                }else if (i == 0) {
                    dp[i][j] = dp[i][j-1] + array[i][j];
                }else if (j == 0) {
                    dp[i][j] = dp[i-1][j] + array[i][j];
                }else {
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
                }
            }
        }
        printf("%d\n", dp[7][7]);
    }
    return 0;
}
/**************************************************************
 Problem: 1529
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:0 ms
 Memory:1020 kb
 ****************************************************************/