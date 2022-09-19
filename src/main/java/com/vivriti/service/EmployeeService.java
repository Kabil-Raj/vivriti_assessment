package com.vivriti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivriti.custom.exception.EmployeeNotFoundException;
import com.vivriti.model.Employee;
import com.vivriti.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository empRepo;

    public Employee empRegistration(Employee emp) {
        return empRepo.save(emp);
    }

    public Employee empDetailsUpdate(int userId, String fName) throws EmployeeNotFoundException {
        Employee emp = findEmp(userId); 
        emp.setFirstName(fName);
        return empRepo.save(emp);
    }

    public String empDetailsUpdate(int userId) throws EmployeeNotFoundException {
        Employee emp = findEmp(userId);        
        empRepo.delete(emp);
        return "User Deleted Successfully";
    }

    public List<Employee> employeeList() {
        return empRepo.findAll();
    }
    
    public Employee findEmp(int userId) throws EmployeeNotFoundException {
       if ( empRepo.findById(userId).isEmpty() ) {
           throw new EmployeeNotFoundException();
       }
       return empRepo.findById(userId).get();
    }

}
