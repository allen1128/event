package com.xl.condition;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Predicate;

public interface Condition<V> extends Predicate<V> {
     @Override
     default Condition<V> and(Predicate<? super V> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    @Override
    default Condition<V> or(Predicate<? super V> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

}
