/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan62.livingthing;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menmbuat Program LivingThing
 *
 */
public class PBO10K10119901Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human();
        h.setNama("Fauzan Muhammad Abdussalam");
        
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
}
