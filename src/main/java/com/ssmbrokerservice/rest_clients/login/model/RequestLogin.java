package com.ssmbrokerservice.rest_clients.login.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonPropertyOrder(
        value = {
                "userName",
                "password",
                "userUuid"
        }
)
public class RequestLogin {

    private String userName;

    private String password;

    private String userUuid;

}
