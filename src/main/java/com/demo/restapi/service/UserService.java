package com.demo.restapi.service;

import com.demo.restapi.dto.UserDTO;
import com.demo.restapi.entities.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO getUser(Long id);
    List<UserDTO> getUsers();
    UserDTO updateUser(Long id, UserDTO user);
    Page<User> pagination(int currentPage, int pageSize);
}
