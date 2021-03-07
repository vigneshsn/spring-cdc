package com.vigneshsn.springdemoproducer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable String employeeId) {
        return new Employee("1", "foo");
    }
}
