package deitel13.negocio;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre,String apellido , double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        if(salario>0);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }

}


