
package praktek02;

public class Laptop {
    String  Merek;
    Integer Harga;
    Integer Stok;
    Integer Modal;

    public Laptop() {
        Merek    = "ASUS";
        Harga    = 10000000;
        Stok     = 10;
        Modal    = 8000000;
    }
    
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
   void CetakLaba(){
       System.out.println("Keuntungan sebanyak: "+HitungLaba());
}
}