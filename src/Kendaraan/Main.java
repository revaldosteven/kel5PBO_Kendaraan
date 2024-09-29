/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Good_Poeple
 */
public class Main {
    public static void main(String[] args) {
         Revaldo_Mobil mobil = new Revaldo_Mobil();
         
         mobil.settipe("Honda Mobilio");
         mobil.setkapasitas_penumpang("7 Orang");
         mobil.setkecepatan_maksimal("180 KM");
         mobil.setbahan_bakar("Bensin");
         mobil.setfitur("AC, Airbags, ABS");
         
         System.out.println("\t Mobil");
         System.out.println("Tipe                : " + mobil.gettipe());
         System.out.println("Kapasitas Penumpang : " + mobil.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + mobil.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + mobil.getbahan_bakar());
         System.out.println("Fitur               : " + mobil.getfitur());
         
    }
}
