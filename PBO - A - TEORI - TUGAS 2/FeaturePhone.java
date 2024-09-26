public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Feature Phone " + merk + " " + model + " sedang dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("Feature Phone " + merk + " " + model + " sedang dimatikan.");
    }

    public void bukaCamera() {
        System.out.println("Sedang membuka Camera.");
    }

    public void mainGameSnake() {
        System.out.println("Memainkan game Snake.");
    }
}