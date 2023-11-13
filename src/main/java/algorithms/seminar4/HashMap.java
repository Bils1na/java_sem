package algorithms.seminar4;

public class HashMap<K, V> {
    private int capacity = 16;
    private Node<K, V>[] nodes = new Node[capacity];
    public int size = 0;

    public void put(K key, V value) {

        Node<K, V> node = new Node<>(key, value);
        int index = node.getHash() % capacity;
        if (nodes[index] == null) {
            nodes[index] = node;
            size++;
            return;
        } else {
            for (Node<K, V> i = nodes[index]; i != null; i = i.next) {
                if (i.next == null) {
                    i.next = node;
                    size++;
                    return;
                }
                if (i.key == key) {
                    i.value = value;
                    return;
                }
            }
        }
    }

    public V get(K key) {
        for (Node<K, V> node : nodes) {
            if (node != null) {
                for (Node<K, V> i = node; i != null; i = i.next) {
                    if (i.getKey() == key) {
                        return i.value;

                    }
                }
            }
        }
        return null;
    }
    

    private class Node<K, V> {
        private final K key;
        private V value;
        private final int hash;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode() ^ value.hashCode();
        }

        public V getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }

        public int getHash() {
            return hash;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
}