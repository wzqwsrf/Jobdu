
#include <stdio.h>
const int maxn = 72;
long array[maxn];
int n;
int main(){
    while(scanf("%d",&n) != EOF){
        if(n == 1){
            printf("1\n");
            continue;
        }
        array[1] = 1;
        array[2] = 2;
        for(int i = 3; i < n + 1; i++){
            array[i] = array[i-1] + array[i-2];
        }
        printf("%ld\n", array[n]);
    }
    return 0;
}

/**************************************************************
	Problem: 1388
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        