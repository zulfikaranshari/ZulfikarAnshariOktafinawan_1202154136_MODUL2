package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String mejaLabel = "";
    @Override
    protected void onCreate  (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        viewSpinner();

    }

    public void viewSpinner(){
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);

        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> dataAdapter = ArrayAdapter.createFromResource(this, R.array.mejaArray, android.R.layout.simple_spinner_item);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(dataAdapter);
        }
    }


   @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mejaLabel = adapterView.getItemAtPosition(i).toString();

        String notice = mejaLabel+" telah dipilih";
        Toast toast = Toast.makeText(this, notice, Toast.LENGTH_LONG);
        toast.show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast noSelected = Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG);
        noSelected.show();
    }

    public void dineInOrder(View view) {
        Intent intent = new Intent(this, MenuList.class);


        startActivity(intent);
    }
}
