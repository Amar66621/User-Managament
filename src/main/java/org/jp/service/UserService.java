package org.jp.service;


import org.jp.dto.UserDto;
import org.jp.dto.UserEntityReq;

public interface UserService {
	
    UserDto createUserDto(UserDto userDto);


    UserDto updateUserById(Long id, UserDto userDto);

    
    String login(UserEntityReq dto);
}
