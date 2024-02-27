package com.app.dto;

import java.util.List;

import lombok.Data;

//DepartmentDTO.java
@Data
public class DepartmentDTO {

 private Long id;
 private String departmentName;
 private List<Long> employeeIds;
}
