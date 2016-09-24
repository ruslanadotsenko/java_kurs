package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ruslana on 24.09.16.
 */
public class Collections {
    public static void main(String[] args) {
        String[] langs = { "Java", "C#", "Python", "PHP"};// массив из 4 элементов

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

        for (String l : languages) {
            System.out.println("Я хочу выучить " + l);
        }
    }
}
