
#include <iostream>
#include <string.h>
#include <string>
#include <algorithm>
using namespace std;
int i,n;

bool cmp(string s1, string s2){
	return s1.length() < s2.length();
}
int main(){     
	string s;
    while(cin >> n){
		cin.ignore();
		string *array = new string[n];
		for(i = 0 ; i < n; i++){
			getline(cin,s);
			if(s == "stop"){
				break;
			} 
			array[i] = s;
		}
		sort(array, array+i, cmp);
		n = i;
		for(i = 0 ; i < n; i++){
			cout << array[i] << endl;
		}
	}
    return 0;
}
/**************************************************************
	Problem: 1135
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1528 kb
****************************************************************/


                        