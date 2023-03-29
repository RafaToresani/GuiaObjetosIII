package Ejercicio1;

public class Cilindro extends Circulo{
    private float altura;

    public Cilindro(float radio, String color, float altura) {
        super(radio, color);
        this.altura = altura;
    }
    public Cilindro() {
        super(1.0f, "rojo");
        this.altura = 1.0f;
    }
    public double calcularVolumen(){
        return super.calcularArea()*this.altura;
    }
    @Override
    public double calcularArea(){
        return 2*Math.PI*this.altura+2*Math.PI*this.getRadio()*this.getRadio();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
