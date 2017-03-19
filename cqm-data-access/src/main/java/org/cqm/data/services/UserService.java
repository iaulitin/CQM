package org.cqm.data.services;

import org.cqm.data.entity.User;
import org.cqm.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.beans.Encoder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    public User findUserByEmail(String email) {
        List<User> users = userRepository.findByEmail(email);
        if (users == null && users.isEmpty() )
            return null;
        return users.get(0);
    }

    public void save(User user) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        digest.update(user.getPassword().getBytes("utf8"));
        byte[] digestBytes = digest.digest();
        String digestStr = javax.xml.bind.DatatypeConverter.printHexBinary(digestBytes);
        user.setPassword(digestStr.toLowerCase());
        userRepository.save(user);
    }
}
