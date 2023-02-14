package com.alelops.hroauth.services;

import com.alelops.hroauth.entities.User;
import com.alelops.hroauth.feignclient.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            log.error("Not Found " + email);
            throw new IllegalArgumentException("Not Found");
        }
        log.info("Passou por aqui essa caraia..."+ email);
        return user;
    }
}
