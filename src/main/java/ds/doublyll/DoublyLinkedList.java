package ds.doublyll;

public class DoublyLinkedList <E> {

    private Node<E> first;

    private Node<E> last;

    public Node<E> getFirst() {
        return first;
    }

    public void setFirst(Node<E> first) {
        this.first = first;
    }

    public Node<E> getLast() {
        return last;
    }

    public void setLast(Node<E> last) {
        this.last = last;
    }

    public void insertFirst(E data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            last = newNode;
        }
        else {
            first.setPrevious(newNode);
             }
        newNode.setNext(first);
        first = newNode;
    }


    public String print()
    {
        StringBuilder sb = new StringBuilder();
        Node currentNode = this.first;
        while(currentNode != null)
        {
            sb.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    public boolean isEmpty()
    {
        return (this.first == null);
    }

    public void insertLast(E data) {

        Node newNode = new Node(data);
        if(isEmpty())
        {
            this.first = newNode;
        }
        else {
            this.last.setNext(newNode);
        }
        newNode.setPrevious(this.last);
        this.last = newNode;
    }

    public Node deleteFirst() {
        if(isEmpty())
        {
            return null;
        }
        Node temp = this.first;
        if(this.first.next == null)
        {
            this.last = null;
        }
        else
        {
            this.first.next.setPrevious(null);
        }
        this.first = this.first.next;
        return temp;
    }


    public Node deleteLast(){
        if(isEmpty())
        {
            return null;

        }
        if(this.first.next == null)
        {
            this.first = null;
        }
        else {
            this.last.previous.next = null;
        }
        Node temp = this.last;
        this.last = this.last.previous;
        return temp;

    }

    public boolean insertAfter(E key, E data) {

        Node newNode = new Node(data);
        Node node = findKey(key);

        if(node == null)
            return false;

        if(node == this.last)
            this.last = newNode;

        newNode.setNext(node.getNext());
        newNode.setPrevious(node);

        node.setNext(newNode);
        node.getNext().setPrevious(newNode);

        return (node != null);
    }

    private Node findKey(E key) {
        Node currentNode = this.first;
        while(currentNode != null)
        {
            if(currentNode.getData().equals(key))
                return currentNode;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public Node delete(E key) {

        Node node = findKey(key);
        if(node == null)
            return null;
        if(node == this.last)
        {
            this.last = this.last.getPrevious();
        }
        else
        {
            node.getNext().setPrevious(node.getPrevious());
        }

        if(this.first == node)
        {
            this.first = this.first.next;
        }
        else
        {
            node.getPrevious().setNext(node.getNext());
        }

        return node;
    }
}
