
// 题目1040：Prime Number

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1040
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/35781195
 */

#include <stdio.h>

const int len = 200000;
int array[len];
int i, j, k;

void initArray() {
    for (i = 1; i < len; i++) {
        if (i % 2 == 0) {
            array[i] = 0;
        } else {
            array[i] = 1;
        }
    }
    array[1] = 0;
    array[2] = 1;
    for (i = 3; i < len; i++) {
        if (array[i] == 1) {
            for (j = 2 * i; j < len; j += i) {
                array[j] = 0;
            }
        }
    }
}

int main() {
    initArray();
    while (scanf("%d", &k) != EOF) {
        int count = 0;
        for (int i = 1; i < len; i++) {
            if (array[i] == 1) {
                count++;
            }
            if (count == k) {
                printf("%d\n", i);
                break;
            }
        }
    }
    return 0;
}
/**************************************************************
Problem: 1040
User: wangzhenqing
Language: C++
Result: Accepted
Time:10 ms
Memory:1800 kb
****************************************************************/


                        

