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
         
         Wifna_Kapal kapal = new Wifna_Kapal();
         
         kapal.settipe("Kapal Feri");
         kapal.setkapasitas_penumpang("800 Orang");
         kapal.setkecepatan_maksimal("45 knot/83 KM");
         kapal.setbahan_bakar("Diesel");
         kapal.setfitur("Kamar Tidur, Restoran, Kolam Renang, Hiburan Live, Fasilitas Penyelamatan Darurat ");
         
         System.out.println("\t Kapal");
         System.out.println("Tipe                : " + kapal.gettipe());
         System.out.println("Kapasitas Penumpang : " + kapal.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + kapal.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + kapal.getbahan_bakar());
         System.out.println("Fitur               : " + kapal.getfitur());

         Isna_Motor motor = new Isna_Motor();
         
         motor.settipe("Yamaha Aerox");
         motor.setkapasitas_penumpang("2 Orang");
         motor.setkecepatan_maksimal("160 KM");
         motor.setbahan_bakar("Bensin");
         motor.setfitur("CBS/ABS, Electric Starter, Lampu LED");
         
         System.out.println("\t Motor");
         System.out.println("Tipe                : " + motor.gettipe());
         System.out.println("Kapasitas Penumpang : " + motor.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + motor.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + motor.getbahan_bakar());
         System.out.println("Fitur               : " + motor.getfitur());

    }
}
