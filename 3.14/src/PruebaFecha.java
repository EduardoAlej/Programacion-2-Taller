import javax.swing.*;

public class PruebaFecha {
    public static void main(String[] args) {
        String mesStr = JOptionPane.showInputDialog("Ingrese el mes");
        int mes=Integer.parseInt(mesStr);
        String diaStr= JOptionPane.showInputDialog("Ingrese el dia: ");
        int dia=Integer.parseInt(diaStr);
        String añoStr=JOptionPane.showInputDialog("Ingrese el año");
        int año = Integer.parseInt(añoStr);
        Fecha fecha= new Fecha(mes,dia,año);
        String resultado = "Fecha\n"+ "Mes: "+fecha.getMes() +"\n"+"Dia: "+fecha.getDia() +"\n"+"año: "+ fecha.getAño();
        JOptionPane.showInputDialog(null,resultado,"Fecha",JOptionPane.INFORMATION_MESSAGE);
    }
}
