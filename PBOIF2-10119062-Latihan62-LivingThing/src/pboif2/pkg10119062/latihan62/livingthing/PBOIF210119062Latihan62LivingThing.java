/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * living thing
 */
public class PBOIF210119062Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human objHuman=new Human();
        objHuman.setNama("Rizki Adam Kurniawan");
        
        objHuman.walk(objHuman.getNama());
        objHuman.breath(objHuman.getNama());
        objHuman.eat(objHuman.getNama());
    }

}
