public class Wing implements IWing {
    private int length;
    private String manufacturer;

    @Override
    public void calibrate() {
        System.out.println("Flugzeug kalibriert");
    }

    public Wing(int length, String manufacturer) {
        this.length = length;
        this.manufacturer = manufacturer;
    }
}
