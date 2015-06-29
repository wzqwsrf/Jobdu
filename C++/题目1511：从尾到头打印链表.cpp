
#include <stdio.h>
#include <malloc.h>
struct LinkedNode{
    int data;
    struct LinkedNode *next;
};
 
int data,i;
void printfNode(LinkedNode *p){
	if(p->next!=NULL){
		printfNode(p->next);
	}
	printf("%d\n",p->data);
}
int main(){
    LinkedNode *node,*tail,*p;
	node = (LinkedNode*)malloc(sizeof(LinkedNode));
    node->next = NULL;
    tail = node;
    while(scanf("%d",&data) != EOF){
		if(data == -1){
			break;
		}
        p = (LinkedNode*)malloc(sizeof(LinkedNode));
        p->data = data;
        tail->next = p;
        tail = p;       
    }
	tail-> next = NULL;
	printfNode(node->next);
    return 0;
}
/**************************************************************
	Problem: 1511
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:5544 kb
****************************************************************/


                        