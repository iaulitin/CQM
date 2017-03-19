package org.cqm.data.services;

import org.cqm.data.entity.User;
import org.cqm.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserRepository getUserRepository() {
        return this.userRepository;
    }

    public User findUserByLogin(String login) {
        List<User> users = userRepository.findByLogin(login);
        if (users == null && users.isEmpty() )
            return null;
        return users.get(0);
    }
}
