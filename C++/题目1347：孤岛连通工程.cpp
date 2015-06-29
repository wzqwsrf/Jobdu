
#include<stdio.h>
#include<algorithm> 
const int maxn = 1002;
const int maxm = 10002;
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
        int sum = 0;
        int count = 0;
        bool flag = false;
        for (i = 0; i < m; i++) {
            if (findParent(nodes[i].start) != findParent(nodes[i].end)) {
                count++;
                unionTwo(nodes[i].start, nodes[i].end);
                sum += nodes[i].value;
                if(count == n-1){
                    flag = true;
                    break;
                }
            }
        }
        if(flag || count == n-1){
            printf("%d\n",sum); 
        }else{
            printf("%s\n","no");
        }
          
    }
    return 0;
}
/**************************************************************
	Problem: 1347
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:800 ms
	Memory:1140 kb
****************************************************************/


                        