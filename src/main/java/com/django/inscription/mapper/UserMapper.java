package com.django.inscription.mapper;

import com.django.inscription.dto.UserDto;
import com.django.inscription.entities.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDto fromUser(User user){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        userDto.setRole(user.getRole().name());
        return userDto;
    }

    public User fromUserDto(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }
}
