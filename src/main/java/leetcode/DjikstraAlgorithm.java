package leetcode;

import java.util.*;

public class DjikstraAlgorithm {
    private Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public DjikstraAlgorithm(int v) {
        for(int i = 0 ; i < v ; i++) {
            map.put(i+1, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int djikstraAlgorithm() {
        Comparator<DjikstraPair> comp = Comparator.comparingInt(e -> e.cost);
        PriorityQueue<DjikstraPair> q = new PriorityQueue(comp);
        Set<Integer> visited = new HashSet<>();
        int minWeight = 0;

        // Initial add a PrimPair
        q.add(new DjikstraPair(1, "1", 0));

        // Loop until min heap is not empty
        while(!q.isEmpty()) {

            // 1. remove the node from min heap
            DjikstraPair pair = q.remove();

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
                    q.add(new DjikstraPair(i, pair.path+i, pair.cost + map.get(pair.destVertex).get(i)));
                }
            }

        }
        return minWeight;
    }

    public class DjikstraPair {
        int destVertex;
        String path;
        int cost;

        DjikstraPair(int destVertex, String path, int cost) {
            this.destVertex = destVertex;
            this.path = path;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "{" +
                    "destVertex=" + destVertex +
                    ", srcPath=" + path +
                    ", cost=" + cost +
                    '}';
        }
    }

    // Main Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        DjikstraAlgorithm djikstraAlgorithm = new DjikstraAlgorithm(vertices);

        for(int i = 0 ; i < edges ; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            djikstraAlgorithm.addEdge(v1, v2, cost);
        }
        System.out.println(djikstraAlgorithm.djikstraAlgorithm());

    }
}
