
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika vernanda = new Matematika(7, 3);
        
        // Menampilkan hasil operasi matematika
        System.out.println("Penjumlahan: " + vernanda.setPenjumlahan());
        System.out.println("Pengurangan: " + vernanda.setPengurangan());
        System.out.println("Perkalian: " + vernanda.setPerkalian());
        System.out.println("Pembagian: " + vernanda.setPembagian());
    }
}
