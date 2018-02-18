package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MenuList extends AppCompatActivity {
    private ArrayList<menuModel> menuList;

    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        menuList = addMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new MenuAdapter(menuList);
        recyclerView.setAdapter(mAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //method untuk menambahkan data ke dalam ArrayList
    public ArrayList<menuModel> addMenu(){
        ArrayList<menuModel> data = new ArrayList<>();
        data.add(new menuModel(R.drawable.martabak, "Martabak", "2000", "Martabak telor special" ));
        data.add(new menuModel(R.drawable.kwetiau, "Kwetiau", "25000", "Kwetiau asli jawab"));
        data.add(new menuModel(R.drawable.steak, "Steak", "20000", "Steak import dari Australia"));

        return data;
    }
}
