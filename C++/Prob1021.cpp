
// 题目1021：统计字符

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日19:03:35
 * @url：http://ac.jobdu.com/problem.php?pid=1021
 * 用两个数组统计，一次循环即可搞定，输出即可。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17187077
 */

#include <stdio.h>
#include <string.h>
const int maxm = 102;
int numArr[maxm];
int i;
int n;
int main(){
    char s1[7];
    char s2[82];
    while(gets(s1)){
        if(strcmp(s1,"#") == 0){
            break;
        }
        gets(s2);
        int len1 = strlen(s1);
        int len2 = strlen(s2);
        memset(numArr,0,sizeof(numArr));
        for(i = 0 ; i < len2; i++){
            numArr[s2[i] - ' ']++;
        }
        for(i = 0 ; i < len1; i++){
            printf("%c %d\n",s1[i],numArr[s1[i] - ' ']);
        }
    }
    return 0;
}
/**************************************************************
 Problem: 1021
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:0 ms
 Memory:1020 kb
 ****************************************************************/