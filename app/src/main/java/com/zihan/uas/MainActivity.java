package com.zihan.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNIK;
    EditText edNama;
    EditText edJam;

    TextView txtNIK;
    TextView txtNama;
    TextView txtPilihan;
    TextView txtJam;


    Button btnSimpan;
    Button btnTampil;
    Spinner spPilihan;
    String[] pilihan = {"A", "B" , "C", "D"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNIK = findViewById(R.id.editNIK);
        edNama = findViewById(R.id.editNama);
        edJam = findViewById(R.id.editJam);

        spPilihan = findViewById(R.id.spiPilihan);

        btnSimpan = findViewById(R.id.btnSimpan);
        btnTampil = findViewById(R.id.btnTampil);

        txtNIK = findViewById(R.id.setNIK);
        txtNama = findViewById(R.id.setNama);
        txtPilihan = findViewById(R.id.setPilihan);
        txtJam = findViewById(R.id.setJam);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, TampilActivity.class);
                startActivity(intent);
                if (spPilihan.getSelectedItem().toString().equals(pilihan[0])){
                    A();
                }else if (spPilihan.getSelectedItem().toString().equals(pilihan[1])){
                    B();
                }else if (spPilihan.getSelectedItem().toString().equals(pilihan[1])){
                    C();
                }else if (spPilihan.getSelectedItem().toString().equals(pilihan[1])){
                    D();
                }


            }

            public void D() {String nik = edNIK.getText().toString();
                String nama = edNama.getText().toString();
                String pilihan = spPilihan.getSelectedItem().toString();
                String jam = edJam.getText().toString();


                txtNIK.setText(nik);
                txtNama.setText(nama);
                txtPilihan.setText(pilihan);
                txtJam.setText(jam);
            }

            public void C() {
                String nik = edNIK.getText().toString();
                String nama = edNama.getText().toString();
                String pilihan = spPilihan.getSelectedItem().toString();
                String jam = edJam.getText().toString();


                txtNIK.setText(nik);
                txtNama.setText(nama);
                txtPilihan.setText(pilihan);
                txtJam.setText(jam);
            }

            public void B() {
                String nik = edNIK.getText().toString();
                String nama = edNama.getText().toString();
                String pilihan = spPilihan.getSelectedItem().toString();
                String jam = edJam.getText().toString();


                txtNIK.setText(nik);
                txtNama.setText(nama);
                txtPilihan.setText(pilihan);
                txtJam.setText(jam);
            }

            public void A() {
                String nik = edNIK.getText().toString();
                String nama = edNama.getText().toString();
                String pilihan = spPilihan.getSelectedItem().toString();
                String jam = edJam.getText().toString();


                txtNIK.setText(nik);
                txtNama.setText(nama);
                txtPilihan.setText(pilihan);
                txtJam.setText(jam);
            }
        });

    }
}
