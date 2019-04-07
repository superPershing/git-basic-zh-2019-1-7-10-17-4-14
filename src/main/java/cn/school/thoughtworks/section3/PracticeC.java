package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.school.thoughtworks.section2.PracticeA.countStringWithMap;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = conutStrings(collectionA);
        return getNewCollection(collection3, object);
    }

    Map<String, Integer> conutStrings(List<String> collection1) {
        return countStringWithMap(collection1);
    }

    Map<String, Integer> getNewCollection(Map<String, Integer> collection1, Map<String, List<String>> object) {
        for (String s : object.get("value")) {
            if (collection1.containsKey(s)) {
                collection1.put(s, collection1.get(s) - collection1.get(s) / 3);
            }
        }
        return collection1;
    }
}
