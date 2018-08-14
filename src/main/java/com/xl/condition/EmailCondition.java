package com.xl.condition;

import com.xl.config.OutputType;
import com.xl.data.NodeStatus;
import com.xl.data.StatusId;

public class EmailCondition implements Condition<NodeStatus> {
    private final OutputType outputType = OutputType.EMAIL;
    private StatusId statusId;

    public EmailCondition(StatusId statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean test(NodeStatus nodeStatus) {
        return nodeStatus.getStatusId().equals(statusId);
    }
}
