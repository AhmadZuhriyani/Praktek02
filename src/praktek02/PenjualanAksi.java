
package praktek02;

public class PenjualanAksi {
    public static void main(String[] args) {
        Laptop R1 = new Laptop();
        Laptop R2 = new Laptop();
        
        
        System.out.println("HARGA LAPTOP ASUS");
        R1.Merek    = "ASUS";
        R1.Harga    = 10000000;
        R1.Stok     = 10;
        R1.Modal    = 8000000;
            R1.Penjualan();
           
        System.out.println("HARGA LAPTOP ACER");
        R2.Merek    = "ACER";
        R2.Harga    = 9000000;
        R2.Stok     = 4;
        R2.Modal    = 6000000;
            R2.Penjualan(); 
         
        //R1.Penjualan();
        System.out.println("Laba jual ASUS   ="+R1.HitungLaba());
            R1.CetakLaba();
        //R2.Penjualan();
        System.out.println("Laba jual ACER   ="+R2.HitungLaba());
            R2.CetakLaba();
    }
}
