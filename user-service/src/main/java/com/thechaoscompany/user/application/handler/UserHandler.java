package com.thechaoscompany.user.application.handler;

import com.thechaoscompany.user.application.dto.request.UserRequestDto;

public interface UserHandler {
    void save(UserRequestDto user);
}