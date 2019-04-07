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
            if (!m.find()) {
                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + 1);
                } else {
                    result.put(s, 1);
                }
            } else {
                matchSeparator(result, s, m);
            }
        }
        return result;
    }

    public static void matchSeparator(Map<String, Integer> result, String s, Matcher m) {
        String matcherString = m.group();
        int repeatTimes = Integer.parseInt(matcherString.substring(1));
        updateMap(result, s, matcherString, repeatTimes);
    }

    static void updateMap(Map<String, Integer> result, String s, String matcherString, int repeatTimes) {
        String key = s.replace(matcherString, "");
        if (result.containsKey(key)) {
            result.put(key, result.get(key) + repeatTimes);
        } else {
            result.put(key, repeatTimes);
        }
    }
}
