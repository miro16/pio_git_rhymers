package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntLinkedListTest {

    private IntLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new IntLinkedList();
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(list.isEmpty());
        list.push(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(list.isFull());
    }

    @Test
    public void testPushAndTop() {
        list.push(1);
        assertEquals(1, list.top());
        list.push(2);
        assertEquals(2, list.top());
    }

    @Test
    public void testPop() {
        assertEquals(-1, list.pop());

        list.push(1);
        list.push(2);
        assertEquals(2, list.pop());
        assertEquals(1, list.pop());
        assertEquals(-1, list.pop());
    }

    @Test
    public void testTopOnEmptyList() {
        assertEquals(-1, list.top());
    }

    @Test
    public void testPushPopMultiple() {
        list.push(1);
        list.push(2);
        list.push(3);

        assertEquals(3, list.pop());
        assertEquals(2, list.pop());
        assertEquals(1, list.pop());
        Assertions.assertTrue(list.isEmpty());
    }
}
