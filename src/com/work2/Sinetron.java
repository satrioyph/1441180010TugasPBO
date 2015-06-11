package com.work2;

/**
 * Created by satrio yudha on 11/06/2015.
 */
public class Sinetron {
    private String namaSinetron;
    private String phSinetron;
    private int tahunProduksi;
    private Aktor peranan;
    private String hariTayang;

    public Sinetron (){

    }

    public Sinetron(String namaSinetron, String hariTayang, String phSinetron) {
        this.namaSinetron = namaSinetron;
        this.hariTayang = hariTayang;
        this.phSinetron = phSinetron;
    }

    public Sinetron(String namaSinetron, String phSinetron, int tahunProduksi, Aktor peranan, String hariTayang) {
        this.namaSinetron = namaSinetron;
        this.phSinetron = phSinetron;
        this.tahunProduksi = tahunProduksi;
        this.peranan = peranan;
        this.hariTayang = hariTayang;
    }

    public String getNamaSinetron() {
        return namaSinetron;
    }

    public void setNamaSinetron(String namaSinetron) {
        this.namaSinetron = namaSinetron;
    }

    public String getPhSinetron() {
        return phSinetron;
    }

    public void setPhSinetron(String phSinetron) {
        this.phSinetron = phSinetron;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public Aktor getPeranan() {
        return peranan;
    }

    public void setPeranan(Aktor peranan) {
        this.peranan = peranan;
    }

    public String getHariTayang() {
        return hariTayang;
    }

    public void setHariTayang(String hariTayang) {
        this.hariTayang = hariTayang;
    }

    @Override
    public String toString() {
        return "Sinetron{" +
                "namaSinetron='" + namaSinetron + '\'' +
                ", phSinetron='" + phSinetron + '\'' +
                ", tahunProduksi=" + tahunProduksi +
                ", peranan=" + peranan +
                ", hariTayang='" + hariTayang + '\'' +
                '}';
    }
}
