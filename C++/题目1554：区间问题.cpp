
#include <stdio.h>
const int maxn = 10002;
int array[maxn];

int main(){
	int n, k, i, j;
	while(scanf("%d",&n) != EOF){
		int max = -100;
		int min = 100;
		int tempMax = 0;
		int tempMin = 0;
		for(i = 0; i < n; i++){
			scanf("%d", &array[i]);
			if(tempMax < 0){
				tempMax = array[i];
			}else{
				tempMax += array[i];
			}
			max = max > tempMax ? max : tempMax;
			if(tempMin > 0){
				tempMin = array[i];
			}else{
				tempMin += array[i];
			}
			min = min < tempMin ? min : tempMin;
		}
		scanf("%d",&k);
		if(k < min || k > max){
			printf("No\n");
			continue;
		}
		bool flag = false;
		for(i = 0; i < n; i++){
			int tempSum = 0;
			for(j = i; j < n; j++){
				tempSum += array[j];
				if(tempSum == k){
					flag = true;
					printf("%d ",(i+1));
					printf("%d\n",(j+1));
					break;
				}
			}
			if(flag){
				break;
			}
		}
		if(!flag){
			printf("No\n");
		}
	}
	return 0;
}
/**************************************************************
	Problem: 1554
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:1000 ms
	Memory:1060 kb
****************************************************************/


                        