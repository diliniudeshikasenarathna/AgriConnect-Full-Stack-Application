package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.User;
import edu.icet.ecom.entity.UserEntity;
import edu.icet.ecom.repository.UserRepository;
import edu.icet.ecom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void createUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));

    }
}
