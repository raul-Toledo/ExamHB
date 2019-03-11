package com.example.examhb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnResult;
    TextView txvResult;
    EditText edtSenc, edtDou, edtTri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button)findViewById(R.id.btnCalcular);
        txvResult = (TextView)findViewById(R.id.txvTotal);
        edtDou = (EditText)findViewById(R.id.edtDoble);
        edtSenc = (EditText)findViewById(R.id.edtSencilla);
        edtTri = (EditText)findViewById(R.id.edtTriple);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer intSenc =0, intDou = 0, intTrip=0, intTotal=0;
                String strTotal="";
                intSenc= Integer.valueOf(edtSenc.getText().toString());
                intDou = Integer.valueOf(edtDou.getText().toString());
                intTrip = Integer.valueOf(edtTri.getText().toString());

                intTotal = (intSenc * 35) + (intDou * 45) + (intTrip * 50);
                strTotal = "$" + intTotal;
                txvResult.setText(strTotal);
                edtDou.setText("");
                edtSenc.setText("");
                edtTri.setText("");
            }
        });

    }
}
