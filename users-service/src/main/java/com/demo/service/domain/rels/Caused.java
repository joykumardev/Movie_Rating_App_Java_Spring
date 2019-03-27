package com.demo.service.domain.rels;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.demo.service.domain.nodes.Event;
import com.demo.service.domain.nodes.User;

@RelationshipEntity(type = "CAUSED")
public class Caused {
    @GraphId
    Long id;
    @StartNode
    User user;
    @EndNode
    Event event;
}
