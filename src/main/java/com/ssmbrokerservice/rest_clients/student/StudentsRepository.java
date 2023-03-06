package com.ssmbrokerservice.rest_clients.student;

import com.ssmbrokerservice.rest_clients.student.model.view.AbstractStudentOutputView;
import com.ssmbrokerservice.rest_clients.student.model.view.StudentInputView;
import com.ssmbrokerservice.rest_clients.student.model.view.StudentOutputView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentsRepository {


    @GetMapping("/")
    List<StudentOutputView> getAllStudents();

    @GetMapping("/{studentUuid}")
    StudentOutputView getStudent(@PathVariable(value = "studentUuid") String studentId);

    @GetMapping("/studentByFirstName/{studentFirstName}")
    List<StudentOutputView> getStudentByFirstName(@PathVariable(value = "studentFirstName") String studentFirstName);

    @GetMapping("/studentByLastName/{studentLastName}")
    List<StudentOutputView> getStudentByLastName(
            @PathVariable(value = "studentLastName") String studentLastName);

    @GetMapping("/studentByAge/{studentAge}")
    List<StudentOutputView> getStudentByAge(@PathVariable(value = "studentAge") int studentAge)
            throws Exception;

    @GetMapping("/studentByClass/{studentClass}")
    List<StudentOutputView> getStudentByClass(
            @PathVariable(value = "studentClass") String studentClass);

    @PostMapping("/")
    AbstractStudentOutputView saveStudent(@RequestBody StudentInputView studentInputView);

    @DeleteMapping("/{studentUuid}")
    ResponseEntity<Void> deleteStudent(@PathVariable(value = "studentUuid") String studentUuid);

    @PutMapping("/{studentUuid}")
    ResponseEntity<Void> updateStudentData(@PathVariable(value = "studentUuid") String studentUuid, @RequestBody StudentInputView studentInputView);

}
