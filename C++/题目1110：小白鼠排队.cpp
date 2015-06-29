
#include <stdio.h>
#include <string.h>
#include <string>
#include <algorithm>
using namespace std;
const int maxn = 102;
struct Mouse{
    int weight;
	char color[12];
}mouses[maxn];

int n,i;
bool cmp(Mouse m1,Mouse m2){
	return m1.weight > m2.weight;
}
int main(){
	while(scanf("%d",&n) != EOF){
		for(i = 0; i < n; i++){
			scanf("%d %s",&mouses[i].weight,&mouses[i].color);
		}
		sort(mouses,mouses+n,cmp);
		for(i = 0; i < n; i++){
			printf("%s\n",mouses[i].color);
		}
	}
    return 0;
}

/**************************************************************
	Problem: 1110
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1028 kb
****************************************************************/


                        