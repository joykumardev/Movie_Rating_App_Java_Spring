package com.demo.service.domain.rels;

import com.demo.service.domain.nodes.User;
import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity(type="FOLLOWS")
public class Follows {
    @GraphId
    Long id;
    @StartNode
    User follower;
    @EndNode
    User follows;

    public Follows() {
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollows() {
        return follows;
    }

    public void setFollows(User follows) {
        this.follows = follows;
    }
}
