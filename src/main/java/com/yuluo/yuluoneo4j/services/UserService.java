package com.yuluo.yuluoneo4j.services;

import com.yuluo.yuluoneo4j.domain.User;
import com.yuluo.yuluoneo4j.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public Collection<User> findAll() {
        Collection<User> result = userRepository.findAllUser();
        return result;
    }

    @Transactional
    public User addUser(User user) {
        return userRepository.addUser(user.getName(), user.getAge());
    }

}
