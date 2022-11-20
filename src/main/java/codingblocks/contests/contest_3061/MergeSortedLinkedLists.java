package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class MergeSortedLinkedLists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        // run while loop for the # of test cases
        while(tcs-- > 0) {

            // Initializing tmp variables
            int tmp = 0, data = 0;
            Node list1Head = null, list2Head = null, node = null, tmpNode = null;

            // getting size of list1
            int list1Size = sc.nextInt();

            // building list 1
            tmp = list1Size;
            while(tmp > 0) {
                data = sc.nextInt();
                node = new Node(data);

                if(list1Head == null) {
                    list1Head = node;
                } else {
                    tmpNode.next = node;
                }
                tmpNode = node;

                tmp--;
            }

            // getting size of list 2
            int list2Size = sc.nextInt();

            // building list 2
            tmp=list2Size;
            while(tmp > 0) {
                data = sc.nextInt();
                node = new Node(data);

                if(list2Head == null) {
                    list2Head = node;
                } else {
                    tmpNode.next = node;
                }
                tmpNode = node;

                tmp--;
            }

            // Call method to merge two sorted linked list
            Node mergedHead = mergeList(list1Head, list2Head);

            // print the merged linked list
            tmpNode = mergedHead;
            while(tmpNode != null) {

                System.out.print(tmpNode.data + " ");

                tmpNode = tmpNode.next;
            }
        }
    }

    private static Node mergeList(Node list1Ptr, Node list2Ptr) {

        Node mergedHead = new Node();
        Node tmpMergeNode = mergedHead;

        while(list1Ptr != null && list2Ptr != null) {

            // if node 1 node is smaller than node 2 node
            if(list1Ptr.data < list2Ptr.data) {
                tmpMergeNode.next = list1Ptr;
                list1Ptr = list1Ptr.next;

            } else { // if node 2 node is smaller than node 1 node
                tmpMergeNode.next = list2Ptr;
                list2Ptr = list2Ptr.next;
            }
            tmpMergeNode = tmpMergeNode.next;
        }

        // end-case when either one of the two linked list is left
        if (list1Ptr != null) {
            tmpMergeNode.next = list1Ptr;
        } else if(list2Ptr != null) {
            tmpMergeNode.next = list2Ptr;
        }

        return mergedHead.next;


    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
        Node() {}
    }
}
