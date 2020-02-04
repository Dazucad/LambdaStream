package ru.lokyanvs;

import java.util.function.UnaryOperator;

public class Generator implements UnaryOperator<Integer> {
    private int sum;
    private int prev;

    public Generator(int second) {
        this.sum = second;
    }

    @Override
    public Integer apply(Integer o) {
        sum += prev;
        prev = o;
        return sum;
    }
}
