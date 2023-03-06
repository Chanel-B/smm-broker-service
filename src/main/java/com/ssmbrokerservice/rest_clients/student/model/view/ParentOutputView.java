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
public class ParentOutputView {

  private UUID uuid;
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String citizenship;
  private String birthPlace;
  private String birthCountry;
  private String phoneNumber;
  private String documentNumber;
  //  private List<StudentOutputView> students;
}
