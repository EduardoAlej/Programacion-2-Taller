import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido,
                                int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.primerNombre    = primerNombre;
        this.apellido        = apellido;
        this.diaNacimiento   = diaNacimiento;
        this.mesNacimiento   = mesNacimiento;
        this.anioNacimiento  = anioNacimiento;
    }

    // Setters
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public void setApellido(String apellido)         { this.apellido = apellido; }
    public void setDiaNacimiento(int dia)            { this.diaNacimiento = dia; }
    public void setMesNacimiento(int mes)            { this.mesNacimiento = mes; }
    public void setAnioNacimiento(int anio)          { this.anioNacimiento = anio; }

    // Getters
    public String getPrimerNombre() { return primerNombre; }
    public String getApellido()     { return apellido; }
    public int getDiaNacimiento()   { return diaNacimiento; }
    public int getMesNacimiento()   { return mesNacimiento; }
    public int getAnioNacimiento()  { return anioNacimiento; }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNac = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        int edad = hoy.getYear() - fechaNac.getYear();
        if (hoy.getDayOfYear() < fechaNac.getDayOfYear()) edad--;
        return edad;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double[] calcularFrecuenciaEsperada() {
        int max = calcularFrecuenciaMaxima();
        return new double[]{ max * 0.50, max * 0.85 };
    }
}
