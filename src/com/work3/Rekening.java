package com.work3;

/**
 * Created by satrio yudha on 18/06/2015.
 */
public class Rekening {
    private Double SaldoRekening;

    public Rekening(Double SaldoRekening) {this.SaldoRekening = SaldoRekening; }


    public Double getSaldoRekening() { return SaldoRekening; }

    public void setSaldoRekening(Double saldoRekening) {this.SaldoRekening = SaldoRekening;}

    public void tarik (double tarik){
        // untuk mengurangi nilai saldo
        this.SaldoRekening = SaldoRekening - tarik;


    }

    public void  setor (double setor) {
        // unuk menambah nilai saldo
        this.SaldoRekening = SaldoRekening + setor;

    }

    @Override
    public String toString() {
        return "Rekening{" +
                "SaldoRekening=" + SaldoRekening +
                '}';
    }
}