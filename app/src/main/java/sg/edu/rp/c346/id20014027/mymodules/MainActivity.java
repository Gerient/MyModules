package sg.edu.rp.c346.id20014027.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1;
    TextView tvModule2;
    TextView tvModule3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textView382);
        tvModule2 = findViewById(R.id.textView322);
        tvModule3 = findViewById(R.id.textView346);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("ModuleCode", "C382");
                startActivity(i);
            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("ModuleCode", "C322");
                startActivity(i);
            }
        });

        tvModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("ModuleCode", "C346");
                startActivity(i);
            }
        });

    }
}