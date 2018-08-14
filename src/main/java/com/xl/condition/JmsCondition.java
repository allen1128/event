package com.xl.condition;

import com.xl.data.OUTPUT_TYPE;
import com.xl.data.NodeStatus;
import com.xl.data.StatusId;

public class JmsCondition implements Condition<NodeStatus> {
    private final OUTPUT_TYPE outputType = OUTPUT_TYPE.EMAIL;
    private StatusId statusId;

    public JmsCondition(StatusId statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean test(NodeStatus nodeStatus) {
        return nodeStatus.getStatusId().equals(statusId);
    }
}
