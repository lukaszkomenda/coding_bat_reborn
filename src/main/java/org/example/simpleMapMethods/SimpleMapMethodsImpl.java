package org.example.simpleMapMethods;

import java.util.Map;

public class SimpleMapMethodsImpl implements SimpleMapMethods{
    @Override
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    @Override
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    @Override
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    @Override
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }
}
