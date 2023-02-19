package com.thechaoscompany.user.domain.api;

import com.thechaoscompany.user.domain.model.UserModel;

public interface UserServicePort {
    void save(UserModel user);
}
