package java_codes.Graph;

public class Weighted_Adjacency_Matrix {

    public static void main(String[] args) {

        int V = 4;

        int[][] graph = new int[V][V];

        graph[0][1] = 10;
        graph[1][0] = 10;

        graph[0][2] = 15;
        graph[2][0] = 15;

        graph[1][3] = 20;
        graph[3][1] = 20;

        graph[2][3] = 30;
        graph[3][2] = 30;

        for(int i = 0; i < V; i++) {

            for(int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }

            System.out.println();
        }
    }
}