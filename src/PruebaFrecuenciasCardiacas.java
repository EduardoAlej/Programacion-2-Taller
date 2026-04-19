import javax.swing.*;

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {

        String nombre   = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        int dia  = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int mes  = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));

        FrecuenciasCardiacas fc = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);
        double[] esperada = fc.calcularFrecuenciaEsperada();

        String resultado =
                "=== RESULTADOS — Ejercicio 3.16 ===\n" +
                        "Nombre          : " + fc.getPrimerNombre() + " " + fc.getApellido() + "\n" +
                        "Fecha nacimiento: " + fc.getDiaNacimiento() + "/" + fc.getMesNacimiento() + "/" + fc.getAnioNacimiento() + "\n" +
                        "Edad            : " + fc.calcularEdad() + " años\n" +
                        "Frec. máxima    : " + fc.calcularFrecuenciaMaxima() + " ppm\n" +
                        "Rango esperado  : " + (int) esperada[0] + " – " + (int) esperada[1] + " ppm";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
