package org.cqm.web.config.details;

import org.cqm.data.entity.enums.UserRoleEnum;
import org.cqm.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dmitriy on 08.12.2016.
 */

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    //get user from database
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userLogin) throws UsernameNotFoundException {

        //get user via our repository
        org.cqm.data.entity.User user = (org.cqm.data.entity.User) userRepository.findByLogin(userLogin);

        //set roles
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));

        //check login and password
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserLogin(), user.getHashPassword(), roles);

        return userDetails;
    }
}
