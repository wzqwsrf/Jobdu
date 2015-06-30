
// 题目1375：陈博的完美主义（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1375
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/26221521
 */

#include<stdio.h>
#include<string.h>
#include <stdlib.h>

const int maxn = 100002;
const int maxm = 102;
const int maxLen = 6;
int n, i;
char s[maxm];
int numArr[maxn];
int num;

int main() {
    while (scanf("%d", &n) != EOF) {
        num = 0;
        memset(numArr, 0, sizeof(numArr));
        for (i = 0; i < n; i++) {
            scanf("%s", s);
            if (strlen(s) > maxLen) {
                num++;
                continue;
            }
            int tempNum = atoi(s);
            if (tempNum < 1 || tempNum > n) {
                num++;
                continue;
            }
            if (numArr[tempNum] == 0) {
                numArr[tempNum] = 1;
            } else {
                num++;
            }
        }
        printf("%d\n", num);
    }
    return 0;
}
/**************************************************************
Problem: 1375
User: wangzhenqing
Language: C++
Result: Accepted
Time:150 ms
Memory:1412 kb
****************************************************************/


                        

