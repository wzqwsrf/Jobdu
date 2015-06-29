
#include<iostream>
#include<algorithm>
#include<string.h>
#include<stdio.h>
using namespace std;
char array[50002];
int len;

void reverseWord(int start, int end) {
	while (start < end) {
		char temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		start ++;
		end --;
	}
}

int main(){
    while(gets(array)){
		len = strlen(array);
		reverseWord(0,len-1);
		int s = 0;
        int e = 0;
        for ( s = e = 0; e < len ; e++) {
			if (array[e] == ' ') {
				reverseWord(s, e-1);
				s = e+1;
			}
		}
        reverseWord(s, e-1);
		puts(array);
	}
	return 0;
}
/**************************************************************
	Problem: 1361
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:50 ms
	Memory:1568 kb
****************************************************************/


                        