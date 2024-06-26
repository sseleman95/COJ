#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define MaxVertices 110
#define Infinity 9999
#define White 'w'
#define Grey 'g'
#define Black 'b'

typedef struct gEdge
{
	int child;
	double weight;
	struct gEdge *nextEdge;
} GEdge, *GEdgePtr;

typedef struct gvertex
{
	char colour;
	int id, parent, discover, finish, inDegree;
	double cost;
	GEdgePtr firstEdge;
} GVertex;

typedef struct graph
{
	int numV;
	GVertex vertex[MaxVertices + 1];
} *Graph;

double calculate_distance(double, double, double, double);
GVertex newGVertex(int);
GEdgePtr newGEdge(int, double);
Graph newGraph(int);
void buildGraph(FILE *, Graph G);
void addEdge(int, int, double, Graph);
void siftUp(Graph, int heap[], int, int[]);
void siftDown(Graph, int, int[], int, int, int[]);
void Prim(Graph, int);
void printMST(Graph);

int main()
{
	FILE *in = fopen("input.txt", "r");

	int numVerticies;
	fscanf(in, "%d", &numVerticies);

	Graph G = newGraph(numVerticies);
	buildGraph(in, G);
	Prim(G, 1);
	fclose(in);

	printf("\n\n\t***** COJ : 1480 - Dota Warlock Power *****\n\n");
	system("PAUSE");
	return 0;
}

double calculate_distance(double x1, double y1, double x2, double y2)
{
	double distance_x = x1 - x2;
	double distance_y = y1 - y2;
	return sqrt((distance_x * distance_x) + (distance_y * distance_y));
}

GVertex newGVertex(int name)
{
	GVertex temp;
	temp.id = name;
	temp.firstEdge = NULL;
	return temp;
}

GEdgePtr newGEdge(int c, double w)
{
	GEdgePtr p = (GEdgePtr)malloc(sizeof(GEdge));
	p->child = c;
	p->weight = w;
	p->nextEdge = NULL;
	return p;
}

Graph newGraph(int n)
{
	if (n > MaxVertices)
	{
		printf("\n Too big Only %d vertices's allowed. \n", MaxVertices);
		system("pause");
		exit(1);
	}
	Graph p = (Graph)malloc(sizeof(struct graph));
	p->numV = n;
	return p;
}

void buildGraph(FILE *in, Graph G)
{
	int j, k;
	double xy[MaxVertices][2];

	for (j = 1; j <= G->numV; j++)
		for (k = 1; k <= G->numV; k++)
		{
			if (j == 1)
			{
				G->vertex[k] = newGVertex(0);
				G->vertex[k].id = k;
				G->vertex[k].cost = Infinity;
				G->vertex[k].parent = 0;
				G->vertex[k].colour = White;

				fscanf(in, "%lf %lf", &xy[k][0], &xy[k][1]);
			}
			if (j != k)
				addEdge(j, k, calculate_distance(xy[j][0], xy[j][1], xy[k][0], xy[k][1]), G);
		}
}

void addEdge(int X, int Y, double weight, Graph G)
{
	int j, k;
	for (j = 1; j <= G->numV; j++)
		if ((X == G->vertex[j].id))
			break;

	for (k = 1; k <= G->numV; k++)
		if ((Y == G->vertex[k].id))
			break;

	if (j > G->numV || k > G->numV)
	{
		printf("No Such edge: %d -> %d\n", X, Y);
		system("pause");
		exit(1);
	}

	GEdgePtr ep = newGEdge(k, weight);
	GEdgePtr prev, curr;
	prev = curr = G->vertex[j].firstEdge;
	while (curr != NULL && (Y > G->vertex[curr->child].id))
	{
		prev = curr;
		curr = curr->nextEdge;
	}
	if (prev == curr)
	{
		ep->nextEdge = G->vertex[j].firstEdge;
		G->vertex[j].firstEdge = ep;
	}
	else
	{
		ep->nextEdge = curr;
		prev->nextEdge = ep;
	}
}

void siftUp(Graph G, int heap[], int n, int heapLoc[])
{
	int siftItem = heap[n];
	int child = n;
	int parent = child / 2;
	while (parent > 0)
	{
		if (G->vertex[siftItem].cost >= G->vertex[heap[parent]].cost)
			break;
		heap[child] = heap[parent];
		heapLoc[heap[parent]] = child;
		child = parent;
		parent = child / 2;
	}
	heap[child] = siftItem;
	heapLoc[siftItem] = child;
}

void siftDown(Graph G, int key, int heap[], int root, int last, int heapLoc[])
{
	int smaller = 2 * root;
	while (smaller <= last)
	{
		if (smaller < last)
			if (G->vertex[heap[smaller + 1]].cost < G->vertex[heap[smaller]].cost)
				smaller++;
		if (G->vertex[key].cost <= G->vertex[heap[smaller]].cost)
			break;
		heap[root] = heap[smaller];
		heapLoc[heap[smaller]] = root;
		root = smaller;
		smaller = 2 * root;
	}
	heap[root] = key;
	heapLoc[key] = root;
}

void Prim(Graph G, int s)
{
	int j, heap[MaxVertices + 1], heapLoc[MaxVertices + 1];
	G->vertex[s].cost = 0;
	for (j = 1; j <= G->numV; j++)
		heap[j] = heapLoc[j] = j;
	heap[1] = s;
	heap[s] = 1;
	heapLoc[s] = 1;
	heapLoc[1] = s;
	int heapSize = G->numV;
	while (heapSize > 0)
	{
		int u = heap[1];
		if (G->vertex[u].cost == Infinity)
			break;
		G->vertex[u].colour = Black;
		siftDown(G, heap[heapSize], heap, 1, heapSize - 1, heapLoc);
		GEdgePtr p = G->vertex[u].firstEdge;
		while (p != NULL)
		{
			if (G->vertex[p->child].colour == White && p->weight < G->vertex[p->child].cost)
			{
				G->vertex[p->child].cost = p->weight;
				G->vertex[p->child].parent = u;
				siftUp(G, heap, heapLoc[p->child], heapLoc);
			}
			p = p->nextEdge;
		}
		--heapSize;
	}
	printMST(G);
}

void printMST(Graph G)
{
	int j;
	double costMST = 0;
	for (j = 2; j <= G->numV; j++)
		costMST += G->vertex[j].cost;

	FILE *out = fopen("output.txt", "w");
	fprintf(out, "The damage received by Warlock's enemies : %.2f\n", costMST * 5);
	fclose(out);
}
