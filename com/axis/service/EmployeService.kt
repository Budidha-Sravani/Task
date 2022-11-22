package com.axis.service

import com.axis.modal.Employe
//in service call we write the business logic
class EmployeService {

    /*
        description: this method is used to display employee details
        param : It takes employee objects are param
        returns : It returns unit
     */
    fun displayEmployeDetails(employe: Employe)
    {
        println("====employe info======")
        println("id = ${employe.id}")
        println("name = ${employe.name}")
        println("salary =${employe.salary}")
    }
    /*
        to find perday salary
     */
    fun perDaySalary(employe: Employe):Int
    {
        return employe.salary/30
    }
    fun increaseSalaryByTenPercentage(employe: Employe):Double
    {
        var incrementedSalary = employe.salary*0.10
        println("10 % salary is $incrementedSalary")
        return incrementedSalary+employe.salary
    }
}