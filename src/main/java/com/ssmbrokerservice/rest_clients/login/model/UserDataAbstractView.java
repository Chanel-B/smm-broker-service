package com.ssmbrokerservice.rest_clients.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class UserDataAbstractView {

    private String loginUuid;
    private String userName;
    private String password;

}
