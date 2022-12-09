package leetcode;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {

        /*
                Disjoint Set Concept Operations :
                        1. Create Disjoint set node
                        2. Find the representative element of an element of disjoint set
                        3. merge two disjoint sets when their representative elements are known
         */

        public class Node { // To represent elements of disjoint set and their representing element
                int val;
                int rank;
                Node parent;
        }

        private Map<Integer, Node> map = new HashMap<>();

        public void createSet(int v) {

                Node node = new Node();
                node.val = v;
                node.rank = 0;
                node.parent = node;

                map.put(v, node);

        }

        /*
                returns the representative element
         */
        public int find(int vertex) {
                Node node = map.get(vertex);
                Node re = find(node.parent);
                return re.val;
        }

        /*
                recursive method to find the representative element node
         */
        private Node find(Node node) {

                // Base Case
                // if node's parent is the same node, then we have reached the top of the tree and the node is representative element
                if(node == node.parent) return node;

                Node re = find(node.parent);

                node.parent = re; // path comprssion ; to reduce the TC to find the representative element of a vertex from O(logn) to O(1)
                return re;

        }

        public void union(int v1, int v2) {

                // get the representative element of v1
                Node re1 = find(map.get(v1));

                // get the representative element of v2
                Node re2 = find(map.get(v2));

                if(re1.rank == re2.rank) {
                       re2.parent = re1;
                       re1.rank = re1.rank + 1;
                } else if(re1.rank > re2.rank) { // union/merge with greater rank at the top of the tree
                        re2.parent = re1;
                } else {
                        re1.parent = re2;
                }

        }

}
