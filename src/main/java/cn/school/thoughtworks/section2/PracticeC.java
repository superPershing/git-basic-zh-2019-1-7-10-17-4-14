package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        Pattern pattern1 = Pattern.compile("([-:]\\d+$)");
        Pattern pattern2 = Pattern.compile("(\\[[0-9]*\\])");
        for (String s : collection1) {
            Matcher m1 = pattern1.matcher(s);
            Matcher m2 = pattern2.matcher(s);
            if (m1.find()) {
                String matcherString = m1.group();
                int repeatTimes = Integer.parseInt(matcherString.substring(1));
                String key = s.replace(matcherString, "");
                if (result.containsKey(key)) {
                    result.put(key, result.get(key) + repeatTimes);
                } else {
                    result.put(key, repeatTimes);
                }
            } else if (m2.find()) {
                String matcherString = m2.group();
                int repeatTimes = Integer.parseInt(matcherString.substring(1, matcherString.length() - 1));
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
