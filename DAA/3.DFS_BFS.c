#include<stdio.h>
#include<stdlib.h>
#define MAX 10

int graph[MAX][MAX];
int visited[MAX];
int n;

void DFS(int v){
    int i;
    printf("%d ", v);
    visited[v] = 1;

    for (int i = 0; i < n; i++)
    {
        if (graph[v][i] == 1 && visited[i] == 0)
        {
            DFS(i);
        }

    }

}

void BFS(int start){
    int queue[MAX], front = -1, rear = -1;
    int i;
    queue[++rear] = start;
    visited[start] = 1;

    while (front!=rear)
    {
        int v = queue[++front];
        printf("%d", v);

        for (int i = 0; i < n; i++)
        {
            if (graph[v][i] == 1 && visited[i] == 0)
            {
                queue[++rear] = i;
                visited[i] = 1;
            }

        }

    }

}

int main(){
    int i, j, start;
    printf("Enter number of Vertices: ");
    scanf("%d", &n);

    printf("Enter Adjacency Matrix: \n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &graph[i][j]);
        }
    }

    printf("Enter starting Vertex: ");
    scanf("%d", &start);

    for (int i = 0; i < n; i++)
    {
        visited[i] = 0;
    }

    printf("DFS TRAVERSAL: ");
    DFS(start);


    for (int i = 0; i < n; i++)
    {
        visited[i] = 0;
    }

    printf("\n BFS TRAVERSAL: ");
    BFS(start);

    return 0;


}
