
#include <stdio.h>
#include <string.h>
const int maxn = 10002;
char input[maxn];
int array[26];
int i;
int main(){
	while(scanf("%s",input) != EOF){
		memset(array,0,sizeof(array));
		int len = strlen(input);
		for(i = 0; i < len ; i ++){
			array[input[i]-'A']++;
		}
		int first = -1;
		for(i = 0; i < len ; i ++){
			if(array[input[i]-'A'] == 1){
				first = i;
				break;
			}
		}
		printf("%d\n",first);
	}
	return 0;
}
/**************************************************************
	Problem: 1283
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:20 ms
	Memory:1032 kb
****************************************************************/


                        