import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;


    public Node(int data){
        data = data;
    }

    public Node(int data, Node next){
        data = data;
        next = next;
    }


    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
}
