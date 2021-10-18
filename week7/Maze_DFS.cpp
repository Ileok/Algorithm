#include <stdio.h> 
using namespace std; 

int N, M; 
char Map[101][101];
int Visit[101][101];
int dx[4] = { 1,0,-1,0 }; 
int dy[4] = { 0,1,0,-1 }; 
int Min = 10001; 

void DFS(int x, int y, int depth) { 
    if (x < 0 || y < 0 || x >= N || y >= M) 
    return; 
    
    if (x == N - 1 && y == M - 1) { 
        if (depth < Min) Min = depth; 
        return; 
    } 
    
    for (int i = 0; i < 4; i++) { 
        int Next_x = x + dx[i]; 
        int Next_y = y + dy[i]; 
        if (Visit[Next_x][Next_y] == 0 && Map[Next_x][Next_y] == '1') { 
            Visit[Next_x][Next_y] = 1; 
            
            DFS(Next_x, Next_y, depth + 1); 
            Visit[Next_x][Next_y] = 0; 
        } 
    } 
} 

int main(void) { 
    scanf("%d %d", &N, &M); 

    for (int i = 0; i < N; i++) { 
        scanf("%s", Map[i]); 
    } 

    DFS(0, 0, 1); 
    printf("%d\n", Min); 
}