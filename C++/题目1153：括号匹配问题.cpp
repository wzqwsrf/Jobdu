
#include <stdio.h>
#include <stack>
#include <string>
#include <string.h>
using namespace std;
const int maxn = 102;
char input[maxn];
int main(){
	int n,i;
	while(scanf("%s",input) != EOF){
		stack<int> symStack;
		n = strlen(input);
		int *flagArr = new int[n];
		memset(flagArr,0,sizeof(flagArr));
		for(i = 0 ; i < n; i++){
			//如果是左括号，将当前数字入栈，表明位置
			if(input[i] == '('){
				symStack.push(i);
			}else if(input[i] == ')'  && !symStack.empty()){
				//如果是右括号，并且当前栈不为空，就出栈，同时将位置标为1。
				//表明有左右括号相匹配。
				int j = symStack.top();
				symStack.pop();
				flagArr[i] = 1;
				flagArr[j] = 1;
			}
		}
		printf("%s\n",input);
		//循环输出结果
        for (i = 0; i < n; i++) {
			if (input[i] == '(') {
				//发现是左括号，并且标志位为1，表示有右括号匹配，输出空格。
				if(flagArr[i] != 1){
					printf("$");
				}else{
					//否则输出$
					printf(" ");
				}
            }else if (input[i] == ')') {
				//发现是右括号，并且标志位为1，表示有左括号匹配，输出空格。
				if(flagArr[i] != 1){
					printf("?");
				}else{
					//否则输出?
					printf(" ");
				}
            }else{
				printf(" ");
			}
        }
		printf("\n");
	}
	return 0;
}

/**************************************************************
	Problem: 1153
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1052 kb
****************************************************************/


                        