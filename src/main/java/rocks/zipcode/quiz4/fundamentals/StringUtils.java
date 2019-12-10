package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("");
        s[str.length() / 2] = s[str.length() / 2].toUpperCase();

        for(String cha : s) {
            sb.append(cha);
        }

        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("");
        s[str.length() / 2] = s[str.length() / 2].toLowerCase();

        for(String cha : s) {
            sb.append(cha);
        }

        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);

        List<String> uniques = list.stream().distinct().collect(Collectors.toList());
        return list.size() == uniques.size();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();

        sb.append(arr[0]);

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == arr[i - 1] || arr[i] == arr[i + 1])
                continue;
            sb.append(arr[i]);
        }
        sb.append(arr[str.length() - 1]);
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();

        for(char ch : arr) {
            if(65 <= ch && ch <= 90)
                ch += 32;
            else if (97 <= ch && ch <= 122)
                ch -= 32;
            sb.append(ch);
        }
        return sb.toString();
    }
}