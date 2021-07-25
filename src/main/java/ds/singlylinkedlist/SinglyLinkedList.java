package ds.singlylinkedlist;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;
import util.Node;

public class SinglyLinkedList <E>{

    private Node<E> first;


    public boolean isEmpty()
    {
        return (first == null);
    }

    public boolean isNotEmpty()
    {
        return (first != null);
    }

    public void insertFirst(E data)
    {
        Node<E> newNode = new Node<E>(data);
        newNode.setNext(first);
        first =newNode;
    }

    public String print() {

        StringBuilder sb = new StringBuilder();
        Node<E> currentNode = this.first;
        while(currentNode != null)
        {
            sb.append(currentNode.getData());
            sb.append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    public Node<E> removeFirst() {

        Node<E> temp = first;
        first = first.getNext();
        temp.setNext(null);
        return temp;
    }

    public void insertLast(E data) {
        Node<E> newNode = new Node<E>(data);
        if(first == null)
            first=newNode;
        else{
            Node<E> temp = getLastNode();
            temp.setNext(newNode);

        }

    }

    private Node<E> getLastNode() {
        Node<E> temp = first;
        //find last node
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        return temp;
    }

    public Node<E> getSecondLastNode() {
        Node<E> temp = first;
        //find last node
        while(temp.getNext() != null && temp.getNext().getNext() != null)
        {
            temp = temp.getNext();
        }
        return temp;
    }

    public Node<E> removeLast() {

        Node<E> secondLastNode = getSecondLastNode();
        Node<E> lastNode = (secondLastNode.getNext() != null)? secondLastNode.getNext() : secondLastNode;
        secondLastNode.setNext(null);
        return lastNode;
    }




}
