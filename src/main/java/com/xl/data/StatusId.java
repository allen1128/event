package com.xl.data;

public class StatusId {
    private Long id;
    private STATUS_TYPE type;

    public StatusId(Long id, STATUS_TYPE type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public STATUS_TYPE getType() {
        return type;
    }

    public void setType(STATUS_TYPE type) {
        this.type = type;
    }
}
