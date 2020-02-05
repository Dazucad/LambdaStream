package ru.lokyanvs;

import java.util.function.Supplier;

public class Generator implements Supplier<Integer> /*,UnaryOperator<Integer>*/{

    private int first;
    private int second;

    public Generator(int second) {
        this.second = second;
    }

    public Generator(int first,int second){
        this.first=first;
        this.second=second;
    }

    //@Override
    public Integer apply(Integer o) {
        second += first;
        first = o;
        return second;
    }

    @Override
    public Integer get() {
        int temp=first+second;
        first=second;
        return second=temp;
    }
}
