public class CustomerService extends PegawaiBank {
    protected int ratingKepuasan;

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }

    @Override
    public double hitungGajiTotal() {
        return gajiPokok + (ratingKepuasan * 500000);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rating Kepuasan: " + ratingKepuasan);
        System.out.println("Total Gaji (Customer Service): " + hitungGajiTotal());
        System.out.println("-----------------------------------");
    }
}