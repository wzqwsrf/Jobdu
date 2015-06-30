
// 题目1366：栈的压入、弹出序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1366
 */

import java.io.StreamTokenizer;
#include <stdio.h>
#include <stack> 

using namespace std;
const int maxn = 100002;
int pushArr[maxn];
int popArr[maxn];
int n, i, j;

int main() {
    while (scanf("%d", &n) != EOF) {
        stack<int> numStack;
        for (i = 0; i < n; i++) {
            scanf("%d", &pushArr[i]);
        }
        for (i = 0; i < n; i++) {
            scanf("%d", &popArr[i]);
        }
        i = 0;
        j = 0;
        while (i < n) {
            while (numStack.empty() || numStack.top() != popArr[i]) {
                if (j == n) {
                    break;
                }
                numStack.push(pushArr[j]);
                j++;
            }
            if (numStack.top() != popArr[i]) {
                break;
            }
            numStack.pop();
            i++;
        }
        if (numStack.empty() && j == n) {
            printf("Yes\n");
        } else {
            printf("No\n");
        }
    }
    return 0;
}

/**************************************************************
Problem: 1366
User: wangzhenqing
Language: C++
Result: Accepted
Time:190 ms
Memory:2232 kb
****************************************************************/


                        

