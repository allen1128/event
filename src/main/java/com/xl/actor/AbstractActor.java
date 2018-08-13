package com.xl.actor;

import com.xl.command.ApiCommand;
import com.xl.condition.Condition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractActor<V> implements Actor<V> {
    private Condition<V>[] conditions;
    private ApiCommand<V> command;

    public AbstractActor(ApiCommand<V> command, Condition<V>... conditions) {
        this.command = command;
        this.conditions = conditions;
    }

    public V[] apply(V... data){
        return command.run(filter(data));
    }

    private List<V> filter(V[] data){
        Condition<V> mergedConditions = Arrays.stream(conditions).reduce(Condition::or).orElse(x->false);
        List<V> result = new ArrayList<>();
        for (V datum : data) {
            if (mergedConditions.test(datum)) {
                result.add(datum);
            }
        }
        return result;
    }
}
