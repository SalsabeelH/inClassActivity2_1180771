package birzeit.edu.inclassactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtSalary;
    private Button btnAdd;
    private Spinner spinner;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtSalary = findViewById(R.id.txtSalary);
        btnAdd = findViewById(R.id.btnAdd);
        spinner = findViewById(R.id.spinner);
        list = findViewById(R.id.listView);

        String[] options = { "Full Time", "Part Time" };
        ArrayAdapter<String> objWorkTimeArr = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, options);
        spinner.setAdapter(objWorkTimeArr);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee employee = new Employee();
                employee.setName(txtName.getText().toString());
                employee.setSalary(Integer.parseInt(txtSalary.getText().toString()));
                TextView employeeData = new TextView(MainActivity.this);
                employeeData.setText(employee.toString());
                list.addView(employeeData);
            }
        });


    }


}