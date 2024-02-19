//Scrivere un programma che contenga una classe che definisce un Auto che abbia
// come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà della classe auto accessibili
// solo attraverso i metodi.

public class Main {
    public static void main(String[] args) {

        Car luXuryCar = new Car("Ferrari", "FxxEVO", "f£rR1xP", 40200);
        System.out.println("LuXuryCar brand name : " + luXuryCar.getBrand() + "\n" +
                "LuXuryCar model name : " + luXuryCar.getModel() + "\n" + "Plate of the LuXuryCar : " + luXuryCar.getPlate() +
                "\n" + "Machine displacement : " + luXuryCar.getDisplacement()
        );

        System.out.println("LuXuryCar after set " + "\n" + "LuXuryCar brand name : " + luXuryCar.setBrand("Fiat") + "\n"
                + "LuXuryCar model name : " + luXuryCar.setModel("punto") + "\n"
                + "Plate of the LuXuryCar : " + luXuryCar.setPlate("IT") + "\n"
                + "Machine displacement : " + luXuryCar.setDisplacement(23134)
        );
    }

}
