
#include <stdio.h>
#include <string.h>
#define INF 10000000;
const int maxn = 50;

int path[maxn][maxn];
int minLen[maxn];
int visited[maxn];
int m,i,j;
int dijkstra(){
	minLen[0] = 0;
	visited[0] = 1;
	int minj = 0;
	for(i = 0; i < maxn; i++){
		int min = INF;
		for(j = 0; j < maxn; j++){
			if(visited[j] == 0 && minLen[j] < min){
				min = minLen[j];
				minj = j;
			}
		}
		visited[minj] = 1;
		for(j = 0; j < maxn ; j++){
			if (visited[j] == 0 && minLen[j] > (minLen[minj] + path[minj][j])) {
				minLen[j] = minLen[minj] + path[minj][j];
			}
		}
	}
	int maxLen = 0;
	for (i = 1; i < maxn; i++) {
	    if(maxLen < minLen[i] && minLen[i] < 10000000){
			maxLen = minLen[i];
	    }
	}
	return maxLen;
}
int main(){
	while(scanf("%d",&m) != EOF){
		for(i = 0; i < maxn; i++){
			for(j = 0; j < maxn; j++){
				path[i][j] = INF;
			}
		}
		int sum = 0;
		for(i = 0; i < m; i++){
			int a,b,d;
			scanf("%d%d%d",&a,&b,&d);
			if(path[a][b] > d){
				path[a][b] =d;
				path[b][a] = d;
				sum += d;
			}
		}
		memset(visited,0,sizeof(visited));
		for(i = 1; i < maxn; i++){
			minLen[i] = path[0][i];
		}
		int maxLen = dijkstra();
		printf("%d\n",2*sum - maxLen);
	}
	return 0;
}

/**************************************************************
	Problem: 1414
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:30 ms
	Memory:1032 kb
****************************************************************/


                        