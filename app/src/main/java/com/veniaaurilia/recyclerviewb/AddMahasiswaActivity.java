package com.veniaaurilia.recyclerviewb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddMahasiswaActivity extends AppCompatActivity {
    private Button _saveButton;
    private EditText _alamatEditText, _namaEditText ,_tahunMasukEditText, _tanggalLahirEditText , _nimEditText;
    private EditText _tempatLahirEditText;
    private Spinner _jenisKelaminSpinner,_jpSpinner,_statusNikahSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mahasiswa);
        

        initSaveButton();
    }

    private void initSaveButton() {
        _saveButton = findViewById(R.id.saveButton);
        _saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alamat = _alamatEditText.getText().toString();
                String jenisKelamin = _jenisKelaminSpinner.getSelectedItem().toString();
                String jp =_jpSpinner.getSelectedItem().toString();
                String nama =_namaEditText.getText().toString();
                String nim = _nimEditText.getText().toString();



            }
        });
    }
}