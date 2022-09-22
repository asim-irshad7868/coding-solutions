package org.example;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class CountFruit {

    public static void main(String[] args) {
        String[] fruits = {"Strawberry", "Mango", "Cherry", "Lime", "Guava", "Papaya", "Nectarine", "Pineapple", "Lemon", "Plum", "Tangerine", "Fig",
                "Blueberry", "Grape", "Jackfruit", "Pomegranate", "Apple", "Pear", "Orange", "Watermelon", "Raspberry", "Banana"};
        LinkedHashMap<Character, Integer> startingLetterCount = new LinkedHashMap<>();
        HashSet<String> uniqueFruits = new HashSet<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            startingLetterCount.put(c, 0);
        }
        for (String fruit : fruits) {
            if (!uniqueFruits.contains(fruit)) {
                char firstLetter = fruit.charAt(0);
                startingLetterCount.computeIfPresent(Character.toUpperCase(firstLetter), (key, val) -> val + 1);
                uniqueFruits.add(fruit);
            }
        }
        startingLetterCount.forEach((key, val) -> System.out.println(key + ": " + val));
    }
}