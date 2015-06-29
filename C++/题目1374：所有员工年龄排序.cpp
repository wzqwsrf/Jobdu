
#include <stdio.h>
#include <string.h>
int array[100];
int i,j,n;

int main(){     
	
    while(scanf("%d",&n) != EOF){
		memset(array, 0, sizeof(array));
		int num;
		for(i = 0 ; i < n; i++){
			scanf("%d",&num);
			array[num]++;
		}
		for(i = 1 ; i < 100; i++){
			for(j = 0 ; j < array[i]; j++){
				printf("%d ",i);
			}
		}
		printf("\n");
	}
    return 0;
}
/**************************************************************
	Problem: 1374
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:740 ms
	Memory:1020 kb
****************************************************************/


                        