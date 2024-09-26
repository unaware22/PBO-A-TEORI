public class Handphone {
    protected String merk;
    protected String model;
    
    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String kirimPesan){
        System.out.println("Mengirim Pesan: " + kirimPesan + ", ke Nomor: " + nomorTujuan + ".");
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String kirimPesan){
        System.out.println("Mengirim Pesan: " + kirimPesan + ", ke Nomor: " + nomorTujuan1 + ", dan " + nomorTujuan2 + ".");
    }

    public void kirimPesan(String[] daftarNomor, String kirimPesan){
        System.out.println("Mengirim Pesan: " + kirimPesan + ", dengan Daftar Nomor: " + daftarNomor + ".");
    }
}