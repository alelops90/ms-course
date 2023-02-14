package com.alelops.hruser.resources;

import com.alelops.hruser.entities.User;
import com.alelops.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserResources {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/email")
    ResponseEntity<User> findByEmail(@RequestParam String email){
        User user = userRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
