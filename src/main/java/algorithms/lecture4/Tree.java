//package lecture4.algorithms;
//
//public class Tree {
//    Node root;
//
//
//    public boolean exist(int value) {
//        if (root != null) {
//            Node node = find(root, value);
//            if (node != null) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Обход в глубину
//    //startregion
//    // private Node find(Node node, int value) {
//    //     if (node.value == value) {
//    //         return node;
//    //     } else {
//    //         for (Node child : node.children) {
//    //             Node result = find(child, value);
//    //             if (resilt != null) {
//    //                 return result;
//    //             }
//    //         }
//    //     }
//    //     return null;
//    // }
//    // endregion
//
//    // Обход в ширину
//    // startregion
//    private Node find(int value) {
//        List<Node> line = new ArrayList<>();
//        line.add(root);
//        while (line.size() > 0) {
//            List<Node> nextLine = new ArrayList<>();
//            for (Node node : line) {
//                if (node.value == value) {
//                    return node;
//                }
//                nextLine.addAll(node.children);
//            }
//            line = nextLine;
//        }
//        return null;
//    }
//    // endregion
//
//    public class Node {
//        int value;
//        List<Node> children;
//    }
//}