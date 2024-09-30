/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author na
 */
public class Isna_Motor {
    String tipe,kapasitas_penumpang,bahan_bakar,kecepatan_maksimal,fitur;
    
    public void settipe(String tipe){
        this.tipe = tipe;
    }
    
    public String gettipe(){
        return tipe;
    }
    
    public void setkapasitas_penumpang(String kapasitas_penumpang){
        this.kapasitas_penumpang = kapasitas_penumpang;
    }
    
    public String getkapasitas_penumpang(){
        return kapasitas_penumpang;
    }
    
    public void setbahan_bakar(String bahan_bakar){
        this.bahan_bakar = bahan_bakar;
    }
    
    public String getbahan_bakar(){
        return bahan_bakar;
    }
    
    public void setkecepatan_maksimal(String kecepatan_maksimal){
        this.kecepatan_maksimal = kecepatan_maksimal;
        
    }
    
    public String getkecepatan_maksimal(){
        return kecepatan_maksimal;
    }
    
    public void setfitur(String fitur){
        this.fitur = fitur;
    }
    
    public String getfitur(){
        return fitur;
    }
}
