package me.bgautam.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by bishalgautam on 6/22/17.
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "Employee.findAll" ,
                query = "SELECT emp from Employee emp ORDER BY emp.firstName ASC") ,

        @NamedQuery(name = "Employee.findByEmail" ,
                query= "SELECT emp from Employee emp WHERE emp.email = :paramEmail")
})
public class Employee {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Column(unique = true)
    private String email;

    public Employee(){
        this.id = UUID.randomUUID()
                .toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
