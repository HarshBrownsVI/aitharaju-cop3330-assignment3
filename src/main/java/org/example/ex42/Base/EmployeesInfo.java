package org.example.ex42.Base;

public class EmployeesInfo
{
    // Create fields first name, last name, and salary
    // Create a constructor for the employee info
    // Create getter and setter methods
    // Create a toString to print out the resulting data
    String firstName;
    String lastName;
    String salary;
    public EmployeesInfo(String lastName, String firstName, String salary)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeesInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
