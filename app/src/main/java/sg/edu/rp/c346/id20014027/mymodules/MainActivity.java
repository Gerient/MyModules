package sg.edu.rp.c346.id20014027.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC382;
    TextView tvC322;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC382 = findViewById(R.id.textView382);
        tvC322 = findViewById(R.id.textView322);

        tvC382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("class1", "Module Code: C382 \nModule Name: IT Service Delivery " +
                        "\nAcademic Year: 2022 \nModule Credit: 4 \nVenue: W62B");
                startActivity(i);
            }
        });

        tvC322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                i.putExtra("class2", "Module Code: C322 \nModule Name: Data Centre and Cloud Mgmt " +
                        "\nAcademic Year: 2022 \nModule Credit: 4 \nVenue: W61H");
                startActivity(i);
            }
        });

    }
}