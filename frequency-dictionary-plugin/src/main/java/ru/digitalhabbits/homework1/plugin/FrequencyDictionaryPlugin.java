package ru.digitalhabbits.homework1.plugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class FrequencyDictionaryPlugin
        implements PluginInterface {

    @Nullable
    @Override
    public String apply(@Nonnull String text) {
        return getWords(text).entrySet().stream()
                .map((x) -> x.getKey() + " " + x.getValue() + '\n')
                .reduce((x, y) -> x + y).get().trim();
    }
}
