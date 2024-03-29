package com.lkj.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {

    @NotNull(message = "Email cannot by null")
    @Size(min = 2, message = "Email not be less than 2 character")
    @Email
    private String email;

    @NotNull(message = "Password cannot by null")
    @Size(min = 8, message = "Password must be equals or grater than 8 characters")
    private String password;
}
