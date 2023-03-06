package com.ssmbrokerservice.rest_clients.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class UserDataOutputView extends UserDataAbstractView{

    private String userUuid;

    private String userName;

    private String password;

    private LocalDateTime startValidity;

}
