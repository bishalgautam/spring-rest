package me.bgautam.service;

import me.bgautam.entity.Employee;
import me.bgautam.exception.BadRequestException;
import me.bgautam.exception.ResourceNotFoundException;
import me.bgautam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bishalgautam on 6/21/17.
 */
@Service

public class EmployeeServiceImp implements  EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee findOne(String empId) {
        Employee existing = repository.findOne(empId);

        if(existing == null){
            // 404
            throw new ResourceNotFoundException("No Employee with  empId" + empId  + " found");
        }

        return existing;
    }
    @Transactional
    public Employee create(Employee emp) {
        Employee existing = repository.findByEmail(emp.getEmail());

        if(existing != null){
            // 404
            throw new BadRequestException("Employee with email " + emp.getEmail() + "already exists");
        }

        return repository.create(emp);
    }
    @Transactional
    public Employee update(String empId, Employee emp) {
        Employee existing = repository.findOne(empId);

        if(existing == null){
            throw new ResourceNotFoundException("No Employee with  empId" + empId  + " found");
        }

        return repository.update(emp);
    }
    @Transactional
    public Employee delete(String empId) {
        Employee existing = repository.findOne(empId);

        if(existing == null){
            // 404
            throw new ResourceNotFoundException("No Employee with  empId" + empId  + " found");
        }

        repository.delete(existing);
        return existing;
    }
}
