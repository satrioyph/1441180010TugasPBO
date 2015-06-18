package com.work3;

/**
 * Created by satrio yudha on 18/06/2015.
 */
public class TestATM {
    public static void main(String[] args) {
//      buat objek rekening

        Rekening aa = new Rekening (2000000.0);
        Nasabah bb = new Nasabah("Satrio","Gresik");
        System.out.println(bb.toString());
        bb.setRekeningNasabah(aa);
        System.out.println(bb.toString());

//tarik saldo sebesar 10 juta
        aa.tarik(10000000.0);
//tampilkan saldo sekarang
        System.out.println("Tarik sebesar 10.000.000");
        System.out.println("Saldo anda sekarang = " +aa.getSaldoRekening());
//setor saldo sebesar 5 juta
        aa.setor(5000000.0);
//tampilkan saldo sekarang
        System.out.println("Menabung sebesar Rp. 5.000.000");
        System.out.println("Saldo anda sekarang =" +aa.getSaldoRekening());
    }

}
