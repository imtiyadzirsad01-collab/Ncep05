public class MainBank {
    public static void main(String[] args) {
        
        Teller teller = new Teller("T001", "budi", 4000000, 150);

        CustomerService cs = new CustomerService("CS001", "Siti", 4500000, 4);

        ManajerBank manajer1 = new ManajerBank("M001", "Andi", 8000000, true );

        ManajerBank manajer2 = new ManajerBank("M002", "Dewi", 8000000, false);

        System.out.println("=== DATA GAJI PEGAWAI BANK ===");
        teller.tampilkanInfo();
        cs.tampilkanInfo();
        manajer1.tampilkanInfo();
        manajer2.tampilkanInfo();
    }
}