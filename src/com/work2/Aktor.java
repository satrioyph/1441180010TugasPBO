package com.work2;

public class Aktor {

    private String namaAktor;
    private String alamatAktor;
    private char jenisKelaminAktor;
    private String statusAktor;
    private String wargaNegaraAktor;
    private int umurAktor;
    private String peranAktor;

    public Aktor (){

    }

    public Aktor(String namaAktor, int umurAktor, String peranAktor, char jenisKelaminAktor) {
        this.namaAktor = namaAktor;
        this.umurAktor = umurAktor;
        this.peranAktor = peranAktor;
        this.jenisKelaminAktor = jenisKelaminAktor;
    }

    public Aktor(String namaAktor, String alamatAktor, char jenisKelaminAktor, String statusAktor, String wargaNegaraAktor, int umurAktor, String peranAktor) {
        this.namaAktor = namaAktor;
        this.alamatAktor = alamatAktor;
        this.jenisKelaminAktor = jenisKelaminAktor;
        this.statusAktor = statusAktor;
        this.wargaNegaraAktor = wargaNegaraAktor;
        this.umurAktor = umurAktor;
        this.peranAktor = peranAktor;
    }

    public String getNamaAktor() {
        return namaAktor;
    }

    public void setNamaAktor(String namaAktor) {
        this.namaAktor = namaAktor;
    }

    public String getAlamatAktor() {
        return alamatAktor;
    }

    public void setAlamatAktor(String alamatAktor) {
        this.alamatAktor = alamatAktor;
    }

    public char getJenisKelaminAktor() {
        return jenisKelaminAktor;
    }

    public void setJenisKelaminAktor(char jenisKelaminAktor) {
        this.jenisKelaminAktor = jenisKelaminAktor;
    }

    public String getStatusAktor() {
        return statusAktor;
    }

    public void setStatusAktor(String statusAktor) {
        this.statusAktor = statusAktor;
    }

    public String getWargaNegaraAktor() {
        return wargaNegaraAktor;
    }

    public void setWargaNegaraAktor(String wargaNegaraAktor) {
        this.wargaNegaraAktor = wargaNegaraAktor;
    }

    public int getUmurAktor() {
        return umurAktor;
    }

    public void setUmurAktor(int umurAktor) {
        this.umurAktor = umurAktor;
    }

    public String getPeranAktor() {
        return peranAktor;
    }

    public void setPeranAktor(String peranAktor) {
        this.peranAktor = peranAktor;
    }

    @Override
    public String toString() {
        return "Film ini di bintangi oleh : {" +
                "namaAktor='" + namaAktor + '\'' +
                ", alamatAktor='" + alamatAktor + '\'' +
                ", jenisKelaminAktor=" + jenisKelaminAktor +
                ", statusAktor='" + statusAktor + '\'' +
                ", wargaNegaraAktor='" + wargaNegaraAktor + '\'' +
                ", umurAktor=" + umurAktor +
                ", peranAktor='" + peranAktor + '\'' +
                '}';
    }
}
