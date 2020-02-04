package ru.lokyanvs;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 1 число");
        int first=scanner.nextInt();
        System.out.println("Введите 2 число");
        int second=scanner.nextInt();
        List<Integer> list= Stream.iterate(first,new Generator(second)).limit(20).collect(Collectors.toList());
        System.out.println(list);
    }
}
