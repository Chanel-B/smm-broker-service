package com.ssmbrokerservice.rest_clients.student.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentOutputView {

  private UUID uuid;
  private int age;
  private String firstName;
  private String lastName;
  private String classRoom;
  private LocalDate birthDate;
  private String citizenship;
  private String birthPlace;
  private String birthCountry;
  private String phoneNumber;
  private String registrationNumber;
//  private List<ParentOutputView> parents;
}
