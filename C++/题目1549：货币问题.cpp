
#include <stdio.h>

int main(){
	int p;
    while(scanf("%d",&p) != EOF){
        int array[7] = {100,50,20,10,5,2,1};
		int num = 0;
		for(int i = 0; i < 7; i++){
			if(p >= array[i]){
				num += p / array[i];
				p %= array[i];
			}
		}
        printf("%d\n",num);
    }
    return 0;
}

/**************************************************************
	Problem: 1549
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:30 ms
	Memory:1020 kb
****************************************************************/


                        