
package  stack;

import org.junit.Assert;
import org.junit.Test;
import stack.exception.StackUnderflowException;


public class StackTest {

    @Test
    public void testPush()
    {
        Stack stack = new Stack( Integer.class,5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        Assert.assertEquals("50 40 30 20 10", stack.print());
    }

    @Test
    public void testPop()
    {
        Stack stack = new Stack(  Integer.class, 5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        Assert.assertEquals(50, stack.pop());
        Assert.assertEquals("40 30 20 10", stack.print());
    }



    @Test
    public void testPeak()
    {
        Stack stack = new Stack( Integer.class, 5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        Assert.assertEquals(50, stack.peak());
        Assert.assertEquals("50 40 30 20 10", stack.print());
    }


    @Test
    public void testIsEmpty()
    {
        Stack stack = new Stack( Integer.class, 5);

        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyFalse()
    {
        Stack stack = new Stack( Integer.class, 5);
        stack.push(10);
        stack.push(20);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull()
    {
        Stack stack = new Stack( Integer.class, 5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        Assert.assertTrue(stack.isFull());
    }

    @Test
    public void testIsFullFalse()
    {
        Stack stack = new Stack( Integer.class, 5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        Assert.assertFalse(stack.isFull());
    }

    @Test
    public void testPushWithOverflow()
    {
        Stack stack = new Stack( Integer.class, 5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        Assert.assertEquals("60 50 40 30 20 10", stack.print());
    }

    @Test(expected = StackUnderflowException.class)
    public void testPopWithUnderflow()
    {
        Stack stack = new Stack( Integer.class, 5);

        Assert.assertEquals(50, stack.pop());
        Assert.assertEquals("40 30 20 10", stack.print());
    }


    @Test
    public void testReverseString()
    {

        Stack<Character> stack = new Stack<>(Character.class, 5);
        String str= "hello";
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        Assert.assertEquals("o l l e h", stack.print());
    }
}
