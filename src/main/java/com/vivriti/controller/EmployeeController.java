package com.vivriti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivriti.custom.exception.EmployeeNotFoundException;
import com.vivriti.model.Employee;
import com.vivriti.repository.EmployeeRepository;
import com.vivriti.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository empRepo;
    
    @Autowired
    private EmployeeService empService;
    
    @PostMapping("/registration/")
    public Employee empRegistration(@RequestBody Employee emp) {
        return empService.empRegistration(emp);
    }
    
    @PatchMapping("/{userId}/{firstName}")
    public Employee empDetailsUpdate(@PathVariable("userId") int userId, @PathVariable("firstName") String fName) throws EmployeeNotFoundException {
        return empService.empDetailsUpdate(userId, fName);
    }
    
    @DeleteMapping("/delete/{userId}")
    public String empDetailsUpdate(@PathVariable("userId") int userId) throws EmployeeNotFoundException {
        return empService.empDetailsUpdate(userId);
    }  
    
    @GetMapping("/")
    public List<Employee> employeeList() {
        return empService.employeeList();
    }
    
    
    

}
