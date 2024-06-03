package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    // TODO: Consider changing the name of EMPTY_VALUE to EMPTY_INDEX to better reflect its purpose
    private static final int EMPTY_VALUE = -1;

    private static final int MAX_NUMBERS = 12;

    private final int[] numbers = new int[MAX_NUMBERS];

    // TODO: total is an index; consider renaming it to make it clearer, e.g., currentIndex
    private int total = EMPTY_VALUE;

    // TODO: countIn method should validate input if necessary, e.g., non-negative numbers only
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    // TODO: callCheck could be renamed to isEmpty for better clarity
    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS - 1;
    }

    // TODO: peekaboo could be renamed to peek for better clarity
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

    // TODO: Add toString method for better debugging and logging support
}
