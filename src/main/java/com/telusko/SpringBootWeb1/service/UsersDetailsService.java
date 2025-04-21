package com.telusko.SpringBootWeb1.service;

import com.telusko.SpringBootWeb1.model.Users;
import com.telusko.SpringBootWeb1.model.UsersPrincipal;
import com.telusko.SpringBootWeb1.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class UsersDetailsService implements UserDetailsService {
    @Autowired
    UsersRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = repo.findByUsername(username);
        if(users == null)
        {
            System.out.println("404");
            throw new UsernameNotFoundException("401");
        }
            return new UsersPrincipal(users);
    }
}
