package hitung;

public class Matematika {
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method untuk mengembalikan hasil penjumlahan bil1 + bil2
    public double setPenjumlahan() {
        return bil1 + bil2;
    }
}
