
// 题目1349：数字在排序数组中出现的次数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1349
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17226947
 */

#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;
const int maxn = 1000002;
int array[maxn];

int n, m, i;

int main() {
    while (scanf("%d", &n) != EOF) {
        int num;
        memset(array, 0, sizeof(array));
        for (i = 0; i < n; i++) {
            scanf("%d", &num);
            array[num]++;
        }
        scanf("%d", &m);
        for (i = 0; i < m; i++) {
            scanf("%d", &num);
            printf("%d\n", array[num]);
        }
    }
    return 0;
}
/**************************************************************
Problem: 1349
User: wangzhenqing
Language: C++
Result: Accepted
Time:830 ms
Memory:4928 kb
****************************************************************/


                        

