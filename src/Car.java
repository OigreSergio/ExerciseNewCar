public class Car {
    private String brand;

    private String model;

    private String plate;

    private int displacement;

    public Car(String brand, String model, String plate, int displacement) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.displacement = displacement;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int setDisplacement(int newdisplacement) {
        this.displacement = newdisplacement;
        return newdisplacement;
    }

    public String setBrand(String newbrand) {
        this.brand = newbrand;
        return newbrand;
    }

    public String setPlate(String newplate) {
        this.plate = newplate;
        return newplate;
    }

    public String setModel(String newmodel) {
        this.model = newmodel;
        return newmodel;
    }
}
