package com.xl.command;

import com.xl.data.NodeStatus;
import org.springframework.jmx.export.notification.NotificationPublisher;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractApiCommand<V> implements ApiCommand<NodeStatus> {
    @Override
    public NodeStatus[] run(List<NodeStatus> data) {
        NodeStatus[] nodeStatuses = data.toArray(new NodeStatus[0]);
        return run(nodeStatuses);
    }

    public abstract NodeStatus[] run(NodeStatus[] nodeStatuses);
}
