
// 题目1054：字符串内排序

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月18日10:52:01
 * @url：http://ac.jobdu.com/problem.php?pid=1054
 * 内置排序方法可以直接实现
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17221013
 */

#include <stdio.h>
#include <stdlib.h>
#include <algorithm>
#include <string>
#include <string.h>
using namespace std;
int main(){
    char s[202];
    while(scanf("%s",s) != EOF){
        int len=strlen(s);
        sort(s,s+len);
        printf("%s\n",s);
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