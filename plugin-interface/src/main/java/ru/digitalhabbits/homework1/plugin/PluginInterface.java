package ru.digitalhabbits.homework1.plugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface PluginInterface {
    default Map<String, Integer> getWords(String text){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Pattern pattern = Pattern.compile("(\\b[a-zA-Z][a-zA-Z.0-9]*\\b)");
        Matcher matcher = pattern.matcher(text.replace('\n', ' ').toLowerCase());
        while (matcher.find()){
            String s = matcher.group();
            int n = 1;
            if(treeMap.containsKey(s)){
                n = treeMap.get(matcher.group()) + 1;
            }
            treeMap.put(s, n);
        }
        return treeMap;
    }

    @Nullable
    String apply(@Nonnull String text);
}
