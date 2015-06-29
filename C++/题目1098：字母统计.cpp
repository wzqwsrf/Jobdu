
#include <stdio.h>
#include <string.h>
int numArr[26];
char input[1000];

int main(){
	while(scanf("%s",input) != EOF){
		memset(numArr,0,sizeof(numArr));
        int len = strlen(input);
		for(int i = 0; i < len; i++){
			if(input[i] >= 'A' && input[i] <= 'Z'){
				numArr[input[i] - 65]++;
			}
		}
        for(int i = 0; i < 26; i++){
			printf("%c:%d\n",i+65,numArr[i]);
		}
	}
    return 0;
}

/**************************************************************
	Problem: 1098
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        