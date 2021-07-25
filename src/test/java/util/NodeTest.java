package util;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void testNode()
    {
        Node<Integer> root = new Node<>(10);
        root.setNext(new Node(20));

        System.out.println(root.getData());
        System.out.println(root.getNext().getData());
    }

    @Test
    public void testLength()
    {
        Node four = new Node(50);
        Node three = new Node(40, four);
        Node two = new Node(30, three);
        Node<Integer> one  = new Node<>(20, two);
        Node<Integer> root = new Node<>(10, one);

        Assert.assertEquals(5, getLength(root));
        Assert.assertEquals(3, getLength(two));

    }

    private int getLength(Node root)
    {
        int length =0 ;
        Node currentNode = root;
        while(currentNode != null)
        {
            length++;
            currentNode= currentNode.next;
        }
        return length;
    }
}
