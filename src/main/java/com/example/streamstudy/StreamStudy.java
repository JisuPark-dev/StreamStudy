package com.example.streamstudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamStudy {
    public static void main(String[] args){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

//        List<String> threeHighCaloricDishNames =
//                menu.stream()
//                        .filter(dish -> dish.getCalories() > 300)
//                        .map(Dish::getName)
//                        .limit(3)
//                        .collect(toList());


//        List<String> menuName = menu.stream()
//                .filter(Dish -> Dish.getCalories() > 300)
//                .map(Dish::getName)
//                .collect(toList());
//        System.out.println("menuName = " + menuName);

//        List<Dish> vegetarian =
//                menu.stream()
//                .filter(Dish::isVegetarian)
//                .collect(toList());
//
//        System.out.println("vegetarian = " + vegetarian);

//        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .distinct()
//                .forEach(System.out::println);

//        List<Dish> collect = menu.stream()
//                .dropWhile(dish -> dish.getCalories() >420)
//                .collect(toList());
//
//        System.out.println("collect = " + collect);

//        List<Dish> collect = menu.stream()
//                .takeWhile(dish -> dish.getCalories() >420)
//                .collect(toList());
//
//        System.out.println("collect = " + collect);

//        List<Dish> collect = menu.stream()
//                .filter(dish -> dish.getCalories() > 300)
//                .skip(2)
//                .limit(3)
//                .collect(toList());
//        System.out.println("collect = " + collect);

        //처음 등장하는 고기 2개
//        List<Dish> collect = menu.stream()
//                .filter(dish -> dish.getType() == Dish.Type.MEAT)
//                .limit(2)
//                .collect(toList());
//        System.out.println("collect = " + collect);

//        List<Integer> collect = menu.stream()
//                .map(Dish::getName)
//                .map(String::length)
//                .collect(toList());
//
//        System.out.println("collect = " + collect);
//
//        menu.stream()
//                .map(dish -> dish.getName())
//                .map(word -> word.split(""))
//                .distinct()
//                .forEach(System.out::println);

//        List<String> words = Arrays.asList("Mordern", "Java", "In", "Action");
//
//        List<String> collect = words.stream()
//                .map(word -> word.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(toList());
//        System.out.println("collect = " + collect);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        numbers.stream()
//                .map(number -> number * number)
//                .forEach(System.out::println);

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(3,4);

        List<int[]> collect1 = nums1.stream()
                .flatMap(i -> nums2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        List<int[]> collect2 = nums1.stream()
                .flatMap(i -> nums2.stream()
                        .filter(j-> (i+j)%3==0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        System.out.println("collect = " + collect1);
        System.out.println("collect = " + collect2);

    }
}
