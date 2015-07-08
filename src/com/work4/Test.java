package com.work4;

/**
 * Created by satrio yudha on 24/06/2015.
 */
public class Test {
    public static void main(String[] args) {

        Liga japan = new Liga("Japan");
        Divisi jLeague1 = new Divisi("J League 1");
        Divisi jLeague2 = new Divisi("J League 2");

        Klub satu1 = new Klub("Gamba Osaka",jLeague1,japan);
        Klub satu2 = new Klub("Urawa Red",jLeague1,japan);
        Klub dua1 = new Klub("Namkatsu FC",jLeague2,japan);
        Klub dua2 = new Klub("Kawasaki Frontile",jLeague2,japan);

        japan.setDaftarDivisi(jLeague1);
        japan.setDaftarDivisi(jLeague2);

        japan.setDaftarKlub(satu1);
        japan.setDaftarKlub(satu2);
        japan.setDaftarKlub(dua1);
        japan.setDaftarKlub(dua2);

        jLeague1.setDaftarKlub(satu1);
        jLeague1.setDaftarKlub(satu2);
        jLeague2.setDaftarKlub(dua1);
        jLeague2.setDaftarKlub(dua2);

        System.out.println("1. Get daftar divisi by nama liga");
        System.out.println("Daftar Divisi dari J - League : " + japan.getDaftarDivisi());
        System.out.println("");

        System.out.println("2. Get daftar klub by nama liga");
        System.out.println("Daftar Klub dari J - League : " + japan.getDaftarKlub());
        System.out.println("");

        System.out.println("3. Get daftar klub by nama divisi");
        System.out.println("Daftar Klub dari Divisi J League 1 : " +jLeague1.getDaftarKlub());
        System.out.println("Daftar Klub dari Divisi J League 2 : " +jLeague2.getDaftarKlub());
        System.out.println("");

        System.out.println("4. Get klub ini berada di divisi mana by nama Klub");
        satu1.getNamaKlub();
        System.out.println("Klub                : " + satu1.getNamaKlub());
        System.out.println("Berada pada divisi  : " + satu1.getDivisi());
        System.out.println("");

        System.out.println("5. Get klub ini berada di liga apa by nama klub");
        dua1.getNamaKlub();
        System.out.println("Klub                : " + dua1.getNamaKlub());
        System.out.println("Berada pada liga    : " + dua1.getLiga());
        System.out.println("");

        System.out.println("Liga : " +japan.getNamaLiga());
        System.out.println("Klub : " +japan.getDaftarKlub());

    }
}