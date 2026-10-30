public class Teller extends PegawaiBank {
    private int jumlahTransaksi;

    public Teller(String id, String nama, double gajiPokok, int jumlahTransaksi) {
        super(id, nama, gajiPokok);
        this.jumlahTransaksi = jumlahTransaksi;
    }

    @Override
    public double hitungGajiTotal() {
        return gajiPokok + (jumlahTransaksi * 5000);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Transaksi: " + jumlahTransaksi);
        System.out.println("Total Gaji (Teller): " + hitungGajiTotal());
        System.out.println("-----------------------------------");
    }
}