
#include <stdio.h>
#include <string.h>
#include <queue>
using namespace std;
const int maxlen = 12;
const int maxn = 202;
const int maxTime = 24*60;
struct Plane{
	int time;
	char name[maxlen];
	char level;
};
Plane planes[maxn];
queue<Plane> queueArr[3];
int n, hour, minute;
int runArr[3];

int main(){
    int i,j;
    while(scanf("%d", &n)!=EOF){
        for(i = 0; i < n; i++){
            scanf("%2d:%2d %s %c", &hour, &minute, planes[i].name, &planes[i].level);
            planes[i].time = hour * 60 + minute;
        }
        memset(runArr, 0, sizeof(runArr));
		for(i = 0; i < 3; i++){
			while(!queueArr[i].empty()){
				queueArr[i].pop();
			}
		}
		int curTime = planes[0].time;
        i = 0;
        for(; curTime < maxTime; curTime++){
            hour = curTime / 60;
            minute = curTime % 60;
			int rank1 = -1;
            for(j = 0; j < 3; j++) {
				if(!queueArr[j].empty()){
					rank1 = j;
					break;
				}
			}
			int rank2 = -1;
			for (j = 0; j < 3; j++) {
				if (runArr[j] <= curTime) {
					rank2 = j;
					break;
				}
			}
            if(rank1 != -1 && rank2 != -1){
				Plane plane = queueArr[rank1].front();
				queueArr[rank1].pop();
				runArr[rank2] = curTime + 20;
				printf("%s,landing on runway %d.@%02d:%02d\n", plane.name, rank2+1, hour, minute);
			}
             
            if (curTime % 20 == 0) {
				if (!queueArr[1].empty()) {
					Plane plane = queueArr[1].front();
					queueArr[1].pop();
					plane.level = 'A';
					plane.time = curTime;
					queueArr[0].push(plane);
					printf("%s,level up from B to A.@%02d:%02d\n", plane.name, hour, minute);
				}
				if (!queueArr[2].empty()) {
					Plane plane = queueArr[2].front();
					queueArr[2].pop();
					plane.level = 'B';
					plane.time = curTime;
					queueArr[1].push(plane);
					printf("%s,level up from C to B.@%02d:%02d\n", plane.name, hour, minute);
				}
			}
			if (i < n && planes[i].time == curTime) {
				if (planes[i].level == 'A') {
					queueArr[0].push(planes[i]);
				}
				if (planes[i].level == 'B') {
					queueArr[1].push(planes[i]);
				}
				if (planes[i].level == 'C') {
					queueArr[2].push(planes[i]);
				}
				printf("hello %s.@%02d:%02d\n", planes[i].name, hour, minute);
				i++;
			}
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1556
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:50 ms
	Memory:1056 kb
****************************************************************/


                        