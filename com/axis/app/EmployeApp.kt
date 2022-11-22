package com.axis.app

import com.axis.modal.Employe
import com.axis.service.EmployeService
fun main(args: Array<String>) {
    println("===employe app====")
    var employe=Employe(1,"sourab",45000)
    var employeService=EmployeService()
    employeService.displayEmployeDetails(employe)
    println(" per day salary ${employeService.perDaySalary(employe)}")
    println("increase salary by 10% ${employeService.increaseSalaryByTenPercentage(employe)}")

}