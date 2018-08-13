package com.xl.command;

import com.xl.data.NodeStatus;

import java.util.Arrays;
import java.util.List;

public class EmailCommand extends AbstractApiCommand {
    private String recipient;
    private String subject;
    private String sender;
    private String content;
    private NodeStatus nodeStatus;

    public EmailCommand(String recipient, String subject, String sender, String content, NodeStatus nodeStatus) {
        this.recipient = recipient;
        this.subject = subject;
        this.sender = sender;
        this.content = content;
        this.nodeStatus = nodeStatus;
    }

    @Override
    public NodeStatus[] run(NodeStatus[] nodeStatuses) {
        System.out.println("emailing nodes=" + Arrays.toString(nodeStatuses) + " with " + this.toString());
        return nodeStatuses;
    }
}
