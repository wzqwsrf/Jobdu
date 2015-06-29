
#include <stdio.h>
#include <string.h>
const int len = 60;
const int maxN = 20;
int array[len];
int primeArr[len];
int numArr[maxN];
int visit[maxN];
int n;
 
void initArray(){
    int i, j;
    for(i = 1; i < len; i++){
        if(i % 2 == 0){
            array[i] = 0;
        }else{
            array[i] = 1;
        }
    }
    array[1] = 0;
    array[2] = 1;
    for(i = 3; i < len; i++){
        if(array[i] == 1){
            for(j = 2 * i; j < len; j += i){
                array[j] = 0;
            }
        }
    }
    memset(primeArr, 0, sizeof(primeArr));
    int k = 0;
    for(i = 1; i < len; i++){
        if(array[i] == 1){
            primeArr[i] = 1;
        }
    }
}
 
void dfs(int start, int n){
    int i, j;
     
    if(start == n + 1){
        if(primeArr[1+numArr[n]] == 1){
            for(i = 1; i < n; i++){
                printf("%d ", numArr[i]);
            }
            printf("%d\n", numArr[n]);
        }
        return;
    }
    for(i = 2; i < n+1; i++){
        if(visit[i] == 0 && primeArr[i + numArr[start - 1]] == 1){
            visit[i] = 1;
            numArr[start] = i;
            dfs(start+1, n);
            visit[i] = 0;
        }
    }
}
 
int main(){
    initArray();
    int seq = 1;
    while(scanf("%d", &n) != EOF){
        printf("Case %d:\n", seq);
        memset(numArr, 0, sizeof(numArr));
        memset(visit, 0, sizeof(visit));
        numArr[1] = 1;
        dfs(2, n);
        printf("\n");
        seq++;
         
    }
    return 0;
}
/**************************************************************
	Problem: 1459
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:400 ms
	Memory:1020 kb
****************************************************************/


                        