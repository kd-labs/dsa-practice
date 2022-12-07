package leetcode;

import java.util.*;

/*
    Kruskal Algorithm -> Given a weighted graph, create a Minimum Spanning Tree out of that graph
 */
public class KruskalAlgorithm {

    private Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public KruskalAlgorithm(int v) {
        for(int i = 0 ; i < v ; i++) {
            map.put(i+1, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public List<Edge> getEdges() {

        List<Edge> edges = new ArrayList<>();

        for(Map.Entry<Integer, Map<Integer, Integer>> entry : map.entrySet()) {
            for(Map.Entry<Integer, Integer> innerEntry : entry.getValue().entrySet()) {
                edges.add(new Edge(entry.getKey(), innerEntry.getKey(), innerEntry.getValue()));
            }
        }

        return edges;
    }

    public int kruskalAlgorith() {

        int minWeight = 0;

        DisjointSet dsu = new DisjointSet();

        // Step 1 : Create disjoint sets equal to the number of vertices in the graph
        for(int i : map.keySet()) {
            dsu .createSet(i);
        }

        // Step 2: Get all edges of the graph
        List<Edge> edges = this.getEdges();
        Collections.sort(edges, Comparator.comparingInt(e -> e.cost));

        // In Kruskal algorithm, we start off by taking the smallest cost edge
        for(Edge edge : edges) {
            int v1 = edge.v1;
            int v2 = edge.v2;

            // using disjoint set concept, find the representative elements of the verices of minimum cost edge
            int re1 = dsu.find(v1);
            int re2 = dsu.find(v2);

            if(re1 == re2) { // when both vertices belong to the same set i.e. having same representative element then we
                // do nothing
            } else { // perform union/merge using dsu with higher rank at the top
                minWeight += edge.cost;
                System.out.println(edge);
                dsu.union(re1, re2);
            }
        }

        return minWeight;
    }

    public class Edge {
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "v1=" + v1 +
                    ", v2=" + v2 +
                    ", cost=" + cost +
                    '}';
        }
    }

    // Main Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm(vertices);

        for(int i = 0 ; i < edges ; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            kruskalAlgorithm.addEdge(v1, v2, cost);
        }
        System.out.println(kruskalAlgorithm.kruskalAlgorith());

    }

}
