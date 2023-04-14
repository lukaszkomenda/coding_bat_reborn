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
}
