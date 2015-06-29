
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <string>
#include <queue>
using namespace std;
const int maxn = 102;
int visit[maxn][maxn];
char mazeArr[maxn][maxn];
int stepArr[8][2] = {{-1,0},{1,0},{0,-1},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
int m,n,startx,starty;
   
struct Node{
    int x;
    int y;
    Node(int x1,int y1):x(x1),y(y1){}
};
   
void bfs() {
    Node node(startx,starty);
	visit[startx][starty] = 1;
    queue<Node> q ;
    while(!q.empty()) q.pop();
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        for (int i = 0; i < 8; i++) {
            int x = node.x + stepArr[i][0];
            int y = node.y + stepArr[i][1];
            if (x >= 0 && y >= 0 && x < m && y < n 
                        && visit[x][y] == 0 && mazeArr[x][y] == '@') {
                visit[x][y] = 1;
                Node next(x, y);
                q.push(next);
            }
        }
    }
}
int main()
{	
	int i,j;
    while(scanf("%d%d",&m,&n) != EOF ){
        if(m == 0 && n == 0){
            break;
        }
        getchar();  
        for (i = 0; i < m; i++){
			scanf("%s", mazeArr[i]);  
		}
        memset(visit,0,sizeof(visit));        
		int count = 0;
        for (i = 0; i < m; i++){
			for(j = 0; j < n; j++){
				if(mazeArr[i][j] != '*' && visit[i][j] == 0){
					startx = i;
					starty = j;
					bfs();
					count++;
				}
			}
		}
        printf("%d\n",count);
    }
     
    return 0;
}

/**************************************************************
	Problem: 1460
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1104 kb
****************************************************************/


                        