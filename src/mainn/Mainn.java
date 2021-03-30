/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainn;

/**
 *
 * @author ASUS X450JN
 */
public class Mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Induk1 obj = new Induk1();
        //memanggil induk
        Anak1 object = new Anak1();
        //memanggil anak
        Induk1 objek = new Anak1();
        //mengambil value dari anak (setelah di upgrade)
        
        obj.nama();
        obj.kelas();
        obj.sekolah();
        // memanggil di kelas induk
        object.kelas();
        //memanggil di kelas anak
        objek.nama();
        objek.kelas();
        objek.sekolah();     
        //memperbarui value dari induk ke anak
    }
    
}
