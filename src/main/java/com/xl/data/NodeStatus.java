package com.xl.data;

public class NodeStatus {
    private Integer version;
    private String name;
    private StatusId statusId;

    public NodeStatus(Integer version, String name, StatusId statusId) {
        this.version = version;
        this.name = name;
        this.statusId = statusId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusId getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusId statusId) {
        this.statusId = statusId;
    }
}
