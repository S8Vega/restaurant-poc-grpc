package com.thechaoscompany.user.domain.usecase;

import com.thechaoscompany.user.domain.api.UserServicePort;
import com.thechaoscompany.user.domain.model.UserModel;
import com.thechaoscompany.user.domain.spi.UserPersistensePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase implements UserServicePort {

    private final UserPersistensePort userPersistensePort;

    @Override
    public void save(UserModel user) {
        userPersistensePort.save(user);
    }
}
