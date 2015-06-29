
#include <stdio.h>
#include <string.h>
#include <algorithm>
using namespace std;
const int maxn = 1002;
int n,i,j;
int array[maxn];
bool isTrue(int a){
	for(int k = 0; k < n; k++){
		if(array[k] == a){
			return true;
		}
	}
	return false;
}
int main(){
	while(scanf("%d",&n) != EOF){
		for(i = 0; i < n; i++){
			scanf("%d",&array[i]);
		}
		sort(array,array+n);
		int min = 5;
		for(i = 0; i < n; i++){
			int count = 0;
			for(j = 1; j < 5; j++){
				if(isTrue(array[i]+j)){
					continue;
				}else{
					count++;
				}
			}
			min = min < count ? min : count;
			if(min == 0){
				break;
			}
		}
		printf("%d\n",min);
	}
	return 0;
}
/**************************************************************
	Problem: 1394
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1024 kb
****************************************************************/


                        