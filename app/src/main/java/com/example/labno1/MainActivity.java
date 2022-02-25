package com.example.labno1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextTextPersonName);
        textView=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=editText.getText().toString();
                editText.setText(user);
                textView.setText(" Welcome to Andriod Development ");
                Toast.makeText(MainActivity.this, "Asalam o Alaikum Mr "+user, Toast.LENGTH_SHORT).show();
            }
        });
    }
}