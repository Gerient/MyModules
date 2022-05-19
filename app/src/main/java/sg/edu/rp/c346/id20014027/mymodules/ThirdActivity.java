package sg.edu.rp.c346.id20014027.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvModule2 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String moduleC382 = intentReceived.getStringExtra("class2");
        tvModule2.setText(moduleC382);

    }
}