package com.ssmbrokerservice.rest_clients.login;

import com.ssmbrokerservice.rest_clients.login.model.UserDataAbstractView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataInputView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputUuidView;
import com.ssmbrokerservice.rest_clients.login.model.UserDataOutputView;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LoginRepository {

    List<UserDataOutputView> getAllUserLoginData();

    UserDataOutputUuidView userLogin(String userName, String userPassword) throws Exception;

    UserDataOutputView getUserLoginDetails(String userUuid) throws Exception;

    ResponseEntity<UserDataAbstractView> saveUserData(UserDataInputView userData) throws Exception;

    String updateUserData(UserDataInputView userData, String userUuid) throws Exception;

    String deleteUserData(String userUuid) throws Exception;

}
