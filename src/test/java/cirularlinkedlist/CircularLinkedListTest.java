package cirularlinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class CircularLinkedListTest {

    @Test
    public void testInsertFirst()
    {

        CircularLinkedList<Character> ll = new CircularLinkedList();
        ll.insertFirst((char)97);
        ll.insertFirst((char)98);
        ll.insertFirst((char)99);
        ll.insertFirst((char)100);

        Assert.assertEquals("d c b a ",ll.print());

    }


    @Test
    public void testInsertLast()
    {

        CircularLinkedList<Character> ll = new CircularLinkedList();
        ll.insertLast((char)97);
        ll.insertLast((char)98);
        ll.insertLast((char)99);
        ll.insertLast((char)100);

        Assert.assertEquals("a b c d ",ll.print());


    }


    @Test
    public void testDeleteFirst()
    {
        CircularLinkedList<Character> ll = new CircularLinkedList();
        ll.insertFirst((char)97);
        ll.insertFirst((char)98);
        ll.insertFirst((char)99);
        ll.insertFirst((char)100);

        Assert.assertEquals('d', ll.deleteFirst().getData());
        Assert.assertEquals("c b a ", ll.print());
    }

    @Test
    public void testDeleteLast()
    {

        CircularLinkedList<Character> ll = new CircularLinkedList();
        ll.insertLast((char)97);
        ll.insertLast((char)98);
        ll.insertLast((char)99);
        ll.insertLast((char)100);
        // Assert.assertEquals('d', ll.deleteLast().getData());
        Assert.assertEquals("a b c ",ll.print());


    }
}
