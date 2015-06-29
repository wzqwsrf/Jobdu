
#include <stdio.h>
#include <math.h>
using namespace std;

int n;
int main(){
    while(scanf("%d",&n) != EOF){
        if(n == 1){
            printf("1\n");
            continue;
        }
        printf("%ld\n", (long)pow(2, n-1));
    }
    return 0;
}

/**************************************************************
	Problem: 1389
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1108 kb
****************************************************************/


                        