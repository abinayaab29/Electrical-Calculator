package com.example.electricalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ampstovolts extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7;
    Button b1, b2;
    EditText ed1, b;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampstovolts);

        t1 = (TextView) findViewById(R.id.type);
        t2 = (TextView) findViewById(R.id.v1);
        t3 = (TextView) findViewById(R.id.v2);
        t4 = (TextView) findViewById(R.id.res1);

        sp = (Spinner) findViewById(R.id.sp1);
        ed1 = (EditText) findViewById(R.id.ed);
        b = (EditText) findViewById(R.id.ed2);
        b1 = (Button) findViewById(R.id.amp_kw);
        b2 = (Button) findViewById(R.id.reset);
        t6 = (TextView) findViewById(R.id.ans1);


        String[] from = {"single phase", "three phase"};
        ArrayAdapter a = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp.setAdapter(a);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double t, m;
                Double c = Double.parseDouble(ed1.getText().toString());
                Double d = Double.parseDouble(b.getText().toString());

                if (sp.getSelectedItem().toString() == "single phase") {
                    t = (c / d);
                    m = c * d;
                    String ans = Double.toString(t);
                    //String ans1 = Double.toString(m);
                    t6.setText(ans);
                    //t7.setText(ans1);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(" ");
                b.setText(" ");
            }});

    }
}