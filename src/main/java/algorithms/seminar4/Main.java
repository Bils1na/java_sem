package algorithms.seminar4;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> nodes = new HashMap<>();
        nodes.put(1, "str");
        nodes.put(2, "str");
        nodes.put(2, "str");
        nodes.put(2, "str");
        nodes.put(3, "str");
        System.out.println(nodes.get(0));
        System.out.println(nodes.get(2));
        System.out.println(nodes.get(3));
    }
}