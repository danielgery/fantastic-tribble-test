package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

    private QueueTAD<Integer> qtester;

    @BeforeEach
    public void setUp() {
        qtester = new Queue<Integer>();
    }

    @Test
    void testSetUp() {
        assertTrue(qtester.isEmpty());
    }

    @Test
    void testEnqueueFirst() {
        qtester.enqueue((Integer) 1);
        assertEquals(((Integer) 1), qtester.first());
    }

    @Test
    void testDequeue() {
        qtester.enqueue((Integer) 1);
        qtester.enqueue((Integer) 2);
        qtester.dequeue();
        assertEquals(((Integer) 2), qtester.first());
    }

    void testIsEmpty() {
        qtester.enqueue((Integer) 1);
        qtester.enqueue((Integer) 2);
        qtester.dequeue();
        qtester.dequeue();
        assertTrue(qtester.isEmpty());
    }

    void testSize()
    {
        qtester.enqueue((Integer) 1);
        qtester.enqueue((Integer) 2);
        assertEquals(2, qtester.size());        
    }
}