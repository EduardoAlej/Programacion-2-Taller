import java.time.LocalDate;

public class PerfilMedico {

    private String primerNombre;
    private String apellido;
    private String sexo;
    private int    diaNacimiento;
    private int    mesNacimiento;
    private int    anioNacimiento;
    private double altura;   // en centímetros
    private double peso;     // en kilogramos

    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int dia, int mes, int anio,
                        double altura, double peso) {
        this.primerNombre   = primerNombre;
        this.apellido       = apellido;
        this.sexo           = sexo;
        this.diaNacimiento  = dia;
        this.mesNacimiento  = mes;
        this.anioNacimiento = anio;
        this.altura         = altura;
        this.peso           = peso;
    }

    // Setters
    public void setPrimerNombre(String v)  { primerNombre = v; }
    public void setApellido(String v)      { apellido = v; }
    public void setSexo(String v)          { sexo = v; }
    public void setDiaNacimiento(int v)    { diaNacimiento = v; }
    public void setMesNacimiento(int v)    { mesNacimiento = v; }
    public void setAnioNacimiento(int v)   { anioNacimiento = v; }
    public void setAltura(double v)        { altura = v; }
    public void setPeso(double v)          { peso = v; }

    // Getters
    public String getPrimerNombre()  { return primerNombre; }
    public String getApellido()      { return apellido; }
    public String getSexo()          { return sexo; }
    public int    getDiaNacimiento() { return diaNacimiento; }
    public int    getMesNacimiento() { return mesNacimiento; }
    public int    getAnioNacimiento(){ return anioNacimiento; }
    public double getAltura()        { return altura; }
    public double getPeso()          { return peso; }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nac = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        int edad = hoy.getYear() - nac.getYear();
        if (hoy.getDayOfYear() < nac.getDayOfYear()) edad--;
        return edad;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double[] calcularFrecuenciaEsperada() {
        int max = calcularFrecuenciaMaxima();
        return new double[]{ max * 0.50, max * 0.85 };
    }

    public double calcularIMC() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }

    public String clasificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5)      return "Bajo peso";
        else if (imc < 25.0) return "Normal";
        else if (imc < 30.0) return "Sobrepeso";
        else                 return "Obeso";
    }
}
