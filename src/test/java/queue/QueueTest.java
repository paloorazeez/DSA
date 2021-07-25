package queue;

import org.junit.Assert;
import org.junit.Test;
import queue.exception.QueueUnderflowException;

public class QueueTest {

    @Test
    public void testEnqueue()
    {
        Queue queue = new Queue(Integer.class, 3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        Assert.assertEquals(10, queue.dequeue());
        Assert.assertEquals("20 30 40", queue.print());
    }

    @Test(expected = QueueUnderflowException.class)
    public void testDequeue()
    {
        Queue queue = new Queue(Integer.class, 3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        Assert.assertEquals(10, queue.dequeue());
        Assert.assertEquals(20, queue.dequeue());
        Assert.assertEquals(30, queue.dequeue());
        Assert.assertEquals(null, queue.dequeue());
    }
}
