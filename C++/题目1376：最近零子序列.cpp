
// 题目1376：最近零子序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1376
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/21970145
 */

#include <stdio.h>

const int maxn = 100005;
int array[maxn];

int abs(int x) {
    return x < 0 ? x * -1 : x;
}

int main() {
    int n, i, j;
    while (scanf("%d", &n) != EOF) {
        int result = -1;
        for (i = 0; i < n; i++) {
            scanf("%d", array + i);
            if (array[i] == 0) {
                result = 0;
            }
        }
        if (result == 0) {
            printf("%d\n", result);
            continue;
        }
        result = array[0];
        for (i = 0; i < n; i++) {
            int sum = 0;
            for (j = i; j < n; j++) {
                sum += array[j];
                int tempSum1 = abs(sum);
                int tempSum2 = abs(result);
                if (tempSum1 < tempSum2
                        || (tempSum1 == tempSum2 && sum > result)) {
                    result = sum;
                    if (result == 0) {
                        break;
                    }
                }
            }
            if (result == 0) {
                break;
            }
        }
        printf("%d\n", result);
    }
    return 0;
}
/**************************************************************
Problem: 1376
User: wangzhenqing
Language: C++
Result: Accepted
Time:140 ms
Memory:1412 kb
****************************************************************/


                        

