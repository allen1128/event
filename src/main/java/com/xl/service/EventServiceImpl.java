package com.xl.service;

import com.xl.actor.Actor;
import com.xl.data.NodeStatus;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService<NodeStatus> {
    @Override
    public void register(Actor<NodeStatus>... actors) {


    }
}
