public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S24 Ultra");
        daftarHandphone[1] = new FeaturePhone("Esia", "Games");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            System.out.println();
            hp.nyalakan();
            hp.kirimPesan("089988776655", "Halo Pak");
            hp.kirimPesan("08123456789", "08987654321", "Hello Sir");

            // Kirim pesan menggunakan array nomor
            hp.kirimPesan("081122334455, 081212131415", "Monsieur");

            hp.matikan();
        }

        // Mengakses metode khusus dengan casting, termasuk kirimPesan ke email
        for (Handphone hp : daftarHandphone) {
            System.out.println();
            if (hp instanceof Smartphone) {
                // Cast objek ke tipe Smartphone
                Smartphone smartphone = (Smartphone) hp;
                smartphone.nyalakan();
                // Panggil metode aksesInternet
                smartphone.aksesInternet();
                smartphone.kirimPesan("08999666333", "Assalamualaikum Mister");
                // Panggil metode kirimPesan dengan array email
                smartphone.kirimPesan("Email1@gmail.com","Aku adalah Subjek", "Aku adalah pesan dari email");
                smartphone.matikan();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).nyalakan();
                ((FeaturePhone) hp).bukaCamera();
                ((FeaturePhone) hp).mainGameSnake();
                ((FeaturePhone) hp).matikan();
            }
        }
    }
}
