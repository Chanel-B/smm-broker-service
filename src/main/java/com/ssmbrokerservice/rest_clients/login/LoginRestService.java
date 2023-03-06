package com.ssmbrokerservice.rest_clients.login;

import com.ssmbrokerservice.rest_clients.login.model.UserDataAbstractView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataInputView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputUuidView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputView;
import com.ssmbrokerservice.rest_clients.restUtils.UserUuidView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class LoginRestService implements LoginRepository{

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private CorsConfigurations webMvcConfigurations;

    private final String BASE_PATH = "http://localhost:8090/v1/login-services";
    private final String USER_LOGIN_PATH = BASE_PATH + "/{userName}/{userPassword}";
    private final String SAVE_USER_LOGIN_PATH = BASE_PATH + "";
    private final String UPDATE_USER_LOGIN_PATH = BASE_PATH + "/{userLoginUuid}";
    private final String GET_USER_LOGIN_DETAILS_PATH = BASE_PATH + "/{userLoginUuid}";

    @Override
    public List<UserDataOutputView> getAllUserLoginData() {
        ResponseEntity<UserDataOutputView[]> userUuidView = restTemplate.getForEntity(USER_LOGIN_PATH, UserDataOutputView[].class);
        return Arrays.asList(userUuidView.getBody());
    }

    @Override
    public UserDataOutputUuidView userLogin(String userName, String userPassword) {
        ResponseEntity<UserUuidView> userUuidView = restTemplate.getForEntity(USER_LOGIN_PATH, UserUuidView.class, userName, userPassword);
        return UserDataOutputUuidView.builder().userUuid(userUuidView.getBody().getUserUuid()).build();
    }

    @Override
    public UserDataOutputView getUserLoginDetails(String userUuid){
        ResponseEntity<UserDataOutputView> userData = restTemplate.getForEntity(GET_USER_LOGIN_DETAILS_PATH, UserDataOutputView.class, userUuid);
        return userData.getBody();
    }

    @Override
    public ResponseEntity<UserDataAbstractView> saveUserData(UserDataInputView userData) {
        ResponseEntity<UserDataAbstractView> userUuidView = restTemplate.postForEntity(SAVE_USER_LOGIN_PATH, userData, UserDataAbstractView.class);
        return userUuidView;
    }

    @Override
    public String updateUserData(UserDataInputView userData, String userUuid){
        restTemplate.put(UPDATE_USER_LOGIN_PATH, userData, userUuid);
        return "Updated with success:)";
    }

    @Override
    public String deleteUserData(String userUuid){
        String DELETE_USER_LOGIN_PATH = BASE_PATH + "/{userLoginUuid}";
        restTemplate.delete(DELETE_USER_LOGIN_PATH, userUuid);
        return "Deleted with success:)";
    }
}
