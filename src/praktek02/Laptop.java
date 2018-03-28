
package praktek02;

public class Laptop {
    String  Merek;
    Integer Harga;
    Integer Stok;
    Integer Modal;

    public Laptop() {
        Merek    = "LENOVO";
        Harga    = 11000000;
        Stok     = 2;
        Modal    = 7000000;
    }

    public Laptop(String Merek, Integer Harga, Integer Stok, Integer Modal) {
        this.Merek = Merek;
        this.Harga = Harga;
        this.Stok = Stok;
        this.Modal = Modal;
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