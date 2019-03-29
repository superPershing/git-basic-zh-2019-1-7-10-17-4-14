package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> superList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        collection2.forEach(e -> superList.addAll(e));
        for (String s : collection1) {
            if (superList.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
