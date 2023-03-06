package com.ssmbrokerservice.rest_clients.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class LoginResponse{

    private String loginUuid;

    private String userUuid;

    private String userName;

    private String password;

}
