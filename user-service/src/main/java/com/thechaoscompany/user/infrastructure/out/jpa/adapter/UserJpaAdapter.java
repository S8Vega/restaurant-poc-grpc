package com.thechaoscompany.user.infrastructure.out.jpa.adapter;

import com.thechaoscompany.user.domain.model.UserModel;
import com.thechaoscompany.user.domain.spi.UserPersistensePort;
import com.thechaoscompany.user.infrastructure.out.jpa.entity.UserEntity;
import com.thechaoscompany.user.infrastructure.out.jpa.mapper.UserEntityMapper;
import com.thechaoscompany.user.infrastructure.out.jpa.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserJpaAdapter implements UserPersistensePort {
    private UserRepository repository;
    private UserEntityMapper mapper;

    @Override
    public void save(UserModel user) {
        UserEntity userEntity = mapper.toEntity(user);
        repository.save(userEntity);
    }
}
