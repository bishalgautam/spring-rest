package me.bgautam.service;

import me.bgautam.entity.Employee;
import java.util.List;

/**
 * Created by bishalgautam on 6/21/17.
 */

public interface EmployeeService {

    List<Employee> findAll();

    Employee findOne(String empId);

    Employee create (Employee emp);

    Employee update (String id, Employee emp);

    Employee delete (String empId);


}
