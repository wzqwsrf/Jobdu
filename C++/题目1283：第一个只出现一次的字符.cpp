
// 题目1283：第一个只出现一次的字符

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1283
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17350551
 */

#include <stdio.h>
#include <string.h>

const int maxn = 10002;
char input[maxn];
int array[26];
int i;

int main() {
    while (scanf("%s", input) != EOF) {
        memset(array, 0, sizeof(array));
        int len = strlen(input);
        for (i = 0; i < len; i++) {
            array[input[i] - 'A']++;
        }
        int first = -1;
        for (i = 0; i < len; i++) {
            if (array[input[i] - 'A'] == 1) {
                first = i;
                break;
            }
        }
        printf("%d\n", first);
    }
    return 0;
}
/**************************************************************
Problem: 1283
User: wangzhenqing
Language: C++
Result: Accepted
Time:20 ms
Memory:1032 kb
****************************************************************/


                        

