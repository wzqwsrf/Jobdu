
// 题目1337：寻找最长合法括号序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1337
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17261753
 */

#include <stdio.h>
#include <stack>
#include <string>
#include <string.h>

using namespace std;
const int maxn = 1000002;
char input[maxn];

int main() {
    int n, i;
    while (scanf("%d", &n) != EOF) {
        scanf("%s", input);
        stack<int> symStack;
        int *flagArr = new int[n];
        memset(flagArr, 0, sizeof(flagArr));
        for (i = 0; i < n; i++) {
            if (input[i] == '(') {
                symStack.push(i);
            } else if (input[i] == ')' && !symStack.empty()) {
                int j = symStack.top();
                symStack.pop();
                flagArr[i] = 1;
                flagArr[j] = 1;
            }
        }
        int maxLen = 0;
        int count = 0;
        int tempLen = 0;
        for (i = 0; i < n; i++) {
            if (flagArr[i] == 1) {
                tempLen++;
            } else {
                tempLen = 0;
            }
            if (tempLen > maxLen) {
                maxLen = tempLen;
                count = 1;
            } else if (tempLen == maxLen) {
                count++;
            }
        }
        if (maxLen == 0) {
            printf("0 1\n");
        } else {
            printf("%d %d\n", maxLen, count);
        }
    }
    return 0;
}

/**************************************************************
Problem: 1337
User: wangzhenqing
Language: C++
Result: Accepted
Time:100 ms
Memory:10092 kb
****************************************************************/


                        

