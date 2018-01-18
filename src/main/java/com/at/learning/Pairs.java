package com.at.learning;

import java.util.Map;
import java.util.HashMap;

public class Pairs {

    public Map<String, String> pairUsingCharAt(String[] strings) {
        Map<String, String> stringMap = new HashMap<String, String>();

        for (String string : strings) {
            // Add to map only if key doesn't exists.
            if (!stringMap.containsKey(String.valueOf(string.charAt(0)))) {
                stringMap.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
            } else {
                System.out.println("Ignoring string " + string + " as key for this string already exists in map.");
            }
        }
        return stringMap;
    }

    public static void main(String[] args) {

        String[] input = {"man", "cat", "mad", "1test"};
        Pairs pairs = new Pairs();
        Map<String, String> output = pairs.pairUsingCharAt(input);
        for(Map.Entry<String, String> entry : output.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
