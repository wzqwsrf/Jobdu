
// 题目1388：跳台阶

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1388
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/38038747
 */

#include <stdio.h>

const int maxn = 72;
long array[maxn];
int n;

int main() {
    while (scanf("%d", &n) != EOF) {
        if (n == 1) {
            printf("1\n");
            continue;
        }
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        printf("%ld\n", array[n]);
    }
    return 0;
}

/**************************************************************
Problem: 1388
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:1020 kb
****************************************************************/


                        

