# Assignment_16
A news paper delivery boy every day drops news paper in a society having many lanes and
houses. Represent this as a graph using adjacency matrix or adjacency list. Perform Depth
First traversal and Breadth First traversal.

## Algorithms
I.Create graph using adjacency list :
1. Accept number of vertices (n)
2. Initialize head[ ] with NULL.
3. Read number of edges
4. for no. of edges do the following:
1. Accept an edge(u,v)
2. insert(u,v);
3. insert(v,u); // If it is undirected graph.
Insert node y in list of x:
1. Prepare new node y with data v .
2. If vertex of x field is empty then head[x]=y
3. Otherwise atttach node at end of linked list of x.
II. Create graph using adjacency matrix :
1. Read number of vertices
2. Read number of edges
3. Repeat till all edges are not accepted
1. Read two endpoint of edges
2. Mark edge(u,v) in matrix by 1 i.e. Mat[u][v]=1
3. Mark edge(v,u) in matrix by 1 i.e. Mat[u][v]=1 // If it is undirected graph.
III. Breadth First Search algorithm:
1. Make all entries in VISITED[ ] to 0
2. Accept starting vertex v
3. Insert vertex v in queue
4. Mark that vertex as visited
5. Repeat following steps till queue is not empty
1. Pop element from queue and store in node v
2. Insert all unvisited, adjacent vertices of v into queue
3. Mark vertex v as visited

IV: Recursive DFS
1. Mark VISITED[ST] to 1
2. Store head[st] in node p
3. Display st
4. Repeat till p is not null
5. Store vertex data in w
6. If (VISITED[w]=0 )
Call recursive function
RDFS(w )
7. RETURN
V: Non recursive DFS traversal:
1. Mark all nodes as unvisited
2. Accept start node
3. Push vertex data onto stack
4. While stack is not empty
1. Get an unvisited vertex adjacent to stack top, V
2. If it is not present
1. Pop the element
3. Else
1. Mark V as visited
2. Display V
3. Push V on the stack

## Test Cases:

1. Input graph is connected graph.
2. Input graph is un connected graph.
3. Input graph is directed graph.
4. Input graph is undirected graph.
5. DFS traversal form inputted starting vertex does not include all the vertices of graph.
6. DFS traversal form inputted starting vertex includes all the vertices of graph.
7. BFS traversal form inputted starting vertex does not include all the vertices of graph.
8. BFS traversal form inputted starting vertex includes all the vertices of graph.