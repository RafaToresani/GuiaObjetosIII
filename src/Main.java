import Ejercicio1.Cilindro;
import Ejercicio1.Circulo;
import Ejercicio2.Estudiante;
import Ejercicio2.Persona;
import Ejercicio2.Staff;

public class Main {
    public static void main(String[] args) {
        System.out.println("================= Ejecicio 1 =================");
        Cilindro cilindro = new Cilindro();
        Cilindro cilindro2 = new Cilindro(2.0f, "verde", 2f);
        System.out.println(
                "Cilindro\nRadio: " + cilindro.getRadio() +
                "\nAltura: " + cilindro.getAltura() +
                "\nArea de la base: " + cilindro.calcularArea() +
                "\nVolumen: " + cilindro.calcularVolumen()
        );
        System.out.println(
                "\n\nCilindro2\nRadio: " + cilindro2.getRadio() +
                        "\nAltura: " + cilindro2.getAltura() +
                        "\nArea de la base: " + cilindro2.calcularArea() +
                        "\nVolumen: " + cilindro2.calcularVolumen()
        );

        System.out.println("Area de un cilindro:" + cilindro2.calcularArea());

        System.out.println("================= Ejecicio 1 =================");
        Persona est1 = new Estudiante("121456421", "josesito", "pereyra", "josepereyta@gmail.com", "asd 123", "psicologia", 15000, 2005);
        Persona est2 = new Estudiante("126456451", "jose", "pereyra", "josepereyta@gmail.com", "asd 123", "psicologia", 12500, 2005);
        Persona est3 = new Estudiante("124564551", "klee", "pereyra", "josepereyta@gmail.com", "asd 123", "psicologia", 18000, 2005);
        Persona est4 = new Estudiante("156778868", "pooo", "pereyra", "josepereyta@gmail.com", "asd 123", "psicologia", 11111, 2005);
        Persona staff1 = new Staff("15651654", "pablo", "ruben", "asdas@gmail.com", "asd 12354", 33000,"noche");
        Persona staff2 = new Staff("17891233", "jose", "ruben", "asdas@gmail.com", "asd 12354", 33000,"noche");
        Persona staff3 = new Staff("13452213", "pedro", "ruben", "asdas@gmail.com", "asd 12354", 33000,"noche");
        Persona staff4 = new Staff("11235466", "pasdas", "ruben", "asdas@gmail.com", "asd 12354", 33000,"noche");

        Persona[] personas = new Persona[8];
        personas[0] = est1;
        personas[1] = est2;
        personas[2] = est3;
        personas[3] = est4;
        personas[4] = staff3;
        personas[5] = staff2;
        personas[6] = staff1;
        personas[7] = staff4;

    }
}