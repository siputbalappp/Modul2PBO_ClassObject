/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankberaksi;

/**
 *
 * @author Zarif Afzal R
 */
public class Bank {
    protected int saldo; //konstruktor
    public Bank(int saldo){ 
        this.saldo = saldo;
        System.out.println("Selamat Datang ABC");
        getSaldo();
    } 
    public void simpanUang(int inputsaldo){ //method
        this.saldo = inputsaldo + this.saldo;
        System.out.println("Simpan Uang : Rp. " + inputsaldo);
        getSaldo();
    }
    public void ambilUang(int inputsaldo){ //method
        this.saldo = this.saldo - inputsaldo;
        System.out.println("Ambil Uang : Rp. " + inputsaldo);
        getSaldo();
    }
    public void getSaldo(){ //metho
        System.out.println("saldo saat ini : Rp. " + saldo);
        System.out.println("");
    }
}
