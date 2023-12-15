package com.moises.store.resources;

import com.moises.store.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        return ResponseEntity.ok().body(new User(1L, "Moises Almeida", "LbYnI@example.com", "123456789", "123456"));
    }
}
