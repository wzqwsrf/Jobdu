
// 题目1052：找x

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月18日10:35:29
 * @url：http://ac.jobdu.com/problem.php?pid=1052
 * 直接查找
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/37923401
 */

#include<stdio.h>
int array[202];
int findPos(int n,int x)
{
    int i=0;
    for(i = 0; i < n; i++){
        if(array[i] == x){
            return i;
        }
    }
    return -1;
}
int main()
{
    int n;
    int i, x;
    while(scanf("%d",&n) != EOF){
        for(i = 0; i < n; i++){
            scanf("%d",&array[i]);
        }
        scanf("%d",&x);
        printf("%d\n",findPos(n,x));
    }
    return 0;
}
/**************************************************************
 Problem: 1052
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:0 ms
 Memory:1020 kb
 ****************************************************************/
