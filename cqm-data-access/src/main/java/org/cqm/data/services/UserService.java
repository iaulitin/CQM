package org.cqm.data.services;

import org.cqm.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitriy on 08.11.2016.
 */

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserRepository getUserRepository() {
        return this.userRepository;
    }
}
