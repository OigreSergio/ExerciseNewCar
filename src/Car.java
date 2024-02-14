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
    public String getPlate(){
        return plate;
    }

    public int getDisplacement() {
        return displacement;
    }

}
