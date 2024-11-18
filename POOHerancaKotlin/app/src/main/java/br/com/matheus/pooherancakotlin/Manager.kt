package br.com.matheus.pooherancakotlin

class Manager : Employee {

    private var commission: Double? = null
    private var totalEmployees: Int? = null

    constructor(
        name: String,
        salary: Double,
        admissionDate: String,
        commission: Double,
        totalEmployees: Int
    ) : super(name, salary, admissionDate) { // Chama o construtor de `Employee`
        this.commission = commission
        this.totalEmployees = totalEmployees
    }

    fun getCommission(): Double {
        return commission ?: throw IllegalArgumentException("A comissão não pode ser nula")
    }

    fun setCommission(commission: Double?) {
        this.commission = commission
    }

    fun getTotalEmployees(): Int {
        return totalEmployees ?: throw IllegalArgumentException("O total de funcionários não pode ser nulo")
    }

    fun setTotalEmployees(totalEmployees: Int) {
        this.totalEmployees = totalEmployees
    }
}
