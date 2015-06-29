
#include <stdio.h>
#include <stack>   
#include <string.h>
#include <string>
using namespace std; 
int n,i; 

int main(){
    while(scanf("%d",&n) != EOF){
        stack<int> numStack;
		stack<int> minStack;
		for(i = 0; i < n; i++){
			char operate[2];
			scanf("%s",operate);
			if(operate[0] == 'o'){
				if(numStack.empty()){
					printf("NULL\n");
				}else{
					numStack.pop();
					minStack.pop();
					if(minStack.empty()){
						printf("NULL\n");
					}else{
						printf("%d\n",minStack.top());
					}
				}
			}else{
				int k;
				scanf("%d",&k);
				numStack.push(k);
				if (minStack.empty()) {
					minStack.push(k);
				}else {
					if (k < minStack.top()) {
						minStack.push(k);
					 }else {
						minStack.push(minStack.top());
					}
				} 
				printf("%d\n",minStack.top());
			}
		}
		
    }
    return 0;
} 

/**************************************************************
	Problem: 1522
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:20 ms
	Memory:1052 kb
****************************************************************/


                        