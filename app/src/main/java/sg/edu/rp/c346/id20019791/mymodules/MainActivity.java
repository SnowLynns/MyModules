package sg.edu.rp.c346.id20019791.mymodules;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvandroid;
    TextView tvapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvandroid = findViewById(R.id.tvAndroid);
        tvapple = findViewById(R.id.tvApple);

        tvandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value","Module Code: C346\n Module Name: Android Programming\n Academic Year:2020\n Semester: 1\n Module Credit:\4 Venue: W668" );
                startActivity(intent);
            }
        });
        tvapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value","Module Code: C349\n Module Name: iPad Programming\n Academic Year:2020\n Semester: 1\n Module Credit:\4 Venue: W67L" );
                startActivity(intent);
            }
        });
    }
}