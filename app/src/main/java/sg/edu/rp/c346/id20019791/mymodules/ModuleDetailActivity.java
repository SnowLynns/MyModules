package sg.edu.rp.c346.id20019791.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("value");
        tvAnswer.setText(value);
    }
}
