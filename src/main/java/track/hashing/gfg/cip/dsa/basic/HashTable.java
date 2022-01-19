package track.hashing.gfg.cip.dsa.basic;

public class HashTable<K extends Integer, V extends Integer>{

    private class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            key = key;
            value = value;
        }
    }

    private int size;
    private Node[] hashTable;

    HashTable(int size) {
        size = size;
        hashTable = new Node[size];
    }

    private int hash(K k) {
        return Integer.valueOf(k) % size;
    }

    public V search (K key) {
        int idx = hash(key);
        Node node = hashTable[0];

        do {
            if(node.key == key) return (V) node.value;
        } while (node.next != null);

        return null;
    }

    public void insert(K key, V value) {
        int idx = hash(key);
        Node tmp = hashTable[idx];
        while(tmp.next != null) tmp = tmp.next;
        if(tmp.key == null) {
            tmp.key = key;
            tmp.value = value;
        } else {
            Node newNode = new Node(key, value);
            tmp.next = newNode;
        }
    }

    public void delete(K key) {
        int idx = hash(key);
        Node prev = hashTable[idx], tmp = hashTable[idx], res=hashTable[idx];
        do {
            if(tmp.key == key) {
                res = tmp;
                prev.next = null;
            } else {
                prev = tmp.next;
                tmp = tmp.next;
            }
        } while(tmp.next != null);

//        return res.value != null ? true : false;
    }
}
