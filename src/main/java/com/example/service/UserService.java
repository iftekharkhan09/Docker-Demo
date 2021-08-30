package com.example.service;

import com.example.dto.Name;
import com.example.exception.UserNotFoundException;
import com.example.repository.NameRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final NameRepository nameRepository;

    public UserService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public Name getName(Integer id) {
        Optional<com.example.entity.Name> name = nameRepository.findById(id);
        if(name.isEmpty()) {
            throw new UserNotFoundException("User was not found !!");
        }
        return new Name(name.get().getName());
    }
}
