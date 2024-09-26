public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String kirimPesan) {
        System.out.println("Mengirim Pesan: " + kirimPesan + ", Ke Nomor: " + nomorTujuan + ".");
    }
    
    public void kirimPesan(String EmailTujuan,String Subjek, String kirimPesan) {
        System.out.println("Mengirim Pesan: " + kirimPesan + ", Subjek: " + Subjek + ", Ke Email: " + EmailTujuan + ".");
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}