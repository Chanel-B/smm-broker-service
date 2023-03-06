package com.ssmbrokerservice.service;

import com.ssmbrokerservice.rest_clients.login.model.RequestLogin;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputUuidView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin("*")
public interface RestFullServices {
  @RequestMapping(method = RequestMethod.POST, value = "/loginUser")
  ResponseEntity<UserDataOutputUuidView> loginFromLoginService(RequestLogin requestLogin)
      throws Exception;
}
