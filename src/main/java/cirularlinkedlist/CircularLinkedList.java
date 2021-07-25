package cirularlinkedlist;

import util.Node;

public class CircularLinkedList <E> {

    private Node<E> first;

    private Node<E> last;

    public CircularLinkedList()
    {
        this.first = null;
        this.last = null;
    }


    public void insertFirst(E data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            this.last = newNode;
        }
        newNode.setNext(first);
        first = newNode;
    }


    public void insertLast(E data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            this.first = newNode;
            this.last = newNode;
        }
        else{
            this.last.setNext(newNode);
            this.last = newNode;
        }


    }


    public Node deleteFirst()
    {
        Node first = this.first;
        this.first = this.first.getNext();
        return first;
    }




    private boolean isEmpty() {
        return (first == null);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = this.first;
        while(currentNode != null)
        {
            sb.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    public Node<E> deleteLast() {
        Node temp = this.last;
        
        return temp;
    }
}
