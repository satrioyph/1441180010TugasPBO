package com.work2;

/**
 * Created by satrio yudha on 11/06/2015.
 */
public class TestClass {

    public static void main(String[] args) {

        Aktor aktorSatu = new Aktor("Aliyando", "Bandung", 'L', "Pacaran", "Indonesia", 20, "Digo");

        aktorSatu.setUmurAktor(25);
        aktorSatu.setAlamatAktor("Jakarta");

        Sinetron ggs = new Sinetron("Ganteng Ganteng Serigala", "MD Entertainment", 2013, aktorSatu,"Setiap Hari");
        System.out.println("Nama Sinetron :" +ggs.getNamaSinetron());
        System.out.println("Rumah Produksi :" +ggs.getPhSinetron());
        System.out.println("Tahun Produksi :" +ggs.getTahunProduksi());
        System.out.println("Tayang Hari :" +ggs.getHariTayang());
        System.out.println(ggs.getPeranan());
    }

}
