package com.company;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String tensanpham;
    private String hangsanxuat;
    private int gia;
    private String motakhac;

    public  Product(){

    }

    public Product(int id, String tensanpham, String hangsanxuat, int gia, String motakhac) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.hangsanxuat = hangsanxuat;
        this.gia = gia;
        this.motakhac = motakhac;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMotakhac() {
        return motakhac;
    }

    public void setMotakhac(String motakhac) {
        this.motakhac = motakhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tensanpham='" + tensanpham + '\'' +
                ", hangsanxuat='" + hangsanxuat + '\'' +
                ", gia=" + gia +
                ", motakhac='" + motakhac + '\'' +
                '}';
    }
}
