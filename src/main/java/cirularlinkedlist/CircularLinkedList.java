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
        Node<E> newNode = new Node<E>(data);
        if(isEmpty())
        {
            this.last = newNode;
        }
        newNode.setNext(first);
        first = newNode;
    }


    public void insertLast(E data)
    {
        Node<E> newNode = new Node<E>(data);
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


    public Node<E> deleteFirst()
    {
        Node<E> node = this.first;
        this.first = this.first.getNext();
        return node;
    }




    private boolean isEmpty() {
        return (first == null);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        Node<E> currentNode = this.first;
        while(currentNode != null)
        {
            sb.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    public Node<E> deleteLast() {
        Node<E> temp = this.last;
        
        return temp;
    }
}
