
#include <stdio.h>
#include <vector>
#include <string.h>
#include <stack>
using namespace std;

const int maxn = 100002;
int dfn[maxn];
int low[maxn];
int visited[maxn];
int instack[maxn];
int groupId[maxn];
int groupNum[maxn];

stack<int> numStack;
vector<int> edge[maxn],root[maxn];

int time,count,caseNum;
int n,m,s;

int min(int x, int y){
	return x < y ? x : y;
}

int max(int x, int y){
	return x > y ? x : y;
}

void initArr(){
	time = 1;
	count = 0;
	memset(dfn,0,sizeof(dfn));
	memset(low,0,sizeof(low));
	memset(visited,0,sizeof(visited));
	memset(instack,0,sizeof(instack));
	memset(groupId,0,sizeof(groupId));
	memset(groupNum,0,sizeof(groupNum));

	while(!numStack.empty()){
		numStack.pop();
	}
	for(int i = 0; i < maxn; i++){
		edge[i].clear();
		root[i].clear();
	}
}

void tarjan(int u){
	dfn[u] = low[u] = time;
	time++;
	visited[u] = 1;
	instack[u] = 1;
	numStack.push(u);
	int size = edge[u].size();
	for(int i = 0; i < size; i++){
		int v = edge[u][i];
		if(visited[v] == 0){
			tarjan(v);
			low[u] = min(low[u],low[v]);
		}else if(instack[v] == 1){
			low[u] = min(low[u],dfn[v]);
		}
	}

	if(dfn[u] == low[u]){
		count++;
		while(true){
			int v = numStack.top();
			numStack.pop();
			instack[v] = 0;
			groupId[v] = count;
			groupNum[count]++;
			if(v == u){
				break;
			}
		}
	}
}
void buildRoot(){
	for(int i = 1; i < n+1 ; i++){
		if(visited[i] == 0){
			continue;
		}
		int size = edge[i].size();
		for(int j = 0 ; j < size; j++){
			int v = edge[i][j];
			if(groupId[v] != groupId[i]){
				root[groupId[i]].push_back(groupId[v]);
			}
		}
	}
}
int dfs(int u){
	int maxLen = 0;
	visited[u] = 1;
	int size = root[u].size();
	for (int i = 0; i < size; i++) {
		int v = root[u][i];
		if (visited[v] == 0) {
			int tempLen = dfs(v);
			maxLen = max(tempLen, maxLen);
			visited[v] = 0;
		}
	}
	return groupNum[u] + maxLen;
}
int main(){
	caseNum = 1;
	while(scanf("%d%d%d",&n,&m,&s) != EOF){
		initArr();
		int i;
		for(i = 0; i < m; i ++){
			int v,u;
			scanf("%d%d",&v,&u);
			edge[v].push_back(u);
		}
		tarjan(s);
		buildRoot();
		memset(visited,0,sizeof(visited));
		printf("Case %d:\n%d\n",caseNum,dfs(groupId[s]));
		caseNum++;
	}
	return 0;
}

/**************************************************************
	Problem: 1418
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:620 ms
	Memory:11628 kb
****************************************************************/


                        