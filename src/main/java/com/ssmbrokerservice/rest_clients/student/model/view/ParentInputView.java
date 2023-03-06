package com.ssmbrokerservice.rest_clients.student.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParentInputView {

  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String citizenship;
  private String birthPlace;
  private String birthCountry;
  private String phoneNumber;
  private String documentNumber;
  private String studentId;

}
