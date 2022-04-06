package com.company.Lesson5;

public class Employee {

    private String fullName;
    private String occupation;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String occupation, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {return fullName;}

    public String getOccupation() {return occupation;}

    public String getEmail() {return email;}

    public String getPhoneNumber() {return phoneNumber;}

    public int getSalary() {return salary;}

    public int getAge() {return age;}

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}


