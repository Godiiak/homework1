package ru.digitalhabbits.homework1.plugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CounterPlugin implements PluginInterface {
    @Nullable
    @Override
    public String apply(@Nonnull String text) {
        return text.split("\n").length + ";" +
                getWords(text).values().stream().reduce(Integer::sum).get() + ";" +
                text.toCharArray().length;
    }
}
