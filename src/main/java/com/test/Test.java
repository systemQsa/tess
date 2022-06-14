package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test implements Testing{

    @Override
    public void hello(String message) {
        System.out.println(message);
        List<String> list = new ArrayList<>();
        list.add("string");
        list.forEach(System.out::println);
    }
}
