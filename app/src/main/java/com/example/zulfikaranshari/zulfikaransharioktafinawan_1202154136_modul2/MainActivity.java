package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(this, "Zulfikar Anshari Oktafinawan_1202154136", Toast.LENGTH_LONG);
        toast.show();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void selectOrder(View view) {
        //int selectedRadio = radio.getCheckedRadioButtonId();
        RadioButton dinein = (RadioButton) findViewById(R.id.dinein);
        RadioButton takeaway = (RadioButton) findViewById(R.id.takeaway);

        //mengecek radio button mana yg di cek
        if(dinein.isChecked()){
            Intent dineIn = new Intent(this,DineInActivity.class);
            Toast here = Toast.makeText(this, "Dine In selected", Toast.LENGTH_LONG);
            here.show();
            startActivity(dineIn);
        }else if (takeaway.isChecked()){
            Intent takeAway = new Intent(this,TakeAwayActivity.class);
            Toast takehome = Toast.makeText(this, "Take Away selected", Toast.LENGTH_LONG);
            takehome.show();
            startActivity(takeAway);
        }else{
            Toast noSelected = Toast.makeText(this, "Nothing selected", Toast.LENGTH_SHORT);
            noSelected.show();
        }

    }
}
