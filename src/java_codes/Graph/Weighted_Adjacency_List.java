package java_codes.Graph;

import java.util.ArrayList;

public class Weighted_Adjacency_List {

    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 20));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 30));

        graph[3].add(new Edge(3, 1, 20));
        graph[3].add(new Edge(3, 2, 30));
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        for(Edge e : graph[0]) {
            System.out.println( e.dest + " " + e.weight);

        }
    }
}