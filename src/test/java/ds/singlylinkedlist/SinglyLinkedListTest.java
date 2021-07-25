package ds.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;
import util.Node;


public class SinglyLinkedListTest {


    @Test
    public void testInsertFirst()
    {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();

        insertHelper(ll, 10, 10, 40);

        Assert.assertEquals("40 30 20 10 ", ll.print());
    }



    @Test
    public void deleteFirst()
    {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
        insertHelper(ll, 10, 10, 40);
        Node removeFirst = ll.removeFirst();
        Assert.assertEquals(40, removeFirst.getData());
        Assert.assertEquals("30 20 10 ", ll.print());
    }

    @Test
    public void testInsertLast()
    {

        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();

        insertLastHelper(ll, 10, 10, 40);

        Assert.assertEquals("10 20 30 40 ", ll.print());

    }

    @Test
    public void testDeleteLast()
    {

        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();

        insertLastHelper(ll, 10, 10, 40);
        Node removedLast = ll.removeLast();
        Assert.assertEquals(40, removedLast.getData());

        Assert.assertEquals("10 20 30 ", ll.print());
         removedLast = ll.removeLast();
        Assert.assertEquals(30, removedLast.getData());

        removedLast = ll.removeLast();
        Assert.assertEquals(20, removedLast.getData());

        removedLast = ll.removeLast();
        Assert.assertEquals(10, removedLast.getData());

    }

    /*@Test(timeout = 1000)
    public void testInsertLastPerformanceTest()
    {
        SinglyLinkedList ll = new SinglyLinkedList();
        long start = System.currentTimeMillis();
        insertLastHelper(ll, 1, 1, 23000);
        long end = System.currentTimeMillis();

        System.out.println((end-start));

    }*/


     private void insertHelper(SinglyLinkedList<Integer> ll, int start, int increment, int end) {

        for(int i= start; i<=end; i+=increment)
        {
            ll.insertFirst(i);
        }

    }

    private void insertLastHelper(SinglyLinkedList<Integer> ll, int start, int increment, int end) {

        for(int i= start; i<=end; i+=increment)
        {
            ll.insertLast(i);
        }

    }
}
