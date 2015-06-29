
#include <stdio.h>
#include <string.h>
const int maxn = 1002;
int arrayA[maxn];
int arrayB[maxn];
char symbol[2];
int n,i,j,k;
int abs(int x){
	return x < 0 ? -x : x;
}
void initArray(){
	for(i = 1; i < n+1; i++){
		arrayA[i] = 0;
		arrayB[i] = 1;
	}
}
int main(){
    while(scanf("%d%d",&n,&k) != EOF){
		int num = 0;
		initArray();
		for(i = 0; i < k ; i++){
			int first;
			scanf("%d",&first);
			int *tempArrayA = new int[first];
            int *tempArrayB = new int[first];
			for (j = 0; j < first; j++) {        
				scanf("%d",&tempArrayA[j]);
			}
			for (j = 0; j < first; j++) {        
				scanf("%d",&tempArrayB[j]);
			}
			scanf("%s",symbol);
                
			if(symbol[0] == '='){
				for(j = 0; j < first; j++){
					arrayB[tempArrayA[j]] = 0;
					arrayB[tempArrayB[j]] = 0;
				}
			}else if(symbol[0] == '>'){
				num++;
				for(j = 0; j < first; j++){
					arrayA[tempArrayA[j]]++;
					arrayA[tempArrayB[j]]--;
				}
			}else if(symbol[0] == '<'){
				num++;
				for(j = 0; j < first; j++){
					arrayA[tempArrayA[j]]--;
					arrayA[tempArrayB[j]]++;
				}
			}
		}
		int maxId = 0;
		int count = 0;
		for(j = 1; j < n+1; j++){
			if(arrayB[j] == 1 && abs(arrayA[j]) == num){
				maxId = j;
				count++;
			}
		}
		printf("%d\n",count == 1 ? maxId : 0);
    }
    return 0;
}
/**************************************************************
	Problem: 1486
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:30 ms
	Memory:1428 kb
****************************************************************/


                        