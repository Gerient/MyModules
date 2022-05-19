package sg.edu.rp.c346.id20014027.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvModule1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvModule1 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String moduleC382 = intentReceived.getStringExtra("class1");
        tvModule1.setText(moduleC382);

    }
}