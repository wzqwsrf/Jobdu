
#include <stdio.h>
#include <stack>   
#include <string.h>
#include <string>
using namespace std; 
int n,i; 

int main(){
    while(scanf("%d",&n) != EOF){
		if(n == 0){
			break;
		}
        stack<int> numStack;
		for(i = 0; i < n; i++){
			char operate[2];
			scanf("%s",operate);
			if(operate[0] == 'P'){
				int k;
				scanf("%d",&k);
				numStack.push(k);
			}else if(operate[0] == 'O'){
				if(!numStack.empty()){
					numStack.pop();
				}
			}else{
				if(numStack.empty()){
					printf("E\n");
				}else{
					printf("%d\n",numStack.top());
				}
			}
		}
		printf("\n");
    }
    return 0;
} 

/**************************************************************
	Problem: 1108
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:20 ms
	Memory:1052 kb
****************************************************************/


                        