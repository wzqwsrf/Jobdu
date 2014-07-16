// 题目1446：Head of a Gang
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月03日14:33:53
 * @url：http://ac.jobdu.com/problem.php?pid=1446
 * 并查集变形，比一般并查集稍难，重点在理清思路
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17101513
 */
#include <stdio.h>
#include <map>
#include <vector>
#include <string>
#include <string.h>
#include <algorithm>
#include <list>
using namespace std;
const int maxn = 1002;
int parent[maxn];
int n;
int k;
int i;
int currNum;
map<string , int> baseMap;
char array[maxn][4];
char resultArr[maxn][4];
int callTime[maxn];
int singleCallTime[maxn];
int fatherArr[maxn];
int visit[maxn];

struct Node{
    char name[4];
    int size;
}nodes[maxn];

//并查集寻找父亲节点
int findParent(int f) {
    while(parent[f] != f){
        f = parent[f];
    }
    return f;
}
//并查集合并节点
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
//初始化基本数据，这在以后会用到
void initData(){
    baseMap.clear();
    memset(callTime,0,sizeof(callTime));
    memset(visit,0,sizeof(visit));
    memset(singleCallTime,0,sizeof(singleCallTime));
    memset(fatherArr,0,sizeof(fatherArr));
    for(i = 1; i < maxn ; i++){
        parent[i] = i;
    }
}
//将字符串转为数字，否则后面不太好处理
int getCurrentNum(char c[]) {
    int num = 0;
    map<string,int>::iterator it = baseMap.find(c);
    if (it == baseMap.end()) {
        currNum++;
        num = currNum;
        baseMap.insert(make_pair(c,num));
    }else {
        num = it->second;
    }
    return num;
}
//记录每个人打电话的时间
void constructData(char a[], char b[], int anum, int bnum, int d) {
     if (singleCallTime[anum] == 0) {
        singleCallTime[anum] = d;
     }else {
        singleCallTime[anum] += d;
     }
     strcpy(array[anum],a);
     strcpy(array[bnum],b);
     callTime[anum] += d;
     callTime[bnum] += d;
}

bool cmp(Node node1,Node node2){
    return strcmp(node1.name,node2.name)<0;
}

int main(){
    while(scanf("%d%d",&n,&k) != EOF){
        initData();
        currNum = 0;
        char a[4];
        char b[4];
        int d;
        for(i = 0; i < n; i++){
            scanf("%s%s%d",a,b,&d);
        //  printf("%s\n",a);
        //  printf("%s\n",b);
            int anum = getCurrentNum(a);
            int bnum = getCurrentNum(b);
        //  printf("%d\n",anum);
        //  printf("%d\n",bnum);
            constructData(a , b, anum , bnum ,d);
            unionTwo(anum,bnum);
        }


        int tmpk = 1;
        for (i = 1; i < currNum+1; i++) {
            parent[i] = findParent(i);
        //  printf("%d\n",parent[i]);
            if(parent[i] == i){
                fatherArr[tmpk] = i;
                tmpk++;
            }
        }
        //printf("%d\n",tmpk);
        int num = 0;
        for (i = 1; i < tmpk; i++) {
            int size = 0;
            int allTime = 0;
            int maxTime = -1;
            int maxMem = 0;
            for (int j = 1; j < currNum + 1; j++) {
                if(fatherArr[i] != 0 && visit[j] == 0){
                    if(parent[j] == fatherArr[i]){
                        size++;
                        allTime += singleCallTime[j];
                        if (callTime[j] > maxTime) {
                            maxTime = callTime[j];
                            maxMem = j;
                        }
                        visit[j] = 1;
                    }
                }
            }
            if(size < 3){
                continue;
            }
            if(allTime <= k){
                continue;
            }
            strcpy(nodes[num].name,array[maxMem]);
            nodes[num].size = size;
            num++;
        }
        sort(nodes, nodes + num , cmp);
        printf("%d\n",num);
        for(i = 0; i < num ; i++){
            printf("%s %d",nodes[i].name,nodes[i].size) ;
        //  printf("%d",nodes[i].size) ;
            printf("\n");
        }
    }
    return 0;
}
/**************************************************************
    Problem: 1446
    User: wangzhenqing
    Language: C++
    Result: Accepted
    Time:30 ms
    Memory:1096 kb
****************************************************************/

// 目1529：棋盘寻宝
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月04日11:37:20
 * @url：http://ac.jobdu.com/problem.php?pid=1529
 * 简单dp，每次只能往右或者往下走。
 * 1、当在首行时，上一步走到当前步，只能是右走。因此当前拿到礼物的最大价值是前一列拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i][j-1] + array[i][j];
 * 2、当在首列时，上一步走到当前步，只能是下走。因此当前拿到礼物的最大价值是前一行拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i-1][j] + array[i][j];
 * 3、在其他位置，可以往下或者往右，因此最大值为
 * dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/25304325
 */
#include<stdio.h>
#include<string.h>
const int len = 8;
int array[len][len];
int dp[len][len];
int i, j;
 
int max(int a,int b){
    return a > b ? a : b;
}
 
int main(){
    while(scanf("%d",&array[0][0]) != EOF){
        memset(dp, 0, sizeof(dp));
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                scanf("%d",&array[i][j]);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = array[i][j];
                }else if (i == 0) {
                    dp[i][j] = dp[i][j-1] + array[i][j];
                }else if (j == 0) {
                    dp[i][j] = dp[i-1][j] + array[i][j];
                }else {
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
                }
            }
        }
        printf("%d\n", dp[7][7]);
    }
    return 0;
}

/**************************************************************
    Problem: 1529
    User: wangzhenqing
    Language: C++
    Result: Accepted
    Time:0 ms
    Memory:1020 kb
****************************************************************/

// 题目1001：A+B for Matrices
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日17:32:32
 * @url：http://ac.jobdu.com/problem.php?pid=1001
 * 矩阵相加，求整行和整列为0的行列数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/37882211
 */

#include <stdio.h>
const int max = 102;
int matrix[max][max];
int m, n;
int i, j;
int main(){
    while(scanf("%d", &m) != EOF){
        if(m == 0){
            break;
        }
        scanf("%d", &n);
        for(i = 0 ; i < m; i++){
            for(j = 0; j < n; j++){
                scanf("%d", &matrix[i][j]);
            }
        }

        for(i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                int tempNum;
                scanf("%d", &tempNum);
                matrix[i][j] += tempNum;
            }
        }
        int zeroNum = 0;
        for (i = 0; i < m; i++) {
            bool isZero = true;
            for (j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                zeroNum++;
            }
        }
        for (j = 0; j < n; j++) {
            bool isZero = true;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                zeroNum++;
            }
        }
        printf("%d\n", zeroNum);
    }
    return 0;
}
/**************************************************************
    Problem: 1001
    User: wangzhenqing
    Language: C++
    Result: Accepted
    Time:0 ms
    Memory:1060 kb
****************************************************************/
