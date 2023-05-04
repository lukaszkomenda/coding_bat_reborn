package org.example.mediumMapMethods;

import java.util.HashMap;
import java.util.Map;

public class MediumMapMethodsImpl implements MediumMapMethods {
    @Override
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    @Override
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    @Override
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0,1), s.substring(s.length() - 1));
        }
        return map;
    }

    @Override
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String tmp : strings) {

            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                map.put(tmp, count + 1);
            } else {
                map.put(tmp, 1);
            }

        }
        return map;
    }

    @Override
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String string : strings) {

            String key = String.valueOf(string.charAt(0));

            if (map.containsKey(key)) {
                String val = map.get(key) + string;
                map.put(key, val);
            } else {
                map.put(key, string);
            }

        }
        return map;
    }

    @Override
    public String wordAppend(String[] strings) {
        Map<String, Integer> map    = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String key : strings) {

            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result.append(key);
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }

        }

        return result.toString();
    }

    @Override
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String key : strings) {
            if (counts.containsKey(key)) {
                int val = counts.get(key);
                val++;
                counts.put(key, val);
            } else {
                counts.put(key, 1);
            }

            result.put(key, counts.get(key) >= 2);
        }

        return result;
    }
}
