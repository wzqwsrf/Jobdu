
#include <stdio.h>
#include <malloc.h>
struct LinkedNode{
	int data;
	struct LinkedNode *next;
};

int n,i;

int main(){
	LinkedNode *node,*tail,*p,*q;
	while(scanf("%d",&n) != EOF){
		node = (LinkedNode*)malloc(sizeof(LinkedNode));
		node->next = NULL;
		tail = node;
		for(i = 0; i < n; i++){
			int data;
			scanf("%d",&data);
			p = (LinkedNode*)malloc(sizeof(LinkedNode));
			p->data = data;
			tail->next = p;
			tail = p;
		}
		tail-> next = NULL;
		p = node->next;
		while(p != NULL){
			q = p -> next;
			while(q != NULL){
				if(p -> data > q->data){
					int tmp = p->data;
					p->data = q->data;
					q->data = tmp;
				}
				q = q->next;
			}
			p = p->next;
		}
		p = node->next;
		for(i = 0; i < n; i++){
			if(i == n-1){
                printf("%d\n",p->data);
			}else{
				printf("%d ",p->data);
				p = p->next;
			}   
		}
		free(p);
		free(node);
	}
	return 0;
}
/**************************************************************
	Problem: 1181
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:320 ms
	Memory:6300 kb
****************************************************************/


                        