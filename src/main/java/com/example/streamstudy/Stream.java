package com.example.streamstudy;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT)
        );
    }
}
