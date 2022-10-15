package com.olegsazonov.springboot.spring_boot_rest_test.service;

import com.olegsazonov.springboot.spring_boot_rest_test.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

//    void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}