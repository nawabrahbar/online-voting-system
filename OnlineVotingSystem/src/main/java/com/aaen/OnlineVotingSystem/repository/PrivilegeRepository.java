package com.aaen.OnlineVotingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aaen.OnlineVotingSystem.model.PrivilegeRequestResponse;

@Repository
public interface PrivilegeRepository extends MongoRepository<PrivilegeRequestResponse, String> {

}
