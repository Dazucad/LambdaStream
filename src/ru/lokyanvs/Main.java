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

        //1 способ
        List<Integer> list= Stream.iterate(first,new Generator(second)::apply).limit(30).collect(Collectors.toList());
        System.out.println(list);

        //2 сопсоб
        list=Stream.concat(Stream.of(first,second),Stream.generate(new Generator(first,second))).limit(30).collect(Collectors.toList());
        System.out.println(list);
    }
}
