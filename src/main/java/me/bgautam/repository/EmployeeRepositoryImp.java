package me.bgautam.repository;

import me.bgautam.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by bishalgautam on 6/21/17.
 */

@Repository
public class EmployeeRepositoryImp implements  EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> findAll() {

        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findAll", Employee.class);

        List<Employee> resultList = query.getResultList();

        return resultList;

    }

    public Employee findOne(String empId) {
        return entityManager.find(Employee.class, empId);
    }

    public Employee findByEmail(String email){
        TypedQuery<Employee>  query = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);
        query.setParameter("paramEmail", email );
        List<Employee> result = query.getResultList();
        if( result != null && result.size() == 1)
            return result.get(0);
        else
            return null;

    }
    public Employee create(Employee emp) {
        entityManager.persist(emp);
        return emp;
    }

    public Employee update(Employee emp) {
        return entityManager.merge(emp);
    }

    public void delete(Employee emp) {
         entityManager.remove(emp);
    }
}
