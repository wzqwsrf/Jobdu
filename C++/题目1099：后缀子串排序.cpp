
// 题目1099：后缀子串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1099
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17221537
 */


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


                        

