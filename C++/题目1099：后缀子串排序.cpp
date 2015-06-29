
#include <iostream>
#include <stdlib.h>
#include <string>
#include <algorithm>
using namespace std;

int i ;
int main(){     
    string s;
    while(cin>>s){
       int n = s.size();
       string sch[500];
       for(i = 0; i < n; i++){
		  sch[i] = s.substr(i,n);
	   } 
       sort(sch,sch+n);
       for(i= 0;i < n; i++){
          cout<<sch[i]<<endl;      
	   }    
    }
    return 0;
}
/**************************************************************
	Problem: 1099
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1524 kb
****************************************************************/


                        