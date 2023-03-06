package com.ssmbrokerservice.rest_clients.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDataInputView {

    private String userName;

    private String password;

    private String userUuid;

}
