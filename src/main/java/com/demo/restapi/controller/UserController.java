package com.demo.restapi.controller;

import com.demo.restapi.dto.UserDTO;
import com.demo.restapi.entities.User;
import com.demo.restapi.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){
        UserDTO resultUser = userService.createUser(user);
        return ResponseEntity.ok(resultUser);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Long id){
        UserDTO user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") Long id, @RequestBody UserDTO user) {
       UserDTO resultUser = userService.updateUser(id, user);
       return ResponseEntity.ok(resultUser);
    }

    @GetMapping("/pagination")
    public ResponseEntity<Page<User>> pagination(@RequestParam int currentPage, @RequestParam int pageSize){
        return ResponseEntity.ok(userService.pagination(currentPage, pageSize));
    }


}
