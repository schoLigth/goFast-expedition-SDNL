package ProjekSDNL;

import java.util.*;

// Kelas untuk graph
public class Graphh {

    private int vertices;
    private List<Edge>[] adjacencyList;

    public Graphh(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList[source].add(edge);
    }

    public ShortestPathResult getShortestPath(int source, int destination) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.distance));
        pq.offer(new Node(source, 0));

        int[] previous = new int[vertices];
        Arrays.fill(previous, -1);

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;

            if (currentNode.distance > distance[currentVertex]) {
                continue;
            }

            for (Edge edge : adjacencyList[currentVertex]) {
                int adjacentVertex = edge.destination;
                int weight = edge.weight;
                int totalDistance = distance[currentVertex] + weight;

                if (totalDistance < distance[adjacentVertex]) {
                    distance[adjacentVertex] = totalDistance;
                    pq.offer(new Node(adjacentVertex, totalDistance));
                    previous[adjacentVertex] = currentVertex;
                }
            }
        }

        // Retrieve the shortest path by backtracking from the destination vertex
        List<Integer> shortestPath = new ArrayList<>();
        int current = destination;
        while (current != -1) {
            shortestPath.add(current);
            current = previous[current];
        }
        Collections.reverse(shortestPath);

        int shortestPathCost = distance[destination];
        return new ShortestPathResult(shortestPath, shortestPathCost);
    }

    // Kelas untuk mencari rute terpendek beserta jalur dan biayanya
    public class ShortestPathResult {

        private List<Integer> path;
        private int cost;

        public ShortestPathResult() {

        }

        public ShortestPathResult(List<Integer> path, int cost) {
            this.path = path;
            this.cost = cost;
        }

        public List<Integer> getPath() {
            return path;
        }

        public int getCost() {
            return cost;
        }
    }

    // Kelas untuk edge digunakan sebagai titik awal dan titik tujuan dengan biaya
    private static class Edge {

        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    // Kelas untuk melihat vertex baik yg akan dilalui maupun yg sudah dilalui nantinya
    private static class Node {

        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}
