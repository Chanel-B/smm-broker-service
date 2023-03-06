package com.ssmbrokerservice.rest_clients.student;

import com.ssmbrokerservice.rest_clients.student.model.view.AbstractStudentOutputView;
import com.ssmbrokerservice.rest_clients.student.model.view.StudentInputView;
import com.ssmbrokerservice.rest_clients.student.model.view.StudentOutputView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class StudentRestService implements StudentsRepository {

    @Autowired
    private RestTemplate restTemplate;

    private final String BASE_PATH = "http://localhost:8060/v1/students";
    private final String SAVE_STUDENT_PATH = BASE_PATH + "/";
    private final String UPDATE_STUDENT_PATH = BASE_PATH + "/{studentUuid}";
    private final String BASE_GET_ALL_STUDENT_PATH = BASE_PATH + "/";
    private final String GET_STUDENT_BY_UUID = BASE_PATH + "/{studentUuid}";
    private final String DELETE_STUDENT_BY_UUID = BASE_PATH + "/{studentUuid}";
    private final String GET_STUDENT_BY_FIRST_NAME = BASE_PATH + "/studentByFirstName/{studentFirstName}";
    private final String GET_STUDENT_BY_LAST_NAME = BASE_PATH + "/studentByLastName/{studentLastName}";
    private final String GET_STUDENT_BY_AGE = BASE_PATH + "/studentByAge/{studentAge}";
    private final String GET_STUDENTS_BY_CLASS = BASE_PATH + "/studentByClass/{studentClass}";

    @Override
    public List<StudentOutputView> getAllStudents() {
        ResponseEntity<StudentOutputView[]> outputResponse = restTemplate.getForEntity(BASE_GET_ALL_STUDENT_PATH, StudentOutputView[].class);
        return outputResponse.getBody() == null ? List.of() : List.of(outputResponse.getBody());
    }

    @Override
    public StudentOutputView getStudent(String studentId) {
        ResponseEntity<StudentOutputView> outputResponse = restTemplate.getForEntity(GET_STUDENT_BY_UUID, StudentOutputView.class, studentId);
        return outputResponse.getBody();
    }

    @Override
    public List<StudentOutputView> getStudentByFirstName(String studentFirstName) {
        ResponseEntity<StudentOutputView[]> outputResponse = restTemplate.getForEntity(GET_STUDENT_BY_FIRST_NAME, StudentOutputView[].class, studentFirstName);
        return outputResponse.getBody() == null ? List.of() : List.of(outputResponse.getBody());
    }

    @Override
    public List<StudentOutputView> getStudentByLastName(String studentLastName) {
        ResponseEntity<StudentOutputView[]> outputResponse = restTemplate.getForEntity(GET_STUDENT_BY_LAST_NAME, StudentOutputView[].class, studentLastName);
        return outputResponse.getBody() == null ? List.of() : List.of(outputResponse.getBody());
    }

    @Override
    public List<StudentOutputView> getStudentByAge(int studentAge) {
        ResponseEntity<StudentOutputView[]> outputResponse = restTemplate.getForEntity(GET_STUDENT_BY_AGE, StudentOutputView[].class, studentAge);
        return outputResponse.getBody() == null ? List.of() : List.of(outputResponse.getBody());
    }

    @Override
    public List<StudentOutputView> getStudentByClass(String studentClass) {
        ResponseEntity<StudentOutputView[]> outputResponse = restTemplate.getForEntity(GET_STUDENTS_BY_CLASS, StudentOutputView[].class, studentClass);
        return outputResponse.getBody() == null ? List.of() : List.of(outputResponse.getBody());
    }

    @Override
    public AbstractStudentOutputView saveStudent(StudentInputView studentInputView) {
        ResponseEntity<AbstractStudentOutputView> outputResponse = restTemplate.postForEntity(SAVE_STUDENT_PATH, studentInputView, AbstractStudentOutputView.class);
        return outputResponse.getBody();
    }

    @Override
    public ResponseEntity<Void> deleteStudent(String studentUuid) {
        restTemplate.delete(DELETE_STUDENT_BY_UUID, studentUuid);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> updateStudentData(String studentUuid, StudentInputView studentInputView) {
        restTemplate.put(UPDATE_STUDENT_PATH, studentInputView, studentUuid);
        return ResponseEntity.noContent().build();
    }
}
