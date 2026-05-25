package java_codes.Graph;

import java.util.ArrayList;

public class Adjacency_Matrix {

    public static void main(String[] args) {

        int V = 3;

        int[][] graph = new int[V][V];

        graph[0][1] = 1;
        graph[1][0] = 1;

        graph[0][2] = 1;
        graph[2][0] = 1;

        graph[1][2] = 1;
        graph[2][1] = 1;

        for(int i = 0; i < V; i++) {

            for(int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }

            System.out.println();
        }
    }
}