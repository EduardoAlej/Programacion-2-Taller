import javax.swing.*;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        String nombre   = JOptionPane.showInputDialog("Primer nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String sexo     = JOptionPane.showInputDialog("Sexo (M / F):");
        int    dia      = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int    mes      = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento:"));
        int    anio     = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));
        double altura   = Double.parseDouble(JOptionPane.showInputDialog("Altura en cm (ej: 170):"));
        double peso     = Double.parseDouble(JOptionPane.showInputDialog("Peso en kg (ej: 68):"));

        PerfilMedico pm = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        double[] esperada = pm.calcularFrecuenciaEsperada();

        String resultado =
                "=== PERFIL MÉDICO — Ejercicio 3.17 ===\n\n" +
                        "Nombre          : " + pm.getPrimerNombre() + " " + pm.getApellido() + "\n" +
                        "Sexo            : " + pm.getSexo() + "\n" +
                        "Fecha nacimiento: " + pm.getDiaNacimiento() + "/" + pm.getMesNacimiento() + "/" + pm.getAnioNacimiento() + "\n" +
                        "Altura          : " + pm.getAltura() + " cm\n" +
                        "Peso            : " + pm.getPeso() + " kg\n\n" +
                        "Edad            : " + pm.calcularEdad() + " años\n" +
                        "IMC             : " + String.format("%.2f", pm.calcularIMC()) + " → " + pm.clasificarIMC() + "\n" +
                        "Frec. máxima    : " + pm.calcularFrecuenciaMaxima() + " ppm\n" +
                        "Rango esperado  : " + (int) esperada[0] + " – " + (int) esperada[1] + " ppm\n\n" +
                        "--- Tabla IMC ---\n" +
                        "Bajo peso  : < 18.5\n" +
                        "Normal     : 18.5 – 24.9\n" +
                        "Sobrepeso  : 25.0 – 29.9\n" +
                        "Obeso      : ≥ 30";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
