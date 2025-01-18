package com.yeimy.screenmatch;

import java.util.Arrays;
import java.util.List;

public class ExampleStream {
    public void showExample(){
    List<String> name = Arrays.asList("Yeimy","David","Paola","Yogi","Felipe","Otilia","Adriana","Luciana");
        name.stream()
            .sorted()
            .limit(8)
            .filter(n -> n.startsWith("Y"))
            .map(n -> n.toUpperCase())
            .forEach(System.out::println);
    }
}