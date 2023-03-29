package Ejercicio2;

public class Estudiante extends Persona{
    private String carrera;
    private int cuota;
    private int anioIngreso;

    //========= METODOS ===========
    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, String carrera, int cuota, int anioIngreso) {
        super(dni, nombre, apellido, email, direccion);
        this.carrera = carrera;
        this.cuota = cuota;
        this.anioIngreso = anioIngreso;
    }

    public void mostrarEstudiante(){
        System.out.println(
                "\nNombre: " + this.getNombre() + " " + this.getApellido() +
                "\nCarrera: " + this.getCarrera() +
                "\nDNI: " + this.getDni() +
                "\nEmail: " + this.getEmail() +
                "\nAño de ingreso: "+ this.getAnioIngreso()+
                "\nDireccion: " + this.getDireccion() +
                "\nCuota: " + this.getCuota()
        );
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
}
