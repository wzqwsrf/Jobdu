
#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<vector>
using namespace std;
int n,i;
struct Node{
    int data;
    Node *left;
    Node *right;
};
 
Node *createTree(){
    int data;
    scanf("%d",&data);
    if(data == 0){
		return NULL;
	}
    Node *node = new Node;
    node->data =data;
    node->left = createTree();
    node->right = createTree();
    return node;
}
bool getPath(int m,Node *root,vector<int> &p){
    if(root==NULL){
		return false;
	}
    p.push_back(root->data);
    if(root->data != m){
        if(getPath(m,root->left,p)||getPath(m,root->right,p)){
		   return true;
		}else{
           p.pop_back();
           return false;
        }
    }else{
		return true;
	}
}
int main(){

    scanf("%d",&n);
    while(n > 0){
		n--;
        Node *root = createTree();
        int m1,m2;
        scanf("%d%d",&m1,&m2);
        vector<int> p1,p2;
        if(getPath(m1,root,p1)&&getPath(m2,root,p2)){
			int len1 = p1.size();
			int len2 = p2.size();
			int len = len1 > len2 ? len2 : len1;
			i = 0;
            while(i < len){
				if(p1[i] != p2[i]){
					break;
				}
				i++;
			}
            printf("%d\n",p1[i-1]);
        }else{
			printf("My God\n");
		}
    }
    return 0;
}
/**************************************************************
	Problem: 1509
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:130 ms
	Memory:5348 kb
****************************************************************/


                        