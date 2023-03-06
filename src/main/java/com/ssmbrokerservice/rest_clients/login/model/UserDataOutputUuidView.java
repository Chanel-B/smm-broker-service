package com.ssmbrokerservice.rest_clients.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.jackson.JsonComponent;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@JsonComponent(
        value = "userUuid"
)
public class UserDataOutputUuidView {
  private String userUuid;
}
