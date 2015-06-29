
#include <stdio.h>
#include <string.h>
#include <string>
#include <algorithm>
using namespace std;
const int maxn = 11;
char array[maxn];
int len;

void printArr(){
	for (int i = 0; i < len; i++){
		printf("%c", array[i]);
	}
	printf("\n");
}
void swap(int a, int b) {
	char temp = array[b];
	array[b] = array[a];
	array[a] = temp;
}

void reverse(int a, int b) {
	while (a < b) {
		swap(a, b);
		a++;
		b--;
	}
}
void permutation() {
	
	int i,j;
	while (true) {
		printArr();

		for (i = len - 2; i >= 0; i--) {
			if (array[i] < array[i+1]) {
				break;
			}
			if (i == 0) {
				return;
			}
		}
		for (j = len - 1; j > i ; j--) {
			if (array[j] > array[i]) {
				break;
			}
		}
			
		swap(i,j);
		reverse(i+1,len-1);
	}
}
	
	
int main(){	

    while(scanf("%s",&array) != EOF ){
		len = strlen(array);
		sort(array, array + len);
		if (len == 1) {
			printf("%c\n", array[0]);
			continue;
		}
		permutation();
	}
  
    return 0;
}
/**************************************************************
	Problem: 1369
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:440 ms
	Memory:1020 kb
****************************************************************/


                        