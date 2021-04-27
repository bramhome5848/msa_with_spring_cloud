package com.lkj.userservice.service;

import com.lkj.userservice.dto.UserDto;
import com.lkj.userservice.repository.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
