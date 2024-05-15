package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_VALUE = -1;

    private static final int MAX_NUMBERS = 12;

    private int[] numbers = new int[MAX_NUMBERS];

    public int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS - 1;
    }

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

}
