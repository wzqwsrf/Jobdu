
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
	Problem: 1066
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:1020 kb
****************************************************************/


                        