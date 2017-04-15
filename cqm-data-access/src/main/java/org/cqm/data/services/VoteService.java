package org.cqm.data.services;

import org.cqm.data.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("voteService")
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

    public VoteRepository getVoteRepository() {
        return this.voteRepository;
    }
}
