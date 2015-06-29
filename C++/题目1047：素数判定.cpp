
#include <stdio.h>

int main(){
	int num;
	while(scanf("%d", &num) != EOF){
		if(num <= 1){
			printf("no\n");
			continue;
		}
		bool flag = false;
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				flag = true;
				break;
			}
		}
		printf(flag ? "no\n" : "yes\n");
	}
	return 0;
}
/**************************************************************
	Problem: 1047
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        