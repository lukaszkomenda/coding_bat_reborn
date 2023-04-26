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
}
