package com.xl.command;

import java.util.List;

public interface ApiCommand<V> {
    V[] run(List<V> filter);
}
