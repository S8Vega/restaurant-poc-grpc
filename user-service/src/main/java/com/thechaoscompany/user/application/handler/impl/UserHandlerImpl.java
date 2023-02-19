package com.thechaoscompany.user.application.handler.impl;

import com.thechaoscompany.user.application.dto.request.UserRequestDto;
import com.thechaoscompany.user.application.handler.UserHandler;
import com.thechaoscompany.user.application.mapper.UserRequestMapper;
import com.thechaoscompany.user.domain.api.UserServicePort;
import com.thechaoscompany.user.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandlerImpl implements UserHandler {

    private final UserServicePort servicePort;
    private final UserRequestMapper mapper;

    @Override
    public void save(UserRequestDto user) {
        UserModel userModel = mapper.toModel(user);
        servicePort.save(userModel);
    }
}