package com.xl.command;

import com.xl.data.NodeStatus;

import java.util.Arrays;
import java.util.List;

public class JmsCommand extends AbstractApiCommand {
    private String topic;
    private NodeStatus nodeStatus;

    public JmsCommand(String topic, NodeStatus nodeStatus) {
        this.topic = topic;
        this.nodeStatus = nodeStatus;
    }

    @Override
    public NodeStatus[] run(NodeStatus[] nodeStatuses) {
        System.out.println("sending jms message for nodes=" + Arrays.toString(nodeStatuses) + " with " + this.toString());
        return nodeStatuses;
    }
}
