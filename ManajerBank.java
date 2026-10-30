public class ManajerBank extends PegawaiBank {
    private boolean targetTercapai;

    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {
        super(id, nama, gajiPokok);
        this.targetTercapai = targetTercapai;
    }

    @Override
    public double hitungGajiTotal() {
        if (targetTercapai) {
            return gajiPokok + (gajiPokok * 0.20);
        } else {
            return gajiPokok;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Target Tercapai: " + (targetTercapai ? "Ya" : "Tidak"));
        System.out.println("Total Gaji (Manajer): " + hitungGajiTotal());
        System.out.println("-----------------------------------");
    }
}