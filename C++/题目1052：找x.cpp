
#include<stdio.h>
int array[202];
int findPos(int n,int x)
{
    int i=0;
    for(i = 0; i < n; i++){
        if(array[i] == x){
            return i;
        }
    }
    return -1;
}
int main()
{
    int n;
    int i, x;
    while(scanf("%d",&n) != EOF){
        for(i = 0; i < n; i++){
            scanf("%d",&array[i]);
        }
        scanf("%d",&x);
        printf("%d\n",findPos(n,x));
    }
    return 0;
}

/**************************************************************
	Problem: 1052
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        