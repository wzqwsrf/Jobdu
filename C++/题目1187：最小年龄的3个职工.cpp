
#include <stdio.h>
#include <algorithm>
#include<string.h>
using namespace std;
const int maxn = 32; 
struct Member{
	int id;
    char name[102];
    int age;
}members[maxn];

int n , i; 

bool cmp(Member m1 , Member m2){
    if(m1.age != m2.age){
        return m1.age < m2.age;
    }else {
		if(m1.id != m2.id){
			return m1.id < m2.id;
		}else{
			return strcmp(m1.name ,m2.name) < 0;
		}
    }
} 

int sortUnit(int low ,int high){
	Member m;
	m.id = members[low].id;
	strcpy(m.name,members[low].name);
	m.age = members[low].age;
	while(low < high){
		while(low < high && cmp(m,members[high])){
			high--;
		}
		members[low].id = members[high].id;
		strcpy(members[low].name,members[high].name);
		members[low].age = members[high].age;
		while(low < high && cmp(members[low],m)){
			low++;
		}
		members[high].id = members[low].id;
		strcpy(members[high].name,members[low].name);
		members[high].age = members[low].age;
	}
	members[high].id = m.id;
	strcpy(members[high].name,m.name);
	members[high].age = m.age;
	return high;
}

void sort(int low ,int high){
	if(low > high){
		return;
	}
	int index = sortUnit(low,high);
	sort(low ,index-1);
	sort(index+1,high);
}
int main(){
    while(scanf("%d",&n) != EOF){
        for(i = 0; i < n; i++){
            scanf("%d %s %d",&members[i].id,&members[i].name,&members[i].age);
        }
        sort(0,n-1);
		int tmp = n < 3 ? n : 3;
        for(i = 0; i < tmp; i++){
            printf("%d %s %d\n",members[i].id,members[i].name,members[i].age);
        }
    }
    return 0;
} 

/**************************************************************
	Problem: 1187
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1024 kb
****************************************************************/


                        