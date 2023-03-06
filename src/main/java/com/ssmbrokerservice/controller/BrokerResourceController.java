package com.ssmbrokerservice.controller;


import com.ssmbrokerservice.rest_clients.login.LoginRestService;
import com.ssmbrokerservice.rest_clients.login.model.RequestLogin;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputUuidView;
import com.ssmbrokerservice.service.RestFullServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@Controller
@RequestMapping("/v1/broker")
public class BrokerResourceController implements RestFullServices {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoginRestService loginService;

    @Override
    public ResponseEntity<UserDataOutputUuidView> loginFromLoginService(@RequestBody RequestLogin loginData) throws Exception {
        String uname = loginData.getUserName();
        String pass = loginData.getPassword();

       UserDataOutputUuidView userDataOutputUuidView = loginService.userLogin(uname, pass);
        System.err.println(userDataOutputUuidView.getUserUuid() + " pass : " +pass+ " , uname : " + uname );

        return ResponseEntity.ok(UserDataOutputUuidView.builder().userUuid(userDataOutputUuidView.getUserUuid()).build());
    }

}
