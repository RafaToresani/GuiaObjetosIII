package Ejercicio1;

public class Circulo {
    private float radio;
    private String color;
    //======== Métodos =========
    public Circulo(float radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        this.color="rojo";
        this.radio=1.0f;
    }

    public double calcularArea(){
        return Math.PI*(this.radio*this.radio);
    }

    public void mostrarCaracteristicas(){
        System.out.println(
                "Radio: " + this.radio +
                "\nColor: " + this.color
        );
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }
}
