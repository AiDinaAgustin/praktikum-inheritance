/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class Percobaan2{
public class Pegawai {
        String nama; //Karena pada awalnya atribut nama menggunakan modifier private, yang membuat atribut parent tersebut tidak bisa diakses oleh child class nya
        public double gaji;
    }

public class Manajer extends Pegawai {
    public String departemen;

    public void IsiData(String n, String d) {
        nama=n; 
        departemen=d;
    }
}
}
