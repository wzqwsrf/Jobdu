
#include <stdio.h>
#include <algorithm>
using namespace std;
const int maxn = 102;
 
struct Student{
    int stuNo;
    int score;
}students[maxn];
 
int n , i;
 
bool cmp(Student s1 , Student s2){
    if(s1.score == s2.score){ 
        return s1.stuNo < s2.stuNo;
    }else {
        return s1.score < s2.score;
    }
}
int main(){
    while(scanf("%d",&n) != EOF){
        for(i = 0; i < n; i++){
            scanf("%d %d",&students[i].stuNo,&students[i].score);
        }
        sort(students, students+n, cmp);
        for(i = 0; i < n; i++){
            printf("%d %d\n",students[i].stuNo,students[i].score);
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1196
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:40 ms
	Memory:1020 kb
****************************************************************/


                        