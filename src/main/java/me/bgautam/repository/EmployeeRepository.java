package me.bgautam.repository;

import me.bgautam.entity.Employee;

import java.util.List;

/**
 * Created by bishalgautam on 6/21/17.
 */

public interface EmployeeRepository {
    List<Employee> findAll();

    Employee findOne(String empId);

    Employee findByEmail(String email);

    Employee create (Employee emp);

    Employee update (Employee emp);

    void delete (Employee emp);

}
