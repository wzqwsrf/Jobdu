
// 题目1024：畅通工程

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1024
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17166249
 */


#include<stdio.h>
#include<algorithm> 
const int maxn = 102;
const int maxm = 102;
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
    while(scanf("%d%d",&m,&n)!=EOF){
		if(m == 0){
			break;
		}
        int i = 0;
        for(i=0; i < m; i++){
            scanf("%d%d%d" , &nodes[i].start, &nodes[i].end, &nodes[i].value);
        }
        sort(nodes,nodes+m,compare);
        for(i = 1; i < n+1 ; i++){
            parent[i] = i;
        }
        int minValue = 0;
		int count = 0;
        for (i = 0; i < m; i++) {
			if (findParent(nodes[i].start) != findParent(nodes[i].end)) {
				unionTwo(nodes[i].start,nodes[i].end);
                minValue += nodes[i].value;
				count++;
				if(count == n-1){
					break;
				}
            }
        }
		if(count < n-1){
			printf("?\n");
		}else{
			printf("%d\n", minValue);  
		}
        
    }
    return 0;
}
  
/**************************************************************
	Problem: 1024
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1024 kb
****************************************************************/


                        

