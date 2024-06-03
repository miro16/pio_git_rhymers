package edu.kis.vh.nursery.list;

/**
 * A class that implements a linked list of integers.
 */
public class IntLinkedList {

    private static final int EMPTY_VALUE = -1;
    private Node last;
    private int i;

    /**
     * Pushes an integer onto the end of the linked list.
     *
     * @param i the integer to be pushed onto the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the linked list is full. Always returns false
     * since the linked list can dynamically grow.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the last element in the linked list
     * without removing it.
     *
     * @return the value of the last element, or -1 if the list is empty
     */
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    /**
     * Removes and returns the value of the last element in the linked list.
     *
     * @return the value of the last element, or -1 if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * A class representing a node in the linked list.
     */
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Constructs a Node with the specified value.
         *
         * @param i the value to be stored in the node
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Returns the value stored in the node.
         *
         * @return the value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * Returns the previous node in the linked list.
         *
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node in the linked list.
         *
         * @param prev the previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the next node in the linked list.
         *
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets the next node in the linked list.
         *
         * @param next the next node
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
