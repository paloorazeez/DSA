package ds.doublyll;

import org.junit.Assert;
import org.junit.Test;


public class DoublyLinkedListTest {

    @Test
    public void testInsertFirst()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Assert.assertEquals("4 3 2 1 ", ll.print());

    }



    @Test
    public void testInsertLast()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        Assert.assertEquals("1 2 3 4 ", ll.print());

    }


    @Test
    public void testDeleteFirst()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Node first = ll.deleteFirst();
        Assert.assertEquals(4, first.getData());

    }

    @Test
    public void testDeleteFirst2()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        Node first = ll.deleteFirst();
        Assert.assertEquals(1, first.getData());

    }

    @Test
    public void testDeleteLast()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Node last = ll.deleteLast();
        Assert.assertEquals(1, last.getData());

    }

    @Test
    public void testDeleteLast2()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        Node first = ll.deleteLast();
        Assert.assertEquals(1, first.getData());

    }
    @Test
    public void testInsertAfter()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Assert.assertTrue(ll.insertAfter(2, 1000));
        Assert.assertEquals("4 3 2 1000 1 ", ll.print());

        Assert.assertTrue(ll.insertAfter(1, 2000));
        Assert.assertEquals("4 3 2 1000 1 2000 ", ll.print());

        ll.insertLast(3000);
        Assert.assertEquals("4 3 2 1000 1 2000 3000 ", ll.print());


    }

    @Test
    public void testInsertAfterWithNull()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Assert.assertFalse(ll.insertAfter(5, 1000));
        Assert.assertEquals("4 3 2 1 ", ll.print());

    }

    @Test
    public void testDelete()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Node deletedNode = ll.delete(3);
        Assert.assertEquals(3, deletedNode.getData());
        Assert.assertEquals("4 2 1 ", ll.print());

        ll.insertLast(3000);
        Assert.assertEquals("4 2 1 3000 ", ll.print());

        ll.delete(3000);
        ll.insertLast(4000);
        Assert.assertEquals("4 2 1 4000 ", ll.print());
    }

    @Test
    public void testDelete2()
    {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        Node deletedNode = ll.delete(4);
        Assert.assertEquals(4, deletedNode.getData());
        Assert.assertEquals("3 2 1 ", ll.print());

        ll.insertFirst(5);
        Assert.assertEquals("5 3 2 1 ", ll.print());

    }
}
