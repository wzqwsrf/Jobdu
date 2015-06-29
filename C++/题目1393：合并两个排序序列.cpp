
#include <stdio.h>
const int maxn = 1000002;
int n,i;
 
 
int main(){
 
    while(scanf("%d",&n) != EOF){
        int len = 2*n;
        int *array = new int[len];
        int *sortArr1 = new int[n];
        int *sortArr2 = new int[n];
        for(i = 0; i < n; i++){
            scanf("%d",&sortArr1[i]);
        }
        for(i = 0; i < n; i++){
            scanf("%d",&sortArr2[i]);
        }
        int k1 = 0;
        int k2 = 0;
        int k = 0;
        while(k1 < n && k2 < n){
            if(sortArr1[k1] < sortArr2[k2]){
                array[k] = sortArr1[k1];
                k++;
                k1++;
            }else{
                array[k] = sortArr2[k2];
                k++;
                k2++;
            }
        }
        while(k1 < n){
            array[k] = sortArr1[k1];
            k++;
            k1++;
        }
 
        while(k2 < n){
            array[k] = sortArr2[k2];
            k++;
            k2++;
        }
        for(i = 0; i < len-1; i++){
            printf("%d ",array[i]);
        }
        printf("%d\n",array[len-1]);
    }   
    return 0;
}
/**************************************************************
	Problem: 1393
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:1190 ms
	Memory:16656 kb
****************************************************************/


                        