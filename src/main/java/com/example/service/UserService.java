package com.example.service;

import com.example.dto.Name;
import com.example.repository.NameRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final NameRepository nameRepository;

    public UserService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public Name getName(Integer id) {
        com.example.entity.Name name = nameRepository.findById(id).get();
        return new Name(name.getName());
    }
}
