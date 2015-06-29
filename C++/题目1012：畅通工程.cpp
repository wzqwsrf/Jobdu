
#include <stdio.h>
const int maxn = 1002;
int parent[maxn];
int n;
int m;
int i;
 
int findParent(int f) {  
    while(parent[f] != f){
        f = parent[f];
    }
    return f;
}  
 
void unionTwo(int f, int t) {  
             
    int a = findParent(f);  
    int b = findParent(t);  
    if (a == b) return;   
    if (a > b) {     
        parent[a] = b;     
    } else {  
        parent[b] = a;   
    }  
}  

int main(){
    while(scanf("%d",&n) != EOF){
		if(n == 0){
			break;
		}
		scanf("%d",&m);
		for(i = 1; i < n+1; i++){
			parent[i] = i;
		}
		for(i = 0 ; i < m ; i++){
			int a, b;
			scanf("%d%d",&a,&b);
			unionTwo(a,b);
		}
		for (i = 1; i < n+1; i++) {  
			parent[i] = findParent(i);  
		}
		int num = 0;
		for(i = 1; i < n+1; i++){
			if(parent[i] == i){
				num ++;
			}
		}
		printf("%d\n",num - 1);
	}
    return 0;
}
/**************************************************************
	Problem: 1012
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1024 kb
****************************************************************/


                        