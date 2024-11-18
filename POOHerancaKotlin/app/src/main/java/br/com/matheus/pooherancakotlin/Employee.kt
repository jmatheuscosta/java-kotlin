package br.com.matheus.pooherancakotlin

import java.sql.Date

open class Employee(
    private var name: String? = null,
    private var salary: Double? = null,
    private var admissionDate: String? = null
) {
    fun getName(): String {
        return name ?: throw IllegalArgumentException("o nome nao pode ser nulo")
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getAdmissionDate(): String {
        return admissionDate ?: throw IllegalArgumentException("a data de admissão não pode ser nula")
    }

    fun setAdmissionDate(admissionDate: String?) {
        this.admissionDate = admissionDate
    }

    fun getSalary(): Double {
        return salary ?: throw IllegalArgumentException("o salário não pode ser nulo")
    }

    fun setSalary(salary: Double) {
        this.salary = salary
    }
}
