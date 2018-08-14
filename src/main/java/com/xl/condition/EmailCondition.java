package com.xl.condition;

import com.xl.data.OUTPUT_TYPE;
import com.xl.data.NodeStatus;
import com.xl.data.StatusId;

public class EmailCondition implements Condition<NodeStatus> {
    private final OUTPUT_TYPE OUTPUTTYPE = OUTPUT_TYPE.EMAIL;
    private StatusId statusId;

    public EmailCondition(StatusId statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean test(NodeStatus nodeStatus) {
        return nodeStatus.getStatusId().equals(statusId);
    }
}
