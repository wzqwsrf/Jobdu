
#include <stdio.h>
#include <string.h>
#include<algorithm>
using namespace std;
const int maxn = 65;
int array[maxn];
int visit[maxn];
int n;
int tempSum, group;

bool compare(int a , int b){
	return a > b;
}

bool dfs(int groupId, int allSum ,int start) {
	if (groupId == group) {
		return true;
	}
	int i , newSum;
	for (i = start; i < n; i++) {
		if (visit[i] != 0) {
			continue;
		}
		if ((newSum = allSum + array[i] ) < tempSum) {
			visit[i] = groupId;
			if (dfs(groupId, newSum ,i+1)) {
				return true;
			}
			visit[i] = 0;	
			if(start == 0){
				break;
			}
		}else if (newSum == tempSum) {
			visit[i] = groupId;
			groupId++;
			if (dfs(groupId, 0  ,0)) {
				return true;
			}
			visit[i] = 0;
			break;
		}
	}
	return false;
}
int main(){
	n = 0;
	while(scanf("%d",&n) != EOF){
		if(n == 0){
			break;
		}
		memset(array ,0 , sizeof(array));
		int maxValue = 0;
		int sum = 0;
		for(int i = 0 ; i < n; i++){
			scanf("%d",&array[i]);
			sum += array[i];
		}
		sort(array, array + n, compare);
		int resultM = 1;
		for (int j = array[0]; j <= sum ; j++) {
            if (sum % j == 0) {
				tempSum = j;
                memset(visit ,0 , sizeof(visit));
				group = sum / j;
				bool flag = dfs(1, 0 ,0);
                if (flag) {
					resultM = group;
                    break;
                }
            }
        }
		printf("%d\n",resultM);
	
	}
	return 0;
}
/**************************************************************
	Problem: 1251
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1020 kb
****************************************************************/


                        