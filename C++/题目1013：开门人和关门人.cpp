
#include <iostream>
#include <stdio.h>
#include <string.h>
#include <string>
#include <algorithm>
using namespace std;
const int maxn = 10002;
struct Task{
    char name[16];
    char start[12];
    char end[12];
}tasks[maxn];

Task minTask;
Task maxTask;

int n,m,i,j;

int main(){
	char start[12];
	char end[12];
	char name[16];
	cin >> n;
	
	for(i = 0; i < n ; i++){
		cin >> m;
		cin >> minTask.name;
		cin >> minTask.start;
		cin >> minTask.end;
		strcpy(maxTask.name,minTask.name);
		strcpy(maxTask.start,minTask.start);
		strcpy(maxTask.end,minTask.end);
		for(j = 1; j < m ; j++){
			cin >> name;
			cin >> start;
			cin >> end;
			if(strcmp(start,minTask.start) < 0){
				strcpy(minTask.name,name);
				strcpy(minTask.start,start);
				strcpy(minTask.end,end);
			}

			if(strcmp(end,minTask.end) > 0){
				strcpy(maxTask.name,name);
				strcpy(maxTask.start,start);
				strcpy(maxTask.end,end);
			}        
		}
		cout<<minTask.name<<' '<<maxTask.name<<endl;
	}
    return 0;
}

/**************************************************************
	Problem: 1013
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1908 kb
****************************************************************/


                        