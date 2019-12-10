package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Integer> wordCountMap;

    public WordCounter(String... strings) {
        wordCountMap = new HashMap<>();
        for(String str : strings) {
            if(wordCountMap.containsKey(str))
                wordCountMap.replace(str, wordCountMap.get(str) + 1);
            else
                wordCountMap.put(str, 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}
