
package praktek02;

public class Laptop {
    String  Merek;
    Integer Harga;
    Integer Stok;
    Integer Modal;
    
     
    void Penjualan(){
        System.out.println("======================");
        System.out.println("Merek   :"  +Merek);
        System.out.println("Harga   :"  +Harga);
        System.out.println("Stok    :"  +Stok);
        System.out.println("Modal   :"  +Modal);
        System.out.println("======================");
    }
    
   Integer HitungLaba(){
       Integer Laba;
       Laba=Harga-Modal;
       return Laba;
   }
}
