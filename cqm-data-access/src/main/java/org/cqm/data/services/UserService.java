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

    public User findUserByLogin(String userLogin) {
        List<User> users = userRepository.findByLogin(userLogin);
        if (users == null && users.isEmpty() )
            return null;
        return users.get(0);
    }
}
