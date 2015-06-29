
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <algorithm>
const int maxn = 10002;
using namespace std;
struct Monkey{
    char name[101];
    int strong;
    int eatnum;
 
    friend  bool operator < (Monkey n1, Monkey n2){
        if(n1.strong == n2.strong){
            return strcmp(n1.name, n2.name) < 0;
        }
        return n1.strong > n2.strong;
    }
};
  
Monkey monkeys[maxn];
  
int main(){
  
    int n;
    int m;
    while(scanf("%d %d",&n,&m)!=EOF){
        int i = 0;
        for(i=0; i < n; i++){
            scanf("%s %d %d" , &monkeys[i].name, &monkeys[i].strong, &monkeys[i].eatnum);
        }
      
        sort(monkeys,monkeys+n);
        
        for (i = 0; i < m; i++) {
            char newname[101];
            scanf("%s",&newname);   
            int num = 0;
            int j = 0; 
            while (j < n && strcmp(monkeys[j].name, newname) != 0) {
                num += monkeys[j].eatnum;
                j++;
            }
            printf("%d\n",num+1);  
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1416
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:2124 kb
****************************************************************/


                        