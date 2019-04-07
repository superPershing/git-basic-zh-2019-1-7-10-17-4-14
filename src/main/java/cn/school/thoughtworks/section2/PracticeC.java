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
        Pattern patternSeparator = Pattern.compile("([-:]\\d+$)");
        Pattern patternBrackets = Pattern.compile("(\\[[0-9]*\\])");
        for (String s : collection1) {
            Matcher matcherSeparator = patternSeparator.matcher(s);
            Matcher matcherBrackets = patternBrackets.matcher(s);
            if (matcherSeparator.find()) {
                PracticeB.matchSeparator(result, s, matcherSeparator);
            } else if (matcherBrackets.find()) {
                matchBrackets(result, s, matcherBrackets);
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

    public void matchBrackets(Map<String, Integer> result, String s, Matcher m2) {
        String matcherString = m2.group();
        int repeatTimes = Integer.parseInt(matcherString.substring(1, matcherString.length() - 1));
        PracticeB.updateMap(result, s, matcherString, repeatTimes);
    }
}
