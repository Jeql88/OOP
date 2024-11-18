#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_VERTEX 6
#define INFINITY 100

typedef char vertex; //A,B,C,D,E
typedef enum {True = 1, False = 0} Boolean;

typedef struct {
    vertex vertexName;
    int weight;
} vertexType;

typedef struct node {
    vertexType vertexInfo;
    struct node* link;
} *vertexPtr;

typedef struct {
    vertexPtr list[MAX_VERTEX];
    int edgeCount;
} weightedGraph;

typedef struct {
    vertex matrix[MAX_VERTEX][MAX_VERTEX];
    int edgeCount;
} matrixGraph;


void addEdge(weightedGraph* a, vertex from, vertex to, int weight);
void displayAdjList(weightedGraph a);
void bfsList(weightedGraph a, vertex start);
void dfsList(weightedGraph a, vertex start, Boolean arr[]);
void djikstrasAlgo(weightedGraph a, vertex start, vertex prevVertex[MAX_VERTEX], int distanceFromStart[MAX_VERTEX]);
int main(){
    weightedGraph a;
    a.edgeCount = 0;
    for (int i = 0; i < MAX_VERTEX; ++i){
        a.list[i] = NULL;
    }
    addEdge(&a, 'A', 'B', 8);
    addEdge(&a, 'B', 'A', 3);
    addEdge(&a, 'D', 'A', 3);
    addEdge(&a, 'D', 'A', 2);
    addEdge(&a, 'D', 'B', 1);
    addEdge(&a, 'B', 'D', 3);
    addEdge(&a, 'C', 'D', 3);
    addEdge(&a, 'D', 'C', 4);
    addEdge(&a, 'E', 'B', 4);
    addEdge(&a, 'B', 'E', 4);
    addEdge(&a, 'B', 'C', 3);
    addEdge(&a, 'C', 'B', 3);
    addEdge(&a, 'E', 'C', 3);
    addEdge(&a, 'C', 'E', 3);
    displayAdjList(a);
    
    
    
    Boolean hasVisited[MAX_VERTEX] = {False};
    dfsList(a,'A',hasVisited);
    
    vertex prevVertex[MAX_VERTEX];
    int distanceFromStart[MAX_VERTEX];
    
    for (int i = 0; i < MAX_VERTEX; ++i){
        prevVertex[i] = NULL;
        distanceFromStart[i] = 0;
    }
    djikstrasAlgo(a,'A',prevVertex,distanceFromStart);
    
    return 0;
}
void djikstrasAlgo(weightedGraph a, vertex start, vertex prevVertex[MAX_VERTEX], int distanceFromStart[MAX_VERTEX]){
    Boolean hasVisited[MAX_VERTEX] = {False};
    hasVisited[start-'A'] = 1;
    int current;
    current = start-'A';
  
    for (int i = 0; i < MAX_VERTEX; ++i){
        distanceFromStart[i] = INFINITY;
    }
     distanceFromStart[current] = 0;
    prevVertex[current] = NULL;
    while (1){
        int go_on = 0;
        for (int i = 0; i < MAX_VERTEX; ++i){
            if (hasVisited[i] == 0){
                go_on = 1;
            }
        }
        if (go_on == 0){
            break;
        } else {
            for (vertexPtr trav = a.list[current]; trav != NULL; trav = trav->link){
                if (a.list[current]->vertexInfo.weight + trav->vertexInfo.weight < distanceFromStart[trav->vertexInfo.vertexName-'A']){
                    distanceFromStart[trav->vertexInfo.vertexName-'A'] = a.list[current]->vertexInfo.weight + trav->vertexInfo.weight;
                    prevVertex[trav->vertexInfo.vertexName-'A'] = current + 'A';
                }
            }
            int min = INFINITY;
            for (int i = 0; i < MAX_VERTEX; ++i){
                if (hasVisited[i] == 0 && distanceFromStart[i] < min){
                    min = distanceFromStart[i];
                    current = i;
                }
            }
        }
    }
}
void dfsList(weightedGraph a, vertex start, Boolean hasVisited[]){
    hasVisited[start-'A'] = True;
    printf("%c ",start);
    vertexPtr trav;
    for (trav = a.list[start-'A']; trav != NULL; trav = trav->link){
        if (hasVisited[trav->vertexInfo.vertexName-'A'] == False){
            dfsList(a,trav->vertexInfo.vertexName,hasVisited);
        }
    }
    
}
void addEdge(weightedGraph* a, vertex from, vertex to, int weight){
    vertexPtr temp = malloc(sizeof(struct node));
    temp->vertexInfo.vertexName = to;
    temp->vertexInfo.weight = weight;
    vertexPtr* trav;
    for (trav = &(a->list[from-'A']); *trav != NULL; trav = &(*trav)->link){
        if ((*trav)->vertexInfo.vertexName > to){
            break;
        }
    }
    if (*trav != NULL && (*trav)->vertexInfo.vertexName == to){
        (*trav)->vertexInfo.weight = weight;
    } else {
        vertexPtr temp = malloc(sizeof(struct node));
        temp->vertexInfo.vertexName = to;
        temp->vertexInfo.weight = weight;
        temp->link = *trav;
        *trav = temp;
        a->edgeCount++;
    }
}

void displayAdjList(weightedGraph a){
    vertexPtr trav;
    for (int i = 0; i < MAX_VERTEX; ++i){
        printf("\n%c: ",i + 'A');
        for (trav = a.list[i]; trav != NULL; trav = trav->link){
            printf("-> %c (%d) ",trav->vertexInfo.vertexName, trav->vertexInfo.weight);
        }
    }
}