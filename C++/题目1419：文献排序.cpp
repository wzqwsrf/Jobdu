
#include <stdio.h>
#include <string.h>
#include <string>
#include<algorithm>
using namespace std;
const int maxn = 102;
const int maxm = 202;
int n,i;
struct Node{
	char allStr[maxm];	
}nodes[maxn];

void toLowCase(char s[]){
	int len = strlen(s);
	for(i = 0 ; i < len ; i++){
		if(s[i] >= 'A' && s[i] <= 'Z'){
			s[i] = s[i] - 'A' + 'a';
		}
	}
}
  
bool cmp(Node node1, Node node2){
	toLowCase(node1.allStr);
	toLowCase(node2.allStr);
	return strcmp(node1.allStr,node2.allStr) < 0;
}

int main(){

	while(scanf("%d",&n)!=EOF)
    {
        gets(nodes[0].allStr);
        for(i = 0;i < n; i++){
			gets(nodes[i].allStr);
		}
        sort(nodes,nodes+n,cmp);
        for(i = 0;i < n; i++){
			puts(nodes[i].allStr);
		}
    }
	return 0;
}
/**************************************************************
	Problem: 1419
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:1044 kb
****************************************************************/


                        