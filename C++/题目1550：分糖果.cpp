
#include <stdio.h>
int n,i;

int candy(int *ratings) {  
	if(ratings == NULL || n == 0){  
		return 0;  
    }  
    int len = n;
    int *candyNum = new int[len];  
    for(i = 0; i < len; i++){  
		candyNum[i] = 1;  
    }  
    for(i = 1; i < len; i++){  
		if(ratings[i] > ratings[i-1]){  
			candyNum[i] = candyNum[i-1]+1;  
        }  
    }  
    for(i = len-2; i >= 0; i--){  
		if(ratings[i] > ratings[i+1] && candyNum[i] <= candyNum[i+1]){  
			candyNum[i] = candyNum[i+1]+1;  
        }  
    }  
    int allCandy = 0;  
    for(i = 0; i < len; i++){  
		allCandy += candyNum[i];  
    }  
    return allCandy;  
}  
int main(){
    while(scanf("%d",&n) != EOF){
		int *ratings = new int[n];
		for(int i = 0; i < n; i++){
			scanf("%d",&ratings[i]);
		}
        printf("%d\n",candy(ratings));
    }
    return 0;
}

/**************************************************************
	Problem: 1550
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:70 ms
	Memory:1552 kb
****************************************************************/


                        