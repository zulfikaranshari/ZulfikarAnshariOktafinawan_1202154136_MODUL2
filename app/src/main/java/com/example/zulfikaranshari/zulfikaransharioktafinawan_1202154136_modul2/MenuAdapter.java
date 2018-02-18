package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zulfikaranshari on 18/02/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private LayoutInflater mInflatter;
    MenuAdapter mAdapter;

    private ArrayList<menuModel> menuList;
    public MenuAdapter(ArrayList<menuModel> menu){
        this.menuList=menu;

    }

    class MenuViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView nama, harga;


        public MenuViewHolder(View view){

            super(view);

            image = (ImageView) view.findViewById(R.id.imgMenu);
            nama = (TextView) view.findViewById(R.id.namaMenu);
            harga = (TextView) view.findViewById(R.id.harga);
        }
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mInflatter = LayoutInflater.from(parent.getContext());
        View itemView = mInflatter.inflate(R.layout.activity_menu_items, parent, false);
        return new MenuViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        menuModel menu = menuList.get(position);
        holder.image.setImageResource(menu.getGambar());

        holder.nama.setText(menu.getNama());
        holder.harga.setText(menu.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), DetailMenu.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return menuList.size();

    }



}
