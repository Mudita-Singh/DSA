package java_codes.Graph;

import java.util.ArrayList;

public class Weighted_Edge_List {

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

    public static void main(String[] args) {

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(1, 3, 20));
        edges.add(new Edge(2, 3, 30));

        for(Edge e : edges) {
            System.out.println( e.dest + " " + e.weight);

        }
    }
}