
#include <stdio.h>
#include <string.h>
#include <algorithm>
using namespace std;
const int maxn = 1000002;
int array[maxn];

int n,m,i;

int main(){
    while(scanf("%d",&n) != EOF){
		int num;
		memset(array,0,sizeof(array));
        for(i = 0; i < n; i++){
            scanf("%d",&num);
			array[num]++;
        }
		scanf("%d",&m);
        for(i = 0; i < m; i++){
            scanf("%d",&num);
			printf("%d\n",array[num]);
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1349
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:830 ms
	Memory:4928 kb
****************************************************************/


                        