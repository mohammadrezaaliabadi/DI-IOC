package com.company.guruspring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class T {

    public static void main(String[] args) {
        List<Integer> virgoles = new ArrayList<>();
        int[] li = new int[2];
        int j=0;
        String s = "ali,mohammad,reza";
        for (int i = 0;s.length()>i;i++){
            char c = s.charAt(i);
            if (c==','){
                virgoles.add(i);
                li[j++] = i;

            }
        }
        IntStream.of(li).forEach(System.out::println);
        virgoles.forEach(System.out::println);
    }
}
