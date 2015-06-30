
// 题目1047：素数判定

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1047
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/36180571
 */

#include <stdio.h>

int main() {
    int num;
    while (scanf("%d", &num) != EOF) {
        if (num <= 1) {
            printf("no\n");
            continue;
        }
        bool flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        printf(flag ? "no\n" : "yes\n");
    }
    return 0;
}
/**************************************************************
Problem: 1047
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:1020 kb
****************************************************************/


                        

