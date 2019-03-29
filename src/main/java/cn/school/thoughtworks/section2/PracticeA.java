package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap();
        for (String s : collection1) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }
}
