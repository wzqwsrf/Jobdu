
#include<stdio.h>
#include<algorithm> 
const int maxn = 10002;
const int maxm = 100002;
int parent[maxn];
using namespace std;
struct Node{
    int start;
    int end;
    int value;
}nodes[maxm];
  
int compare(Node node1 ,Node node2){
    if(node1.value < node2.value){
        return 1;
    }
    return 0;
}
 
int findParent(int f) {
     while (parent[f] != f) {
        f = parent[f];
    }
    return f;
}

void unionTwo(int f, int t) {          
	int a = findParent(f);
    int b = findParent(t);
    if (a == b)
		return;
    if (a > b) {
		parent[a] = b;
    } else {
		parent[b] = a;
    }
}
  
int main(){
 
    int n;
    int m;
    while(scanf("%d%d",&n,&m)!=EOF){
        int i = 0;
        for(i=0; i < m; i++){
            scanf("%d%d%d" , &nodes[i].start, &nodes[i].end, &nodes[i].value);
        }
     
        sort(nodes,nodes+m,compare);
        for(i = 1; i < n+1 ; i++){
            parent[i] = i;
        }
        int k = -1;
        for (i = 0; i < m; i++) {
            unionTwo(nodes[i].start, nodes[i].end);
            if (findParent(1) == findParent(n)) {
                k = nodes[i].value;
                break;
            }
        }
        printf("%d\n",k);  
    }
    return 0;
}
 
/**************************************************************
	Problem: 1545
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:680 ms
	Memory:2232 kb
****************************************************************/


                        