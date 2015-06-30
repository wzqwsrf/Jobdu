
// 题目1472：求两个多项式的和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1472
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19408269
 */

#include <stdio.h>
#include <string.h>

const int maxn = 2002;
const int addNum = 1000;
int n, i, a, b;
int indexArr[maxn];

int main() {
    while (scanf("%d", &n) != EOF) {
        memset(indexArr, 0, sizeof(indexArr));
        for (i = 0; i < n; i++) {
            scanf("%d %d", &a, &b);
            indexArr[b + addNum] += a;
        }
        scanf("%d", &n);
        for (i = 0; i < n; i++) {
            scanf("%d %d", &a, &b);
            indexArr[b + addNum] += a;
        }
        int first = 1;
        for (i = maxn - 1; i >= 0; i--) {
            if (indexArr[i] != 0) {
                if (first == 1) {
                    first = 2;
                    printf("%d %d", indexArr[i], i - addNum);
                } else {
                    printf(" %d %d", indexArr[i], i - addNum);
                }
            }
        }
        printf("\n");
    }

    return 0;
}
/**************************************************************
Problem: 1472
User: wangzhenqing
Language: C++
Result: Accepted
Time:10 ms
Memory:1028 kb
****************************************************************/


                        

