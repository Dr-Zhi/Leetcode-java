package com.drzhi.lintcode;

import java.util.*;

/**
 * http://www.lintcode.com/en/problem/anagrams/
 *
 * @author zyanling.
 */
public class Anagrams {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        if (strs == null || strs.length < 2) {
            return Collections.emptyList();
        }

        Map<String, List<String>> stringsMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            List<String> list = stringsMap.get(sortedString);
            if (list == null) {
                list = new ArrayList<>();
                stringsMap.put(sortedString, list);
            }
            list.add(str);
        }

        List<String> result = new ArrayList<>();
        for (List<String> list : stringsMap.values()) {
            if (list.size() > 1) {
                result.addAll(list);
            }
        }
        return result;
    }
}
