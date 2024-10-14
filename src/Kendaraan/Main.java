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
         mobil.setJumlah_pintu("4");
         
         System.out.println("\t Mobil");
         System.out.println("Tipe                : " + mobil.gettipe());
         System.out.println("Kapasitas Penumpang : " + mobil.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + mobil.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + mobil.getbahan_bakar());
         System.out.println("Fitur               : " + mobil.getfitur());
         System.out.println("Jumlah Pintu        : " + mobil.getJumlah_pintu());
         
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
         motor.setJenis_mesin("2 tak");
         
         System.out.println("\t Motor");
         System.out.println("Tipe                : " + motor.gettipe());
         System.out.println("Kapasitas Penumpang : " + motor.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + motor.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + motor.getbahan_bakar());
         System.out.println("Fitur               : " + motor.getfitur());
         System.out.println("Jenis Mesin         : " + motor.getJenis_mesin());
         
         Zainul_Keretaapi keretaapi = new Zainul_Keretaapi();
         
         keretaapi.settipe("Kereta Api Maglev");
         keretaapi.setkapasitas_penumpang("600 Orang");
         keretaapi.setkecepatan_maksimal("600 KM");
         keretaapi.setbahan_bakar("Listrik");
         keretaapi.setfitur("Kecepatan Tinggi, AC, USB Charger");
         
         System.out.println("\t Kereta Api");
         System.out.println("Tipe                : " + keretaapi.gettipe());
         System.out.println("Kapasitas Penumpang : " + keretaapi.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + keretaapi.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + keretaapi.getbahan_bakar());
         System.out.println("Fitur               : " + keretaapi.getfitur());

         Lutfi_Truk truk = new Lutfi_Truk();
         
         truk.settipe("Truk Box");
         truk.setkapasitas_penumpang("2 Orang");
         truk.setkecepatan_maksimal("160 KM");
         truk.setbahan_bakar("Solar");
         truk.setfitur("Sistem Navigasi, Kamera Belakang, Kontrol Stabilitas");
         
         System.out.println("\t Truk ");
         System.out.println("Tipe                : " + truk.gettipe());
         System.out.println("Kapasitas Penumpang : " + truk.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + truk.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + truk.getbahan_bakar());
         System.out.println("Fitur               : " + truk.getfitur());
         
         Roni_Pesawat pesawat = new Roni_Pesawat();
         
         pesawat.settipe("Pesawat Komersial");
         pesawat.setkapasitas_penumpang("550 Orang");
         pesawat.setkecepatan_maksimal("950 KM");
         pesawat.setbahan_bakar("Avtur");
         pesawat.setfitur("Kabin, AC, Toilet");
         pesawat.setJenis_sayap("Sayap Tetap");
         
         System.out.println("\t Pesawat");
         System.out.println("Tipe                : " + pesawat.gettipe());
         System.out.println("Kapasitas Penumpang : " + pesawat.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + pesawat.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + pesawat.getbahan_bakar());
         System.out.println("Fitur               : " + pesawat.getfitur());
         System.out.println("Jenis Sayap         : " + pesawat.getJenis_sayap());
         
         Yusron_Bus bus = new Yusron_Bus();
         
         bus.settipe("Bus Pariwisata");
         bus.setkapasitas_penumpang("60 Orang");
         bus.setkecepatan_maksimal("110 KM");
         bus.setbahan_bakar("Solar");
         bus.setfitur("DVD Player, Wi-Fi, Toilet");
         bus.setKelas_penumpang("Bus Ekonomi");
         
         System.out.println("\t Bus");
         System.out.println("Tipe                : " + bus.gettipe());
         System.out.println("Kapasitas Penumpang : " + bus.getkapasitas_penumpang());
         System.out.println("Kecepatan Maksimal  : " + bus.getkecepatan_maksimal());
         System.out.println("Bahan Bakar         : " + bus.getbahan_bakar());
         System.out.println("Fitur               : " + bus.getfitur());
         System.out.println("Kelas Penumpang     : " + bus.getKelas_penumpang());
    }
}
