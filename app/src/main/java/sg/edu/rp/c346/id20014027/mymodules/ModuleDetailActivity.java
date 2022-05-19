package sg.edu.rp.c346.id20014027.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModuleCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAY);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewMC);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");

        if(moduleCode.equals("C382")){
            tvModuleCode.setText("Module Code: C382");
            tvModuleName.setText("Module Name: IT Delivery Service");
            tvAcademicYear.setText("Academic Year: 2022");
            tvSemester.setText("Semester: 1");
            tvModuleCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62B");
        }
        else if(moduleCode.equals("C322")){
            tvModuleCode.setText("Module Code: C322");
            tvModuleName.setText("Module Name: Data Centre and Cloud Mgmt");
            tvAcademicYear.setText("Academic Year: 2022");
            tvSemester.setText("Semester: 1");
            tvModuleCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E61H");
        }
        else{
            tvModuleCode.setText("Module Code: C346");
            tvModuleName.setText("Module Name: Mobile App Development");
            tvAcademicYear.setText("Academic Year: 2022");
            tvSemester.setText("Semester: 1");
            tvModuleCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62E");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}