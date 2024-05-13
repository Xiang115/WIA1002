package Lab.Lab9;

public class Graph<T extends Comparable<T>, N extends Comparable<N>> extends WeightedGraph<T, N> {
    // Q1
    public boolean addUndirectedEdge(T source, T destination, N weight) {
        return this.addEdge(source, destination, weight) && this.addEdge(destination, source, weight);
    }

    // Q2
    public boolean removeEdge(T source, T destination) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                Vertex<T, N> destinationVertex = head;
                while (destinationVertex != null) {
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        break;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
                Edge<T, N> currentEdge = sourceVertex.firstEdge;
                Edge<T, N> prevEdge = null;
                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                        if (currentEdge == sourceVertex.firstEdge) {
                            sourceVertex.firstEdge = currentEdge.nextEdge;
                        } else {
                            prevEdge.nextEdge = currentEdge.nextEdge;
                        }
                        sourceVertex.outdeg--;
                        destinationVertex.indeg--;
                        return true;
                    }
                    prevEdge = currentEdge;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
}
