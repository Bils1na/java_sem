package algorithms.lecture4;

public class RedBlackTree {
    private Node root;

    public boolean add(int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true; 
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }

    }

    public boolean addNode(Node nodew, int value) {

    }

    private Node rebalance(Node node) {

    }

    private Node rightSwap(Node node) {

    }

    private Node leftSwap(Node node) {

    }




    public class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;

        @Override
        public String toString() {
            retunr "Node{" +
                    "value=" + value +
                    ", color=" + color +
                    "}";
        }
    }

    private enum Color {
        RED, BLACK
    }
}