package com.company.Lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Список сотрудников старше 40 лет и их данные:");

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Manager", "ivanovi90@mail.ru", "89148523645", 50000, 45);
        empArray[1] = new Employee("Dudkina Irina", "QA", "irina56789@mail.ru", "+72564523315", 60000, 28);
        empArray[2] = new Employee("Petrov Pavel", "Team lead", "pavellead111@gmail.com", "9140235548", 80000, 35);
        empArray[3] = new Employee("Shishova Elizaveta", "DevOps", "SEdev@bank.ru", "9992547710", 100000, 41);
        empArray[4] = new Employee("Subbotkin Vasilii", "Support Manager", "SubSupport331@inbox.ru", "83654281155", 40000, 50);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].info();
            }
        }
    }
}
