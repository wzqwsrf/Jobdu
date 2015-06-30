

// 题目1482：玛雅人的密码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1482
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17416147
 */
#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <queue>
#include <map>

using namespace std;

map<string, int> visitedMap;
map<string, int>::iterator it;
int n;

struct Node {
    char input[14];
    int step;
};
string str;
Node node;

void swapArr(char *input, int a, int b) {
    if (input[a] == input[b]) {
        return;
    }
    char temp = input[a];
    input[a] = input[b];
    input[b] = temp;
}

bool judgeIs2012(char *input) {
    for (int i = 0; i < n - 3; i++) {
        if (input[i] == '2' && input[i + 1] == '0'
                && input[i + 2] == '1' && input[i + 3] == '2') {
            return true;
        }
    }
    return false;
}

int bfs() {
    queue<Node> q;
    while (!q.empty()) q.pop();
    q.push(node);
    while (!q.empty()) {
        node = q.front();
        q.pop();
        if (judgeIs2012(node.input)) {
            return node.step;
        }
        str = node.input;
        it = visitedMap.find(node.input);
        if (it == visitedMap.end() || it->second == 0) {
            visitedMap.insert(make_pair(str, 1));
        }
        char *newInput;
        newInput = new char[str.size()];
        for (int i = 0; i < n - 1; i++) {
            strcpy(newInput, node.input);
            swapArr(newInput, i, i + 1);
            str = newInput;
            it = visitedMap.find(str);
            if (it == visitedMap.end() || it->second == 0) {
                visitedMap.insert(make_pair(str, 1));
                Node temp;
                temp.step = node.step + 1;
                strcpy(temp.input, newInput);
                q.push(temp);
            }
        }
    }
    return -1;
}

int main() {
    while (scanf("%d", &n) != EOF) {
        char input[14];
        scanf("%s", input);
        if (n < 4) {
            printf("-1\n");
            continue;
        }
        visitedMap.clear();
        node.step = 0;
        strcpy(node.input, input);
        printf("%d\n", bfs());
    }

    return 0;
}

/**************************************************************
Problem: 1482
User: wangzhenqing
Language: C++
Result: Accepted
Time:30 ms
Memory:1324 kb
****************************************************************/


                        

