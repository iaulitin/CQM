package org.cqm.data.services;

import org.cqm.data.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitriy on 08.11.2016.
 */

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public UsersRepository getUsersRepository() {
        return this.usersRepository;
    }
}
