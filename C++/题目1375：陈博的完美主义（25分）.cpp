
#include<stdio.h>
#include<string.h>
#include <stdlib.h>
const int maxn = 100002;
const int maxm = 102;
const int maxLen = 6;
int n, i;
char s[maxm];
int numArr[maxn];
int num;
int main(){
	while(scanf("%d", &n) != EOF){
		num = 0;
		memset(numArr, 0, sizeof(numArr));
		for(i = 0; i < n; i++){
			scanf("%s", s);
			if(strlen(s) > maxLen){
				num++;
				continue;
			}
			int tempNum = atoi(s);
			if(tempNum < 1 || tempNum > n){
				num++;
				continue;
			}
			if(numArr[tempNum] == 0){
				numArr[tempNum] = 1;
			}else{
				num++;
			}
		}
		printf("%d\n", num);
	}
	return 0;
}
/**************************************************************
	Problem: 1375
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:150 ms
	Memory:1412 kb
****************************************************************/


                        