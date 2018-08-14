package com.xl.actor;

import com.xl.command.AbstractApiCommand;
import com.xl.command.ApiCommand;
import com.xl.command.JmsCommand;
import com.xl.condition.Condition;
import com.xl.condition.JmsCondition;
import com.xl.data.NodeStatus;

public class JmsActor extends AbstractActor<NodeStatus> {
    public JmsActor(ApiCommand<NodeStatus> command, Condition<NodeStatus>... conditions) {
        super(command, conditions);
    }

    public static final class JmsActorBuilder {
        private String topic;
        private NodeStatus nodeStatus;

        public JmsActorBuilder setTopic(String topic) {
            this.topic = topic;
            return this;
        }

        public JmsActorBuilder setNodeStatus(com.xl.data.NodeStatus nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }

        public JmsActor build() {
            return new JmsActor(new JmsCommand(topic, nodeStatus), new JmsCondition(nodeStatus.getStatusId()));
        }
    }
}
