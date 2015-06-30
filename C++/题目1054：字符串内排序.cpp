
// 题目1054：字符串内排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1054
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17221013
 */

#include <stdio.h>
#include <stdlib.h>
#include <algorithm>
#include <string>
#include <string.h>

using namespace std;

int main() {
    char s[202];
    while (scanf("%s", s) != EOF) {
        int len = strlen(s);
        sort(s, s + len);
        printf("%s\n", s);
    }
    return 0;
}
/**************************************************************
Problem: 1054
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:1020 kb
****************************************************************/


                        

