import java.util.Iterator;
import java.util.NoSuchElementException;

public class NodeIterator implements Iterator<Node> {
    Node data;
    public NodeIterator(Node data){
        data = data;
    }

    @Override
    public boolean hasNext(){
        if(this.data.next!=null){
            return true;
        }
        return false;
    }


    @Override
    public Node next(){
        if(hasNext()==true){
            return this.data.next;
        }
        throw new NoSuchElementException();
    }
}
