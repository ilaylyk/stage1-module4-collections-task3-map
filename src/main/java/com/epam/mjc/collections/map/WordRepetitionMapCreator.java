package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (sentence.length() == 0) {
            return hashMap;
        }
        String str = sentence.toLowerCase();
        String charsToRemove = ",_!.";

        for (char c : charsToRemove.toCharArray()) {
            str = str.replace(String.valueOf(c), "");
        }

        ArrayList<String> people = new ArrayList<>(List.of(str.split(" ")));

        for (String word : people) {
            hashMap.put(word, hashMap.containsKey(word) ? hashMap.get(word) + 1 : 1);
        }
        return hashMap;
    }
}
