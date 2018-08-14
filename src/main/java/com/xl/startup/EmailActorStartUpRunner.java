package com.xl.startup;

import com.xl.actor.JmsActor;
import com.xl.data.NodeStatus;
import com.xl.data.STATUS_TYPE;
import com.xl.data.StatusId;
import com.xl.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class EmailActorStartUpRunner implements CommandLineRunner {

    @Autowired
    private EventServiceImpl eventService;

    @Override
    public void run(String... strings) throws Exception {
        //get the information from db
        NodeStatus nodeStatus = new NodeStatus(1, "1", new StatusId(1L, STATUS_TYPE.A));
        eventService.register(new JmsActor.JmsActorBuilder().setNodeStatus(nodeStatus).setTopic("topicA").build());
    }
}
