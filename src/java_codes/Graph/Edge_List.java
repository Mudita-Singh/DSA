package java_codes.Graph;

import java.util.ArrayList;

public class Edge_List{

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1));
        edges.add(new Edge(0, 2));
        edges.add(new Edge(1, 2));

        for(Edge e : edges) {
            System.out.println(e.src + " " + e.dest);
        }
    }
}