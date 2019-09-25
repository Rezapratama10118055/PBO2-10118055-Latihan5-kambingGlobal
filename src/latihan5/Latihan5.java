/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author User
 * NAMA:REZA PRATAMA
 * KELAS:PBO2
 * NIM:10118055
 * Deskripsi:program ini berisi program untuk menampilkan
 * jenis jenis data bilangan bulat
 */
public class Latihan5 {
int jumlahKambing=88;


   public void kambingAwal(){
       int jualKambing=88;
     System.out.println("jumlah kambing awal:"+jualKambing);
   }
           
   
     public  void getKambing() {
          System.out.println("Jumlah kambing:"+jumlahKambing);
          
     }
     public void tambahKambing() {
        jumlahKambing = jumlahKambing+5;
        System.out.println("jumlah kambing setelah ditambah:"+jumlahKambing);
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan5 kambingSusu = new Latihan5();
        
        kambingSusu.kambingAwal();
                
        kambingSusu.tambahKambing();
        
        kambingSusu.getKambing();
    
    }
    
}
