
// 题目1023：EXCEL排序

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日10:05:10
 * @url：http://ac.jobdu.com/problem.php?pid=1023
 * 对象排序，实现C++使用sort，Java使用Arrays.sort。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17219709
 */

#include <stdio.h>
#include <algorithm>
#include<string.h>
using namespace std;
const int maxn = 100002;
struct Student{
    char stuNo[10];
    char name[10];
    int score;
}students[maxn];
int n , c , i;
bool cmp1(Student s1 , Student s2){
    return strcmp(s1.stuNo , s2.stuNo)<0;
}
bool cmp2(Student s1 , Student s2){
    int tmp = strcmp(s1.name , s2.name) ;
    if(tmp == 0){
        return strcmp(s1.stuNo , s2.stuNo)<0;
    }else {
        return tmp < 0;
    }
}
bool cmp3(Student s1 , Student s2){
    if(s1.score == s2.score){
        return strcmp(s1.stuNo , s2.stuNo)<0;
    }else {
        return s1.score < s2.score;
    }
}
int main(){
    int k = 1;
    while(scanf("%d%d",&n,&c) != EOF){
        if(n == 0) break;
        for(i = 0; i < n; i++){
            scanf("%s %s %d",&students[i].stuNo,&students[i].name,&students[i].score);
        }
        if(c==1){
            sort(students, students+n, cmp1);
        }else if(c==2) {
            sort(students, students+n, cmp2);
        }else {
            sort(students, students+n, cmp3);
        }
        printf("Case %d:\n",k);
        for(i = 0; i < n; i++){
            printf("%s %s %d\n",students[i].stuNo,students[i].name,students[i].score);
        }
        k++;
    }
    return 0;
}
/**************************************************************
 Problem: 1023
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:100 ms
 Memory:3368 kb
 ****************************************************************/