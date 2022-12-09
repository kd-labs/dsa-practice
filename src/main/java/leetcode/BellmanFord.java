package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BellmanFord {

    private Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    BellmanFord(int v) {
        for(int i = 1 ; i <= v ; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost); // v1 map get karna then put v2 and the cost to reach v2 via v1
    }

    public List<Edge> getEdges() {
        List<Edge> edges = new ArrayList<>();

        for(int v1 : map.keySet()) {
            for(int v2 : map.get(v1).keySet()) {
                edges.add(new Edge(v1, v2, map.get(v1).get(v2)));
            }
        }

        return edges;
    }

    public void bellmanFordAlgorithm() {

        // create array of size v + 1 vertices
        int[] arr = new int[map.size()+1];

        // initializiing the arr to set vertices to infinity or large value except for vertex 1
        arr[1] = 0;
        for(int i = 2 ; i < arr.length ; i++) {
            arr[i] = 100000000;
        }

        // Relaxing Edges v-1 times
        List<Edge> edges = getEdges();
        for(int v = 0 ; v < map.size()-1 ; v++) {
            for(Edge edge : edges) {
                // old cost = get the old cost from arr at index = edge.v2 where v2 is the dest vertex
                int oldCost = arr[edge.v2];

                // new cost = cost to reach edge.v1 from arr + edge.cost (cost to reach v2 via v1)
                int newCost = arr[edge.v1] + edge.cost;

                arr[edge.v2] = Math.min(oldCost, newCost);
            }
        }

        // Priniting the distance arr
        for(int i = 1 ; i < arr.length ; i++) {
            System.out.println(String.format("cost to reach vertex %d = %d", i, arr[i]));
        }

    }

    /*
        Slight modified version of BellmanFord that returns if graph contains a negative edge
        cycle
     */
    public boolean isNegativeEdgeCyclePresent() {

        // create array of size v + 1 vertices
        int[] arr = new int[map.size()+1];

        // initializiing the arr to set vertices to infinity or large value except for vertex 1
        arr[1] = 0;
        for(int i = 2 ; i < arr.length ; i++) {
            arr[i] = 100000000;
        }

        // Relaxing Edges v times
        List<Edge> edges = getEdges();
        for(int v = 0 ; v < map.size() ; v++) {
            for(Edge edge : edges) {
                // old cost = get the old cost from arr at index = edge.v2 where v2 is the dest vertex
                int oldCost = arr[edge.v2];

                // new cost = cost to reach edge.v1 from arr + edge.cost (cost to reach v2 via v1)
                int newCost = arr[edge.v1] + edge.cost;

                if(newCost < oldCost) return true;
            }
        }
        return false;
    }

    public class Edge {
        int v1;
        int v2;
        int cost;

        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "{" +
                    "v1=" + v1 +
                    ", v2=" + v2 +
                    ", cost=" + cost +
                    '}';
        }
    }

    // Driver Main Code
    public static void main(String[] args) {
        BellmanFord bellmanFord = new BellmanFord(5);
        bellmanFord.addEdge(1, 2, 8);
        bellmanFord.addEdge(2, 5, 2);
        bellmanFord.addEdge(5, 2, 1);
        bellmanFord.addEdge(4, 5, 4);
        bellmanFord.addEdge(3, 4, -3);
        bellmanFord.addEdge(1, 3, 4);
        bellmanFord.addEdge(1, 4, 5);

        // Calling the bellman ford algorithm to get the shortest path to each vertex
        bellmanFord.bellmanFordAlgorithm();


        // Bellman Ford algorithm to check if graph contains a -ve edge cycle
        BellmanFord isCyclePresent = new BellmanFord(5);
        isCyclePresent.addEdge(1, 2, 8);
        isCyclePresent.addEdge(2, 5, -2);
        isCyclePresent.addEdge(5, 2, 1);
        isCyclePresent.addEdge(4, 5, 4);
        isCyclePresent.addEdge(3, 4, -3);
        isCyclePresent.addEdge(1, 3, 4);
        isCyclePresent.addEdge(1, 4, 5);
        System.out.println(String.format("Does the graph contain a -ve edge cycle : %b", isCyclePresent.isNegativeEdgeCyclePresent()));
    }

}
