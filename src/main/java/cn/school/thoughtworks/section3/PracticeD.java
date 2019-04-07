package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.school.thoughtworks.section3.PracticeB.getModifiedMap;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = countStrings(collectionA);
        return getModifiedMap(collection3, object);
    }

    Map<String, Integer> countStrings(List<String> collectionA) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : collectionA) {
            String[] sList = s.split("-");
            if (sList.length == 2) {
                if (result.containsKey(s)) {
                    result.put(sList[0], result.get(sList[0]) + Integer.parseInt(sList[1]));
                } else {
                    result.put(sList[0], Integer.parseInt(sList[1]));
                }
            } else {
                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + 1);
                } else {
                    result.put(s, 1);
                }
            }
        }
        return result;
    }
}
