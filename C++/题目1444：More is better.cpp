
#include <stdio.h>
const int maxm = 10000002;
int parent[maxm];
int num[maxm];
int n;
int i;
 
int findParent(int f) {  
    while(parent[f] != f){
        f = parent[f];
    }
    return f;
}  
 
void unionTwo(int f, int t) {  
             
    
}  
 
int max(int a, int b){
	return a > b ? a : b;
}

int main(){
    while(scanf("%d",&n) != EOF){
        for(i = 1; i < maxm; i++){
			parent[i] = i;
			num[i] = 1;
        }
		int maxNum = 1;
        for(i = 0 ; i < n ; i++){
			int a, b;
            scanf("%d%d",&a,&b);
            a = findParent(a);  
			b = findParent(b);  
			if (a > b) {     
				parent[a] = b;
				num[b] += num[a];
				if(num[b] > maxNum){
					maxNum = num[b];
				}
			}else if(a < b){     
				parent[b] = a;
				num[a] += num[b];
				if(num[a] > maxNum){
					maxNum = num[a];
				}
			}	  
        }
		
        printf("%d\n",maxNum);
        
    }
    return 0;
}

/**************************************************************
	Problem: 1444
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:600 ms
	Memory:79144 kb
****************************************************************/


                        