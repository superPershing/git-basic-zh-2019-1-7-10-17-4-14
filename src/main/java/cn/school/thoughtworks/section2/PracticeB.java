package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        Pattern pattern = Pattern.compile("(-\\d+$)");
        for (String s : collection1) {
            Matcher m = pattern.matcher(s);
            if (m.find()) {
                String matcherString = m.group();
                int repeatTimes = Integer.parseInt(matcherString.substring(1));
                String key = s.replace(matcherString, "");
                if (result.containsKey(key)) {
                    result.put(key, result.get(key) + repeatTimes);
                } else {
                    result.put(key, repeatTimes);
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
