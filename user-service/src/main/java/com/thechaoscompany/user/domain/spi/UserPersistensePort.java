package com.thechaoscompany.user.domain.spi;

import com.thechaoscompany.user.domain.model.UserModel;

public interface UserPersistensePort {
    void save(UserModel user);
}
