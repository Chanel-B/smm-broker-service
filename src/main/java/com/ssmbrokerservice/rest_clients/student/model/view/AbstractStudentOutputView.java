package com.ssmbrokerservice.rest_clients.student.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbstractStudentOutputView {
    private String userUuid;
    private String registrationNumber;
}
