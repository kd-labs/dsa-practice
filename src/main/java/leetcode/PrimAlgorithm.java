package leetcode;

import java.util.*;

public class PrimAlgorithm {
    private Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public PrimAlgorithm(int v) {
        for(int i = 0 ; i < v ; i++) {
            map.put(i+1, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int primsAlgorithm() {
        Comparator<PrimPair> comp = Comparator.comparingInt(e -> e.cost);
        PriorityQueue<PrimPair> q = new PriorityQueue(comp);
        Set<Integer> visited = new HashSet<>();
        int minWeight = 0;

        // Initial add a PrimPair
        q.add(new PrimPair(1, 1, 0));
        while(!q.isEmpty()) {

            // 1. remove the node from min heap
            PrimPair pair = q.remove();

            // 2. Ignore if pair destVertex already visited
            if(visited.contains(pair.destVertex)) continue;

            // 3. Mark the pair dest vertex as visited
            visited.add(pair.destVertex);

            // 4. print the pair
            System.out.println(pair);
            minWeight += pair.cost;

            // 5. add the neighbours of pair's destVertex which are not visited into the min heap
            for(Integer i : map.get(pair.destVertex).keySet()) {
                if(!visited.contains(i)) {
                    q.add(new PrimPair(i, pair.destVertex, map.get(pair.destVertex).get(i)));
                }
            }

        }
        return minWeight;
    }

    public class PrimPair {
        int destVertex;
        int srcVertex;
        int cost;

        PrimPair(int destVertex, int srcVertex, int cost) {
            this.destVertex = destVertex;
            this.srcVertex = srcVertex;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "{" +
                    "destVertex=" + destVertex +
                    ", srcVertex=" + srcVertex +
                    ", cost=" + cost +
                    '}';
        }
    }

    // Main Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        PrimAlgorithm primAlgorithm = new PrimAlgorithm(vertices);

        for(int i = 0 ; i < edges ; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            primAlgorithm.addEdge(v1, v2, cost);
        }
        System.out.println(primAlgorithm.primsAlgorithm());

    }
}
