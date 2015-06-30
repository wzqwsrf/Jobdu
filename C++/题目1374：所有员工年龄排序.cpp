
// 题目1374：所有员工年龄排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1374
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17223275
 */

#include <stdio.h>
#include <string.h>

int array[100];
int i, j, n;

int main() {

    while (scanf("%d", &n) != EOF) {
        memset(array, 0, sizeof(array));
        int num;
        for (i = 0; i < n; i++) {
            scanf("%d", &num);
            array[num]++;
        }
        for (i = 1; i < 100; i++) {
            for (j = 0; j < array[i]; j++) {
                printf("%d ", i);
            }
        }
        printf("\n");
    }
    return 0;
}
/**************************************************************
Problem: 1374
User: wangzhenqing
Language: C++
Result: Accepted
Time:740 ms
Memory:1020 kb
****************************************************************/


                        

