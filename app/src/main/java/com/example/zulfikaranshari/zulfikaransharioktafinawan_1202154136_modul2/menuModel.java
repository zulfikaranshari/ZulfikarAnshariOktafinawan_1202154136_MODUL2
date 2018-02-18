package com.example.zulfikaranshari.zulfikaransharioktafinawan_1202154136_modul2;

/**
 * Created by zulfikaranshari on 18/02/2018.
 */


//class ini digunakan sebagai template model menu
public class menuModel {
    private int gambar;
    private String nama;

    private String harga;
    private String deskripsi;
    public menuModel(int gambar, String nama, String harga, String deskripsi){
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
