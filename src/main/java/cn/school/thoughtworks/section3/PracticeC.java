package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

import static cn.school.thoughtworks.section2.PracticeA.countStringWithMap;
import static cn.school.thoughtworks.section3.PracticeB.getModifiedMap;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = countStringWithMap(collectionA);
        return getModifiedMap(collection3, object);
    }
}
