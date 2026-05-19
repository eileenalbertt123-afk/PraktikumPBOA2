public class MainManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Satriyo","01-04-2006","Jl. Seroja",15000000,"198302032006041002");
        pengusaha pe1 = new pengusaha("Adhy","01-01-2000","Jl.Air",5500000,"000-556-773-212-000-5");
        petani pt1 = new petani("Nugraha","09-01-1977","Jl. Bunga 9 Tembalang",5000000,"Wonogiri");
        PNS p2 = new PNS("Panji","01-04-2010", "Semarang",10000000,"198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMhs());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}