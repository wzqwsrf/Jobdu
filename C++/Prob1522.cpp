
// 题目1522：包含min函数的栈

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年01月24日21:22:20
 * @url：http://ac.jobdu.com/problem.php?pid=1522
 * 每次把最小数保存在minStack中，pop的时候判断是否和当前栈顶元素相等。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/43090751
 */

#include <stdio.h>
#include <stack>
using namespace std;
int n;
char s[1];
int num;
int main(){
    while(scanf("%d",&n) != EOF){
        stack<int> allStack;
        stack<int> minStack;
        for (int i = 0; i < n; i++) {
            scanf("%s",s);
            if (s[0] == 's') {
                scanf("%d", &num);
                if (minStack.empty() || num <= minStack.top()) {
                    minStack.push(num);
                }
                allStack.push(num);
            }else if(s[0] == 'o'){
                num = allStack.top();
                allStack.pop();
                if (num == minStack.top()) {
                    minStack.pop();
                }
            }
            if (minStack.empty()) {
                printf("NULL\n");
            }else{
                printf("%d\n", minStack.top());
            }
        }
    }
}
 
/**************************************************************
    Problem: 1522
    User: wzqwsrf
    Language: C++
    Result: Accepted
    Time:20 ms
    Memory:1052 kb
****************************************************************/