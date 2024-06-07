package org.example.lesson_2

fun main() {
    val employeesCount = 50
    val employeesSalary = 30_000
    val traineesCount = 20
    val traineesSalary = 20_000

    val employeesPayments = employeesCount * employeesSalary
    val traineesPayments = traineesCount * traineesSalary
    val totalPayments = employeesPayments + traineesPayments
    val averageSalary = (employeesPayments + traineesPayments) / (employeesCount + traineesCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeesPayments")
    println("Общие расходы по ЗП после прихода стажеров: $totalPayments")
    println("Средня ЗП одного сотрудника после устройства стажеров: $averageSalary")
}