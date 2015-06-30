
// 题目1185：特殊排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1185
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17225139
 */

#include <stdio.h>
#include <algorithm>

using namespace std;
const int maxn = 1002;
int i, n;
int array[maxn];

int main() {
    while (scanf("%d", &n) != EOF) {

        for (i = 0; i < n; i++) {
            scanf("%d", &array[i]);
        }
        if (n == 1) {
            printf("%d\n", array[0]);
            printf("%d\n", -1);
            continue;
        }
        sort(array, array + n);
        printf("%d\n", array[n - 1]);
        for (i = 0; i < n - 2; i++) {
            printf("%d ", array[i]);
        }
        printf("%d\n", array[n - 2]);

    }
    return 0;
}
/**************************************************************
Problem: 1185
User: wangzhenqing
Language: C++
Result: Accepted
Time:30 ms
Memory:1024 kb
****************************************************************/


                        

