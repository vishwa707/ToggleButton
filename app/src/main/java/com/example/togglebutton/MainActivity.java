package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tb;
    private Switch s;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.tb);
        s = findViewById(R.id.switch1);
        b = findViewById(R.id.button);

        addListenerOnButtonClick();

    }

    private void addListenerOnButtonClick() {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder res = new StringBuilder();
                res.append("Toggle Button: ").append(tb.getText());
                Toast.makeText(MainActivity.this, res.toString(), Toast.LENGTH_SHORT).show();
                Boolean s2 = s.isChecked();
                if(s2) {
                    Toast.makeText(MainActivity.this, "Switch:ON", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Switch:OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}