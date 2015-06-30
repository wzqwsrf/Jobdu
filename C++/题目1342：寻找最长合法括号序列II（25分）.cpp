
// 题目1342：寻找最长合法括号序列II（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1342
 */

import java.util.Scanner;
#include <stdio.h>
#include <stack>
#include <string>
#include <string.h>

using namespace std;
const int maxn = 1000002;
char input[maxn];

int main() {
    int n, i;
    while (scanf("%s", input) != EOF) {
        n = strlen(input);
        stack<int> symStack;
        int maxLen = 0;
        for (i = 0; i < n; i++) {
            if (input[i] == '(') {
                symStack.push(i);
            } else if (input[i] == ')' && !symStack.empty()) {
                symStack.top();
                symStack.pop();
                maxLen += 2;
            }
        }
        printf("%d\n", maxLen);
    }
    return 0;
}


/**************************************************************
Problem: 1342
User: wangzhenqing
Language: C++
Result: Accepted
Time:40 ms
Memory:2028 kb
****************************************************************/


                        

