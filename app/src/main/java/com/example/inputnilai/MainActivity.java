package com.example.inputnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNama, etNim, etNilai;
    private Button btnHasil;
    private TextView tvNama, tvNim, tvNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHasil = findViewById(R.id.btn_hasil);
        etNama = findViewById(R.id.et_nama);
        etNim = findViewById(R.id.et_nim);
        etNilai = findViewById(R.id.et_nilai);
        tvNama = findViewById(R.id.tv_nama);
        tvNim = findViewById(R.id.tv_nim);
        tvNilai = findViewById(R.id.tv_nilai);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sNama = etNama.getText().toString();
                    String sNim = etNim.getText().toString();
                    String sNilai = etNilai.getText().toString();

                    Double dNilai = Double.parseDouble(sNilai);
                    if (dNilai>3.66 && dNilai<=4.00){
                        sNilai = "A";
                    }else if (dNilai>3.33 && dNilai<=3.66){
                        sNilai = "A-";
                    }else if (dNilai>3.00 && dNilai<=3.33){
                        sNilai = "B+";
                    }else if(dNilai>2.66 && dNilai<=3.00){
                        sNilai = "B";
                    }else if (dNilai>2.33 && dNilai<=2.66){
                        sNilai = "B-";
                    }else if (dNilai>2.00 && dNilai<=2.33){
                        sNilai = "C+";
                    }else if (dNilai>1.66 && dNilai<=2.00){
                        sNilai = "C";
                    }else if (dNilai>1.33 && dNilai<=1.66){
                        sNilai = "C-";
                    }else if (dNilai>1.00 && dNilai<=1.33){
                        sNilai = "D+";
                    }else if (dNilai==1.00){
                        sNilai = "D";
                    }
                    tvNama.setText(sNama);
                    tvNim.setText(sNim);
                    tvNilai.setText(sNilai);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}