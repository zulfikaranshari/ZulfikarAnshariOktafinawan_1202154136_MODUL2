package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TakeAwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //memulai aktivitas Menu List
        Intent intent = new Intent(this, MenuList.class);
        startActivity(intent);
    }
}
