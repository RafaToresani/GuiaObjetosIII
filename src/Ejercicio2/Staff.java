package Ejercicio2;

public class Staff extends Persona{
    private int salario;
    private String turno;

    //========= METODOS ===========

    public Staff(String dni, String nombre, String apellido, String email, String direccion, int salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public void mostrarStaff(){
        System.out.println(
                "\nNombre: " + this.getNombre() + " " + this.getApellido() +
                        "\nDNI: " + this.getDni() +
                        "\nEmail: " + this.getEmail() +
                        "\nDireccion: " + this.getDireccion() +
                        "\nSalario: " + this.getSalario()+
                        "\nTurno: " + this.getTurno()
        );
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
