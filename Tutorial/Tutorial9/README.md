# Tutorial 9 (Graph)  

## Question 1:
Write an adjacency matrix and an adjacency list for the following graph.    
!["Image](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial9/Src/Screenshot%202024-05-13%20183341.png)   

## Solution (Q1):
```
     A  B  C  D  E  F  G  H  I  
  ┌─────────────────────────────┐
A │  0  0  1  1  0  0  0  0  0  │
B │  0  0  0  1  0  0  0  0  0  │
C │  0  0  0  0  1  1  0  0  0  │
D │  0  0  0  0  1  0  0  0  0  │
E │  0  0  0  0  0  0  1  0  0  │
F │  0  0  0  0  0  0  0  1  0  │
G │  0  0  0  0  0  0  0  1  0  │
H │  0  0  0  0  0  0  0  0  1  │
I │  0  0  0  0  0  0  0  0  0  │
  └─────────────────────────────┘
```

## Question 2:
Represent the graph in question 1 using a 2 dimensional array. You use the adjacency matrix 
or the adjacency list for this purpose?   

## Solution (Q2):
```java
int[][] adjacencyMatrix = {
    { 0, 0, 1, 1, 0, 0, 0, 0, 0 }, // A
    { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // B
    { 0, 0, 0, 0, 1, 1, 0, 0, 0 }, // C
    { 0, 0, 0, 0, 1, 0, 0, 0, 0 }, // D
    { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // E
    { 0, 0, 0, 0, 0, 0, 0, 1, 0 }, // F
    { 0, 0, 0, 0, 0, 0, 0, 1, 0 }, // G
    { 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // H
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 }   // I
};
```

## Question 3:
Write code to create the graph using linked-list representation. You use the adjacency matrix
or the adjacency list for this purpose?  

## Solution (Q3):
```java
WeightedGraph<String, Integer> graph = new WeightedGraph<>();
String[] vertex = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
for (String i : vertex)
    graph.addVertex(i);

graph.addEdge("A", "C", 1);
graph.addEdge("A", "D", 1);
graph.addEdge("B", "D", 1);
graph.addEdge("C", "E", 1);
graph.addEdge("C", "F", 1);
graph.addEdge("D", "E", 1);
graph.addEdge("E", "G", 1);
graph.addEdge("F", "H", 1);
graph.addEdge("G", "H", 1);
graph.addEdge("H", "I", 1);
```