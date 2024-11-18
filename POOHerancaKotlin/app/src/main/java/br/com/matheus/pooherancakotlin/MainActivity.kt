package br.com.matheus.pooherancakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtEmployeeName: TextView
    lateinit var txtEmployeeSalary: TextView
    lateinit var txtEmployeeAdmissionDate: TextView

    lateinit var txtManagerName: TextView
    lateinit var txtManagerSalary: TextView
    lateinit var txtManagerCommission: TextView
    lateinit var txtManagerTotalEmployees: TextView
    lateinit var txtManagerAdmissionDate: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        startEmployee()
        createEmployee()

        startManager()
        createManager()

    }

    private fun startEmployee() {
        txtEmployeeName = findViewById(R.id.txtEmployeeName)
        txtEmployeeSalary = findViewById(R.id.txtEmployeeSalary)
        txtEmployeeAdmissionDate = findViewById(R.id.txtEmployeeAdmissionDate)
    }

    private fun createEmployee() {
        val employee = Employee(
            "Matheus",
            2500.0,
            "10/10/2020"

            )

        txtEmployeeName.setText(employee.getName())
        txtEmployeeSalary.setText(employee.getSalary().toString())
        txtEmployeeAdmissionDate.setText(employee.getAdmissionDate())

    }



    private fun startManager() {
        txtManagerName = findViewById(R.id.txtManagerName)
        txtManagerSalary = findViewById(R.id.txtManagerSalary)
        txtManagerCommission = findViewById(R.id.txtManagerCommission)
        txtManagerTotalEmployees = findViewById(R.id.txtManagerTotalEmployees)
        txtManagerAdmissionDate = findViewById(R.id.txtManagerAdmissionDate)
    }

    private fun createManager() {
        val manager = Manager(
            "Jose",
            7000.0,
            "20/07/1999",
            50.0,
            30
        )

        txtManagerName.setText(manager.getName())
        txtManagerSalary.setText(manager.getSalary().toString())
        txtManagerAdmissionDate.setText(manager.getAdmissionDate())
        txtManagerCommission.setText(manager.getCommission().toString())
        txtManagerTotalEmployees.setText(manager.getTotalEmployees().toString())
    }

}