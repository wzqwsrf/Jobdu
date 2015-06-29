
#include <stdio.h>
#include <string.h>
const int maxLen = 32;
char numArr[maxLen];
int len;

bool isTrue(int k){
	int num1 = 0;
	int num2 = 0;
	for(int i = 0; i < len; i++){
		num1 = numArr[i] - '0' + num2 * 10;
		num2 = num1 % k;
	}
	return num2 == 0 ? true : false;
}
int main(){
	while(scanf("%s", numArr) != EOF){
		if(!strcmp(numArr, "-1")){
			break;
		}
		len = strlen(numArr);
		bool flag = false;
		bool first = true;
		int k = 2;
		while(k >= 2 && k <= 9){
			if(isTrue(k)){
				flag = true;
				if(first){
					printf("%d", k);
					first = false;
				}else{
					printf(" %d", k);
				}
			}
			k++;
		}
		if(!flag){
			printf("none\n");
		}else{
			printf("\n");
		}
	}
	return 0;
}
/**************************************************************
	Problem: 1125
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:30 ms
	Memory:1020 kb
****************************************************************/


                        