package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

import static cn.school.thoughtworks.section1.PracticeA.getSameElements;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> superList = new ArrayList<>();
        collection2.forEach(superList::addAll);
        return getSameElements(collection1, superList);
    }
}
