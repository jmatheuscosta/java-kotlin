package br.com.matheus.pooheranca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtEmployeeName;
    TextView txtEmployeeSalary;
    TextView txtEmployeeAdmissionDate;

    TextView txtManagerName;
    TextView txtManagerSalary;
    TextView txtManagerCommission;
    TextView txtManagerTotalEmployees;
    TextView txtManagerAdmissionDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        startEmployee();
        createEmployee();

        startManager();
        createManager();

    }

    private void startEmployee() {

        txtEmployeeName = findViewById(R.id.txtEmployeeName);
        txtEmployeeSalary = findViewById(R.id.txtEmployeeSalary);
        txtEmployeeAdmissionDate = findViewById(R.id.txtEmployeeAdmissionDate);

    }

    private void createEmployee() {

        Employee Employee = new Employee();

        Employee.setName("jOSE");
        Employee.setAdmissionDate("20/10/2024");
        Employee.setSalary(1350.0);


        txtEmployeeName.setText(Employee.getName());
        txtEmployeeAdmissionDate.setText(Employee.getAdmissionDate());
        txtEmployeeSalary.setText(String.valueOf(Employee.getSalary()));

    }

    private void startManager() {

        txtManagerName = findViewById(R.id.txtManagerName);
        txtManagerSalary = findViewById(R.id.txtManagerSalary);
        txtManagerCommission = findViewById(R.id.txtManagerCommission);
        txtManagerTotalEmployees = findViewById(R.id.txtManagerTotalEmployees);
        txtManagerAdmissionDate = findViewById(R.id.txtManagerAdmissionDate);

    }

    private void createManager() {

        Manager Manager = new Manager();

        Manager.setName("Matheus");
        Manager.setSalary(2500.0);
        Manager.setCommission(15.0);
        Manager.setTotalEmployees(20);
        Manager.setAdmissionDate("20/07/1999");

        txtManagerName.setText(Manager.getName());
        txtManagerSalary.setText(String.valueOf(Manager.getSalary()));
        txtManagerCommission.setText(String.valueOf(Manager.getCommission()));
        txtManagerTotalEmployees.setText(String.valueOf(Manager.getTotalEmployees()));
        txtManagerAdmissionDate.setText(Manager.getAdmissionDate());

    }

}